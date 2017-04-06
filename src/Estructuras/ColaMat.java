/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import javax.swing.JOptionPane;
import sistema_de_datos_educativo.Estudiante;
import sistema_de_datos_educativo.Materia;
import sistema_de_datos_educativo.Profesor;

/**
 *
 * @author Frander B.A
 */
public class ColaMat {

    NodoMat Ultimo;
    NodoMat Frente;

    public void enCola(NodoMat n) {
        //Coloca los elementos en la cola
        if (Frente == null) {
            Frente = n;
            Ultimo = n;
        } else {
            Ultimo.setAtras(n);
            Ultimo = n;
        }

    }

    public NodoMat Atiende() {
        NodoMat aux = Frente;
        if (Frente != null) {
            Frente = Frente.getAtras();
            aux.setAtras(null);
        }
        return aux;
    }

    @Override
    public String toString() {
        String s = "";
        NodoMat aux = Frente;
        while (aux != null) {
            s += aux + "\n";
            aux = aux.getAtras();
        }
        
        return s;
    }

    public boolean agregarProfeAmateria(Profesor profe, String nombreMateria) {
        NodoMat aux = Frente;
        while (aux != null) {
            if (aux.getMateria().getNombreMateria().equalsIgnoreCase(nombreMateria)) {
                aux.getMateria().setProfe(profe);
                return true;
            }
            aux = aux.getAtras();
        }
        return false;
    }

    public boolean agregarEsteAmateria(Estudiante est, String nombreMateria) {
        NodoMat aux = Frente;
        while (aux != null) {
            if (aux.getMateria().getNombreMateria().equalsIgnoreCase(nombreMateria)) {
                if (aux.getMateria().getCantidadAlumnos() <= aux.getMateria().getCanMaxAlumnos()) {

                    aux.getMateria().getEstudiantes().enCola(new NodoEst(est));
                    int cantidad = aux.getMateria().getCantidadAlumnos() + 1;
                    aux.getMateria().setCantidadAlumnos(cantidad);
                    return true;
                } else {
                    return false;
                }
            }
            aux = aux.getAtras();
        }
        return false;
    }

    public String imprimeEstudiantesMateria(String materia) {
        NodoMat aux = Frente;
        while (aux != null) {
            if (aux.getMateria().getNombreMateria().equals(materia)) {
                return aux.getMateria().getEstudiantes().toString();
            }
            aux = aux.getAtras();
        }
        return null;
    }

    public Materia BuscarMateria(String nombreMateria) {
        NodoMat aux = Frente;
        while (aux != null) {
            if (aux.getMateria().getNombreMateria().equalsIgnoreCase(nombreMateria)) {
                return aux.getMateria();
            }
            aux = aux.getAtras();
        }
        return null;
    }

    public String eliminadatosMateria(String nombreMateria) {
        NodoMat aux = Frente;
        NodoMat aux2 = aux;
        while (aux != null) {
            if (aux.getMateria().getNombreMateria().equalsIgnoreCase(nombreMateria)) {
                if (aux == Frente) {
                    Frente = aux.getAtras();
                    return "Se elimino materia";
                } else if (aux == Ultimo) {
                    Ultimo = aux2;
                    return "Se elimino materia";
                } else {
                    aux2.setAtras(aux.getAtras());
                    return "Se elimino materia";
                }
            } else {
                aux2 = aux;
                aux = aux.getAtras();
            }
        }
        return "No se encontro con el nombre " + nombreMateria;
    }

    public void modificaMateria(String NombreMateria, int Aula, String Horario, int canMaxAlumnos) {
        NodoMat aux = Frente;
        while (aux != null) {
            if (aux.getMateria().getNombreMateria().equalsIgnoreCase(NombreMateria)) {
                aux.getMateria().setHorario(Horario);
                aux.getMateria().setAula(Aula);
                aux.getMateria().setCanMaxAlumnos(canMaxAlumnos);
            }
            aux=aux.getAtras();
        }
    }
    public void modificaProfeMateria(Profesor profe, String materia){
         NodoMat aux = Frente;
        while (aux != null) {
            if (aux.getMateria().getNombreMateria().equals(materia)) {
                aux.getMateria().setProfe(profe);
                
            }
            aux = aux.getAtras();
        }
       
    }
}
