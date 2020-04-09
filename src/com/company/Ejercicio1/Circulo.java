package com.company.Ejercicio1;


public class Circulo {

    static final double PI = 3.14159265359;
    private double radio;
    private String color;

    /// Constructores
    public Circulo ()
    {
        this.radio = 1.0;
        this.color = "Rojo";
    }
    public Circulo (double radio, String color)
    {
        this.radio = radio;
        this.color = color;
    }
    /// getters
    public double getRadio () { return this.radio; }
    public String getColor () { return this.color; }
    /// Setters
    public void setRadio (double radio) { this.radio = radio; }
    public void setColor (String color) { this.color = color; }
    /// Otros Metodos
    public String mostrarCirculo ()
    {
        return "Circulo: El radio del círculo es: " + getRadio() + " es de color " + getColor();
    }
    public double calcularArea ()
    {
        return PI*(getRadio()*getRadio());
    }
    public String mostrarCirculoYArea ()
    {
        double area = calcularArea();
        return "El radio del círculo es de: " + getRadio() + " y es de color " + getColor() + " Area: " + area + "\n";
    }

}
