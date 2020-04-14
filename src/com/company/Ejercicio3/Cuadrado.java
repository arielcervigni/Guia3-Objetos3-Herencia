package com.company.Ejercicio3;

import java.lang.annotation.Native;

public class Cuadrado extends Rectangulo {

    public Cuadrado ()
    {
        super();
    }
    public Cuadrado (String color, double base, double altura)
    {
        super (color, base, altura);
    }

    @Override
    public String mostrarFigura () {

        if (this.color != null)
            return "Soy un Cuadrado de color " + this.color +
                    ", mi alto es: " + this.altura + ", mi ancho es: " + this.base;
        else
            return "Soy un Cuadrado sin color, mi alto es: " + this.altura + ", mi ancho es: " + this.base;
    }
    @Override
    public String mostrarRectanguloCompleto (double area, double perimetro)
    {
        return mostrarFigura()+"\nMi área es: " + area + " mi perímetro es: " + perimetro;
    }

}
