package test;

import entidades.Cliente;

import java.util.Scanner;

public class TestCliente {
    static void main(String[] args) throws Exception{
        Cliente cliente = new Cliente();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la operación");
        String operacion = scanner.nextLine();
        System.out.println("Ingrese el primer número: ");
        double n1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo número");
        double n2 = scanner.nextDouble();
        cliente.enviar("192.168.100.55",5000, n1,n2,operacion);
    }
}
