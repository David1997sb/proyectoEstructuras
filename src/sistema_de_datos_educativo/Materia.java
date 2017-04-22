/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_de_datos_educativo;

import Estructuras.Arbol;
import Estructuras.ColaEst;

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
    private Arbol notas;

    public Arbol getNotas() {
        return notas;
    }

    public void setNotas(Arbol notas) {
        this.notas = notas;
    }
    
    

    public Materia() {
        estudiantes = new ColaEst();
        notas = new Arbol();
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
        return "\nNombre de la Materia: " + NombreMateria + "\nCantidad de Alumnos: " + CantidadAlumnos + "\nAula=" + Aula + " \nHorario: " + Horario + " \nCantidad Maxima de Alumnos: " + canMaxAlumnos + "\n--------------------"+ " \nProfesor: " + profe + "\n--------------------"+ "\n" + estudiantes;
    }

    public Materia(String NombreMateria, int Aula, String Horario, int canMaxAlumnos) {
        this.NombreMateria = NombreMateria;
        this.Aula = Aula;
        this.Horario = Horario;
        this.canMaxAlumnos = canMaxAlumnos;
        this.CantidadAlumnos = 0;
        estudiantes = new ColaEst();
    }
    
    

}
