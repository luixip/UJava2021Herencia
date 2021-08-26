package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan",5000.00);
        System.out.println("empleado = " + empleado);
        Cliente cliente = new Cliente("Paola",'F',40,"Cr 23 37-17 Apto 502",new Date(),true);
        System.out.println("cliente = " + cliente);
    }
}
