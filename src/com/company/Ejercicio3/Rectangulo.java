package com.company.Ejercicio3;

public class Rectangulo extends Figura {

    protected double altura;
    protected double base;

    public Rectangulo ()
    {
        super();
        this.altura = 0;
        this.base = 0;
    }
    public Rectangulo (String color, double alto, double ancho)
    {
        super(color);
        this.altura = alto;
        this.base = ancho;
    }

    public double getAlto() { return this.altura; }
    public double getAncho() { return this.base; }

    public void setAlto(double alto) { this.altura = alto; }
    public void setAncho(double ancho) { this.base = ancho; }

    @Override
    public String mostrarFigura () {

        if (this.color != null)
            return "Soy un Rectángulo de color " + this.color +
                ", mi alto es: " + this.altura + ", mi ancho es: " + this.base;
        else
            return "Soy un Rectángulo sin color, mi alto es: " + this.altura + ", mi ancho es: " + this.base;
    }

    public String mostrarRectanguloCompleto (double area, double perimetro)
    {
        return mostrarFigura()+"\nMi área es: " + area + " mi perímetro es: " + perimetro;
    }

    @Override
    public double calcularArea ()
    {
        return this.base*this.altura;
    }
    @Override
    public double calcularPerimetro()
    {
        return (2*(base+altura));
    }

}
