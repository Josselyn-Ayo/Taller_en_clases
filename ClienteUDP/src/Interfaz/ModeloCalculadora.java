package Interfaz;

public class ModeloCalculadora {
    public double sumar(double N1, double N2) {
        return N1 + N2;
    }
    public double restar(double N1, double N2) {
        return N1 - N2;
    }
    public double multiplicar(double N1, double N2) {
        return N1 * N2;
    }
    public double dividir(double N1, double N2) {
        if(N2 == 0) {
            return 0;
        } else {
            return N1 / N2;
        }

    }
}


