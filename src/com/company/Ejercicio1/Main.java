package com.company.Ejercicio1;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ejercicio1();

    }
    public static void ejercicio1()
    {
        /// Ejercicio A
        Circulo circuloA = new Circulo();
        System.out.println(circuloA.mostrarCirculo());
        Cilindro cilindroA = new Cilindro();
        System.out.println(cilindroA.mostrarCilindro());

        /// Ejercicio B
        Circulo cirbuloB = new Circulo(2.5, "Azul");
        System.out.println(cirbuloB.mostrarCirculoYArea());
        Cilindro cilindroB = new Cilindro(2.5, "Azul", 1.5);
        System.out.println(cilindroB.mostrarCilindroYVolumen());

        /// Ejercicio C
        System.out.println(cilindroB.mostrarAreaCilindro());

        System.out.println("Mostrando SUPERclase");
        System.out.println(cilindroB.mostrarSuperClase());
        

    }
}
