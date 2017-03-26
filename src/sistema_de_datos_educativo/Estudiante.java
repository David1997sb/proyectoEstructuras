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

    private String NombreEstudiante;
    private String ApellidoEstudiante;
    private String Encargado;
    private String CorreoEstudiante;
    private int id;
    private String TelefonoEstudiante;
    private int EdadEstudiante;
    private String NivelEducativo;

    public String getNombreEstudiante() {
        return NombreEstudiante;
    }

    public void setNombreEstudiante(String NombreEstudiante) {
        this.NombreEstudiante = NombreEstudiante;
    }

    public String getApellidoEstudiante() {
        return ApellidoEstudiante;
    }

    public void setApellidoEstudiante(String ApellidoEstudiante) {
        this.ApellidoEstudiante = ApellidoEstudiante;
    }

    public String getEncargado() {
        return Encargado;
    }

    public void setEncargado(String Encargado) {
        this.Encargado = Encargado;
    }

    public String getCorreoEstudiante() {
        return CorreoEstudiante;
    }

    public void setCorreoEstudiante(String CorreoEstudiante) {
        this.CorreoEstudiante = CorreoEstudiante;
    }

    public String getTelefonoEstudiante() {
        return TelefonoEstudiante;
    }

    public void setTelefonoEstudiante(String TelefonoEstudiante) {
        this.TelefonoEstudiante = TelefonoEstudiante;
    }

    public int getEdadEstudiante() {
        return EdadEstudiante;
    }

    public void setEdadEstudiante(int EdadEstudiante) {
        this.EdadEstudiante = EdadEstudiante;
    }

    public String getNivelEducativo() {
        return NivelEducativo;
    }

    public void setNivelEducativo(String NivelEducativo) {
        this.NivelEducativo = NivelEducativo;
    }

    public Estudiante() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Estudiante(int id) {
        this.id = id;
    }

    public Estudiante(String NombreEstudiante, String ApellidoEstudiante, String Encargado, String CorreoEstudiante, int id, String TelefonoEstudiante, int EdadEstudiante, String NivelEducativo) {
        this.NombreEstudiante = NombreEstudiante;
        this.ApellidoEstudiante = ApellidoEstudiante;
        this.Encargado = Encargado;
        this.CorreoEstudiante = CorreoEstudiante;
        this.id = id;
        this.TelefonoEstudiante = TelefonoEstudiante;
        this.EdadEstudiante = EdadEstudiante;
        this.NivelEducativo = NivelEducativo;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "NombreEstudiante=" + NombreEstudiante + ", ApellidoEstudiante=" + ApellidoEstudiante + ", Encargado=" + Encargado + ", CorreoEstudiante=" + CorreoEstudiante + ", id=" + id + ", TelefonoEstudiante=" + TelefonoEstudiante + ", EdadEstudiante=" + EdadEstudiante + ", NivelEducativo=" + NivelEducativo + '}';
    }
    


    
    
}
