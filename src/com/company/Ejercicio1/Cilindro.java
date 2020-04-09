package com.company.Ejercicio1;

public class Cilindro extends Circulo {

    private double altura;

    public Cilindro (){
        super();
        this.altura = 1.0;
    }

    public Cilindro (double radio, String color, double altura)
    {
        super(radio, color);
        this.altura = altura;
    }

    public double getAltura () { return altura; }
    public void setAltura () { this.altura = altura; }

    public String mostrarCilindro()
    {
       return "Cilindro\nRadio: " + getRadio() + " Color: " + getColor() + " Altura: " + getAltura() + "\n";
    }
    public double calcularVolumen ()
    {
        double area = super.calcularArea();
        return area*altura;
        /*Modificar el método calcular  volumen en la clase cilindro para que llame al método
        de la ​SUPER​clase que calcula  el área. */
    }
    public String mostrarCilindroYVolumen()
    {
        double area = super.calcularArea();
        double volumen = calcularVolumen();
        return "Cilindro\nRadio: " + getRadio() + " Color: " + getColor() +
                " Altura: " + getAltura() + " Area: " + area + " Volumen: " + volumen;
    }
    public double calcularAreaCilindro ()
    {
        double areaBase = calcularArea();
        return  ((2*PI)*getRadio()*altura) + (2*areaBase);
    }
    public String mostrarAreaCilindro ()
    {
        double area = calcularAreaCilindro();
        return "El área del cilindro es: " + area;
    }

    @Override
    public double calcularArea ()
    {
       return ((2*PI*getRadio()*getAltura())+(2*PI*(getRadio()*getRadio())));
    }

    public String mostrarSuperClase ()
    {
        return "Cilindro: subclase de " + super.mostrarCirculo() + "y altura: " + getAltura();
    }

}
