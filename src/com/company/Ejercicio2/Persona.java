package com.company.Ejercicio2;

public class Persona {

    protected int DNI;
    protected String nombre;
    protected String apellido;
    protected String email;
    protected String direccion;

    public Persona ()
    {
        this.DNI = 0;
        this.nombre = "\n";
        this.apellido = "\n";
        this.email = "\n";
        this.direccion = "\n";
    }
    public Persona (int dni, String nombre, String apellido, String email, String direccion)
    {
        this.DNI = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.direccion = direccion;
    }

    public int getDNI () { return this.DNI; }
    public String getNombre () { return this.nombre; }
    public String getApellido () { return this.apellido; }
    public String getEmail () { return  this.email; }
    public String getDireccion () { return  this.direccion; }

    public void setDNI (int dni) { this.DNI = dni; }
    public void setNombre (String nombre) { this.nombre = nombre; }
    public void setApellido (String apellido) { this.apellido = apellido; }
    public void setEmail (String email) { this.email = email; }
    public void setDireccion (String direccion) { this.direccion = direccion; }

    public String mostrarPersona ()
    {
        return "Persona: " +
                "\nDNI: " + this.DNI +
                "\nNombre: " + this.nombre +
                "\nApellido: " + this.apellido +
                "\nEmail: " + this.email +
                "\nDireccion: " + this.direccion;
    }

}
