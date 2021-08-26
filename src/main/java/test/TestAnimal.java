package test;

import domain.Animal;

public class TestAnimal {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.setNombre("Paco");
        animal1.setTipo("Gato");
        System.out.println("animal1.getNombre() = " + animal1.getNombre());
        Animal animal2 = new Animal("Kill","Perro");

        System.out.println("animal2 = " + animal2);

                
    }
}
