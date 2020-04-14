package com.company.Ejercicio3;

public class Circulo extends Figura {

    protected double radio;


    public Circulo ()
    {
        super();
        this.radio = 0;
    }

    public Circulo (String color, double radio)
    {
        super(color);
        this.radio = radio;
    }

    public double getRadio() { return this.radio; }
    public void setRadio(double radio) { this.radio = radio; }

    @Override
    public String mostrarFigura ()
    {
        if (this.color != null)
            return "Soy un Circulo de color: " + this.color + ", mi radio es: " + this.radio;
        else
            return "Soy un Circulo sin color, mi radio es: " + this.radio;
    }
    public String mostrarCirculoCompleto (double area, double perimetro)
    {
        return mostrarFigura() + "\nMi Area es:  " + area + " y mi perímetro es: " + perimetro;
    }
    @Override
    public double calcularArea () { return PI*(this.radio*this.radio); }

    @Override
    public double calcularPerimetro() { return 2*PI*this.radio; }
}
