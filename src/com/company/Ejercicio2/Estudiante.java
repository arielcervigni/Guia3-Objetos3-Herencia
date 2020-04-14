package com.company.Ejercicio2;

public class Estudiante extends Persona {

    protected int anioIngreso;
    protected int cuotaMensual;
    protected String carrera;

    public Estudiante ()
    {
        super();
        this.anioIngreso = 0;
        this.cuotaMensual = 0;
        this.carrera = "\n";
    }
    public Estudiante (int dni, String nombre, String apellido, String email, String direccion, int ingreso, int cuota, String carrera)
    {
        super(dni, nombre, apellido, email, direccion);
        this.anioIngreso = ingreso;
        this.cuotaMensual = cuota;
        this.carrera = carrera;
    }

    public int getAnioIngreso () { return this.anioIngreso; }
    public int getCuotaMensual () { return this.cuotaMensual; }
    public String getCarrera () { return this.carrera; }

    public void setAnioIngreso (int ingreso) { this.anioIngreso = ingreso; }
    public void setCuotaMensual (int cuota) { this.cuotaMensual = cuota; }
    public void setCarrera (String carrera) { this.carrera = carrera; }

    public String mostrarEstudiante ()
    {
        String persona = super.mostrarPersona();
        return  persona +
                "\nAño de ingreso: " + this.anioIngreso +
                "\nCuota Mensual: " + this.cuotaMensual +
                "\nCarrera: " + this.carrera;
    }


}
