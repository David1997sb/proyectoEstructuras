/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_de_datos_educativo;

import java.util.Date;

/**
 *
 * @author Frander B.A
 */
public class Profesor { 
    
    private String Nombre;
    private String Apellido;
    private String Correo;
    private String Curso;
    private int id;
    private int Telefono;
    private int Edad;
   
    private Date fechaDeIngreso;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public Date getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public void setFechaDeIngreso(Date fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }

    public Profesor() {
    }

    public Profesor(String Nombre, String Apellido, String Correo, String Curso, int id, int Telefono, int Edad, Date fechaDeIngreso) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Correo = Correo;
        this.Curso = Curso;
        this.id = id;
        this.Telefono = Telefono;
        this.Edad = Edad;
        this.fechaDeIngreso = fechaDeIngreso;
    }

    @Override
    public String toString() {
        return "Profesor{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", Correo=" + Correo + ", Curso=" + Curso + ", id=" + id + ", Telefono=" + Telefono + ", Edad=" + Edad + ", fechaDeIngreso=" + fechaDeIngreso + '}';
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
