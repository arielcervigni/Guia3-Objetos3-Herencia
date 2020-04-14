package com.company.Ejercicio3;

public abstract class Figura {

    public static final double PI = 3.14159265359;
    protected String color;

    public Figura ()
    {
        this.color = null;
    }
    public Figura (String color)
    {
        this.color = color;
    }

    public String getColor () { return this.color; }
    public void setColor (String color) { this.color = color; }

    public abstract String mostrarFigura ();

    public abstract double calcularArea();

    public abstract double calcularPerimetro ();
}
