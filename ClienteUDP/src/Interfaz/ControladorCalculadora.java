package Interfaz;

import entidades.Cliente;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ControladorCalculadora {
    @FXML private TextField txtN1;
    @FXML private TextField txtN2;
    @FXML private Label lblSalida;

     private Double getNumer(TextField txt){
      try{
        return Double.parseDouble(txt.getText());
      }catch ( Exception e){
          lblSalida.setText("Error: solo números");
          return null;
      }
     }
    private void ejecutarOperacion(String operacion) {

        Double n1 = getNumer(txtN1);
        Double n2 = getNumer(txtN2);

        if (n1 == null || n2 == null) return;

        new Thread(() -> {
            try {
                Cliente cliente = new Cliente();

                String respuesta = cliente.enviar(
                        "192.168.100.55",
                        5000,
                        n1,
                        n2,
                        operacion
                );

                Platform.runLater(() ->
                        lblSalida.setText(n1 + " " + operacion + " " + n2 + " = " + respuesta)
                );

            } catch (Exception e) {
                Platform.runLater(() ->
                        lblSalida.setText("Error: servidor no disponible")
                );
            }
        }).start();
    }

     @FXML private void sumar(){
         ejecutarOperacion("sumar");
     }
     @FXML private void restar(){
         ejecutarOperacion("restar");
     }
     @FXML private void multiplicar(){
         ejecutarOperacion("multiplicar");
     }
     @FXML private void dividir(){
         Double N2 = getNumer(txtN2);
         if(N2 == null) return;
         if (N2 == 0) {
                lblSalida.setText("Error: No se puede dividir entre 0");
         }else {
             ejecutarOperacion("dividir");
         }
         
     }
}