package com.company.Ejercicio2;

public class Staff extends Persona {

    protected double salario;
    protected char turno;

    public Staff ()
    {
        super();
        this.salario = 0;
        this.turno = '\0';
    }
    public Staff (int dni, String nombre, String apellido, String email, String direccion, double salario, char turno)
    {
        super(dni,nombre,apellido,email,direccion);
        this.salario = salario;
        this.turno = turno;
    }

    public double getSalario () { return  this.salario; }
    public char getTurno () { return  this.turno; }

    public void setSalario (double salario) { this.salario = salario; }
    public void setTurno (char turno) { this.turno = turno; }

    public double salarioAnual () { return this.salario*12; }

    public String mostrarStaff ()
    {
        String persona = super.mostrarPersona();
        double salarioAnual = salarioAnual();
        return persona +
                "\nSalario: " + this.salario +
                "\nSalario anual: " + salarioAnual +
                "\nTurno: " + this.turno;
    }

}
