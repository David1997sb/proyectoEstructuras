/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_de_datos_educativo;

/**
 *
 * @author Frander B.A
 */
public class Estudiante {

    private String Nombre;
    private String Apellido;
    private String Encargado;
    private String Correo;
    private int id;
    private String Telefono;
    private int Edad;
    private String NivelEducativo;

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

    public String getEncargado() {
        return Encargado;
    }

    public void setEncargado(String Encargado) {
        this.Encargado = Encargado;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getNivelEducativo() {
        return NivelEducativo;
    }

    public void setNivelEducativo(String NivelEducativo) {
        this.NivelEducativo = NivelEducativo;
    }

    public Estudiante(String Nombre, String Apellido, String Encargado, String Correo, int id, String Telefono, String NivelEducativo) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Encargado = Encargado;
        this.Correo = Correo;
        this.id = id;
        this.Telefono = Telefono;
        this.NivelEducativo = NivelEducativo;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", Encargado=" + Encargado + ", Correo=" + Correo + ", id=" + id + ", Telefono=" + Telefono + ", Edad=" + Edad + ", NivelEducativo=" + NivelEducativo + '}';
    }

    
    


    
    
}
