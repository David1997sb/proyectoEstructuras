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
    private String nombreUsuario;

    public String getNombre() {
        return Nombre;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
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

    public Estudiante(String Nombre, String Apellido, String Encargado, String Correo, int id, String Telefono,int edad, String NivelEducativo) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Encargado = Encargado;
        this.Correo = Correo;
        this.id = id;
        this.Telefono = Telefono;
        this.NivelEducativo = NivelEducativo;
        this.Edad=edad;
        this.nombreUsuario = Nombre.toLowerCase().charAt(0) + Apellido.toLowerCase() + id;
    }

    @Override
    public String toString() {
        return  "\nId: " + id +"\nNombre: " + Nombre + "\nApellido: " + Apellido + "\nEncargado: " + Encargado + "\nCorreo: " + Correo +  " \nTeléfono: " + Telefono + "  \nEdad: " + Edad + ", \nNivel Educativo: " + NivelEducativo;
    }

    
    


    
    
}
