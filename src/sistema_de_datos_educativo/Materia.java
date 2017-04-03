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
public class Materia {

    private String NombreMateria;
    Profesor profe;
    private int CantidadAlumnos;
    private int Aula;
    private String Horario;
    private int canMaxAlumnos;
    ColaEst estudiantes;

    public Materia() {
        estudiantes = new ColaEst();
    }

    public String getNombreMateria() {
        return NombreMateria;
    }

    public void setNombreMateria(String NombreMateria) {
        this.NombreMateria = NombreMateria;
    }

    public Profesor getProfe() {
        return profe;
    }

    public void setProfe(Profesor profe) {
        this.profe = profe;
    }

    public int getCantidadAlumnos() {
        return CantidadAlumnos;
    }

    public void setCantidadAlumnos(int CantidadAlumnos) {
        this.CantidadAlumnos = CantidadAlumnos;
    }

    public int getAula() {
        return Aula;
    }

    public void setAula(int Aula) {
        this.Aula = Aula;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public int getCanMaxAlumnos() {
        return canMaxAlumnos;
    }

    public void setCanMaxAlumnos(int canMaxAlumnos) {
        this.canMaxAlumnos = canMaxAlumnos;
    }

    public ColaEst getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ColaEst estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public String toString() {
        return " NombreMateria: " + NombreMateria + " Cantidad de Alumnos: " + CantidadAlumnos + " Aula=" + Aula + ", Horario=" + Horario + ", canMaxAlumnos=" + canMaxAlumnos +  " \n profe: " + profe +"\nestudiantes " + estudiantes;
    }

    public Materia(String NombreMateria, int Aula, String Horario, int canMaxAlumnos) {
        this.NombreMateria = NombreMateria;
        this.Aula = Aula;
        this.Horario = Horario;
        this.canMaxAlumnos = canMaxAlumnos;
        estudiantes = new ColaEst();
    }
    
    

}
