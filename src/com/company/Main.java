package com.company;

import com.company.Ejercicio1.Cilindro;
import com.company.Ejercicio1.Circulo;
import com.company.Ejercicio2.Estudiante;
import com.company.Ejercicio2.Persona;
import com.company.Ejercicio2.Staff;
import com.company.Ejercicio3.Cuadrado;
import com.company.Ejercicio3.Rectangulo;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //ejercicio1();
        //ejercicio2();
        ejericio3();
    }
    public static void ejercicio1()
    {
        /// Ejercicio A
        Circulo circuloA = new Circulo();
        System.out.println(circuloA.mostrarCirculo());
        Cilindro cilindroA = new Cilindro();
        System.out.println(cilindroA.mostrarCilindro());

        /// Ejercicio B
        Circulo circuloB = new Circulo(2.5, "Azul");
        double areaB = circuloB.calcularArea();
        System.out.println(circuloB.mostrarCirculoYArea(areaB));
        Cilindro cilindroB = new Cilindro(2.5, "Azul", 1.5);
        areaB = cilindroB.calcularArea();
        double volumenB = cilindroB.calcularVolumen();
        System.out.println(cilindroB.mostrarCilindroYVolumen(areaB, volumenB));

        /// Ejercicio C
        System.out.println(cilindroB.mostrarAreaCilindro(areaB));

        System.out.println("Mostrando SUPERclase");
        System.out.println(cilindroB.mostrarSuperClase());


    }
    public static void ejercicio2()
    {
        Estudiante ariel = new Estudiante(37098210,"Ariel","Cervigni","arielcervigni@gmail.com","Buenos Aires 4675",2019,2300,"TUP");
        Estudiante julieta = new Estudiante(33912211, "Julieta", "Leuci", "julietaleuci@gmail.com", "Buenos Aires 4675", 2020, 2300, "Interiorismo");
        Estudiante alumno = new Estudiante(33333333, "unNombre","unApellido", "unnombre@gmail.com", "Calle Falsa 456", 2015,2500,"Ing Naval");
        Estudiante alumna = new Estudiante(22222222, "unaNombre","unaApellido", "unanombre@gmail.com", "Calle Falsa 789", 2017,1200,"Ing Pesquera");
        Staff profesor = new Staff(2700000,"Pepe","Argento","pepeargento@gmail.com", "Calle Falsa 123",30000,'N');
        Staff auxiliar = new Staff(25555555,"Pepita","Pistolera","pepitapistolera@gmail.com","Catamarca 888", 35800.88, 'M');
        Staff director = new Staff(2895850,"Leroy","Sane","leroySane@gmail.com","Manchester City 888", 358000.788, 'T');
        Staff sistemas = new Staff(2555855,"Cristiano","Ronaldo","cr7@gmail.com","Garay 6478", 35950.448, 'M');

        Persona [] arregloDePersonas = new Persona[8];
        arregloDePersonas[0] = ariel;
        arregloDePersonas[1] = julieta;
        arregloDePersonas[2] = alumno;
        arregloDePersonas[3] = alumna;
        arregloDePersonas[4] = profesor;
        arregloDePersonas[5] = auxiliar;
        arregloDePersonas[6] = director;
        arregloDePersonas[7] = sistemas;

        int i;
        int estudiantes = 0;
        int staffs = 0;
        int ingresos = 0;
        Estudiante unEstudiante;
        double ingreso =0;

        for (i=0; i<8;i++)
        {
            if (arregloDePersonas[i] instanceof Estudiante) {
                estudiantes++;
                unEstudiante = (Estudiante) arregloDePersonas[i];
                ingreso+= unEstudiante.getCuotaMensual();
            }
            else
                staffs++;
        }

        System.out.println("Estudiantes: " + estudiantes + " Staff: " + staffs);
        System.out.println("El establecimiento recibe $ " + ingreso + " mensuales");
    }
    public static void ejericio3()
    {
        com.company.Ejercicio3.Circulo unCirculo = new com.company.Ejercicio3.Circulo("Rojo",2.88);
        Rectangulo unRectangulo = new Rectangulo(null, 2.77,3.41);
        Cuadrado unCuadrado = new Cuadrado("Azul", 2, 2);
        double areaCirculo = unCirculo.calcularArea();
        double perimetroCirculo = unCirculo.calcularPerimetro();
        double areaRectangulo = unRectangulo.calcularArea();
        double perimetroRectangulo = unRectangulo.calcularPerimetro();
        double areaCuadrado = unCuadrado.calcularArea();
        double perimetroCuadrado = unCuadrado.calcularPerimetro();

        //System.out.println(unCirculo.mostrarFigura());
        //System.out.println(unRectangulo.mostrarFigura());

        System.out.println("------------------------ Circulo: ------------------------");
        System.out.println(unCirculo.mostrarCirculoCompleto(areaCirculo,perimetroCirculo));
        System.out.println("------------------------ Rectangulo ------------------------");
        System.out.println(unRectangulo.mostrarRectanguloCompleto(areaRectangulo,perimetroRectangulo));
        System.out.println("------------------------ Cuadrado ------------------------");
        System.out.println(unCuadrado.mostrarRectanguloCompleto(areaCuadrado,perimetroCuadrado));
        System.out.println("-----------------------------------------------------------");

    }
}