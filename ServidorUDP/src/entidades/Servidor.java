package entidades;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Servidor {
    private Modelo modelo = new Modelo();

    public void operar(int puerto) throws Exception {
        //Crear el socket  para datagrama
        DatagramSocket socket = new DatagramSocket(puerto);
        System.out.println("Servidor corriendo en el puerto: " + puerto);
        while (true) {

            // recibir peticion del cliente
            byte[] bufferE = new byte[1024];
            DatagramPacket entrada = new DatagramPacket(bufferE, bufferE.length);
            socket.receive(entrada);

            //procesar
            String recibido = new String(entrada.getData(), 0, entrada.getLength());
            String[] partes = recibido.trim().split(",");
            String operaciones = partes[0].toLowerCase();
            double n1 = Double.parseDouble(partes[1]);
            double n2 = Double.parseDouble(partes[2]);
            double resultado = 0;
            switch (operaciones){
                case "sumar":
                resultado =modelo.sumar(n1,n2);
                break;
                case "restar":
                    resultado =modelo.restar(n1,n2);
                    break;
                case "multiplicar":
                    resultado = modelo.multiplicar(n1, n2);
                    break;
                case "dividir":
                    if(n2 == 0){
                        String error = "Error: división por cero";
                        byte[] bufferError = error.getBytes();
                        DatagramPacket salidaError = new DatagramPacket(
                                bufferError,
                                bufferError.length,
                                entrada.getAddress(),
                                entrada.getPort());
                        socket.send(salidaError);
                        continue;
                    } else{
                        resultado =modelo.dividir(n1, n2);
                    }
                    break;
                default:
                    String error = "Operaciones no reconocida" + operaciones;
                    byte[] bufferError = error.getBytes();
                    DatagramPacket salidaError = new DatagramPacket(
                            bufferError,
                            bufferError.length,
                            entrada.getAddress(),
                            entrada.getPort());
                    socket.send(salidaError);
                    continue;
            }

            //devolver la solicitud
            byte[] bufferS = String.valueOf(resultado).getBytes();
            DatagramPacket salida = new DatagramPacket(
                    bufferS,
                    bufferS.length,
                    entrada.getAddress(),
                    entrada.getPort());
            socket.send(salida);
        }
    }


}
