/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadclass;

/**
 *
 * @author germa
 */
public class Persona {
    private String Tipo;
    private String Nombre;
    private int Edad;
    private char Sexo;
    private String Curp;
    private String Actividad;

    public Persona() {
    }

    public Persona(String Tipo, String Nombre, int Edad, char Sexo, String Curp, String Actividad) {
        this.Tipo = Tipo;
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.Curp = Curp;
        this.Actividad = Actividad;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    public String getCurp() {
        return Curp;
    }

    public void setCurp(String Curp) {
        this.Curp = Curp;
    }

    public String getActividad() {
        return Actividad;
    }

    public void setActividad(String Actividad) {
        this.Actividad = Actividad;
    }
    
    public void Entrada() {
        System.out.println("La entrada del alumno es a las 7:00 a.m");
        
    }
    
    public void Actividades() {
        System.out.println("El alumno tiene clases de programación, fisica,ingles y administración");
        
    }
    
    public void Receso() {
        System.out.println("El receso del alumno es a las 10:00 a.m");
        
    }
    
    public void Salida() {
        System.out.println("El alumno sale a las 13:00 p.m");
    }

    @Override
    public String toString() {
        return "Persona{" + "Tipo=" + Tipo + ", Nombre=" + Nombre + ", Edad=" + Edad + ", Sexo=" + Sexo + ", Curp=" + Curp + ", Actividad=" + Actividad + '}';
    }

    
}
