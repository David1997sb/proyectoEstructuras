/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import sistema_de_datos_educativo.Estudiante;
import sistema_de_datos_educativo.Usuario;

/**
 *
 * @author Frander B.A
 */
public class ColaEst {

    NodoEst Ultimo;
    NodoEst Frente;

    public Estudiante enCola(NodoEst n) {
        //Coloca los elementos en la cola
        if (Frente == null) {
            Frente = n;
            Ultimo = n;
        } else {
            Ultimo.setAtras(n);
            Ultimo = n;
        }
        return n.getEstudiante();
    }

    public NodoEst Atiende() {
        NodoEst aux = Frente;
        if (Frente != null) {
            Frente = Frente.getAtras();
            aux.setAtras(null);
        }
        return aux;
    }

    @Override
    public String toString() {
        String s = "";
        NodoEst aux = Frente;
        while (aux != null) {
            s += aux + "\n";
            aux = aux.getAtras();
        }
        return s;
    }
    public void modificanota(int id, int nota){
        NodoEst aux = Frente;
        while (aux != null) {
            if (aux.getEstudiante().getId() == id) {
                aux.getEstudiante().setNota(nota);
            }
            aux = aux.getAtras();
        }
    
    }
    public Estudiante modificaEstudianteAdmin(String Nombre, String Apellido, String Encargado, String Correo, int id, String Telefono, int Edad, String NivelEducativo) {
        NodoEst aux = Frente;
        while (aux != null) {
            if (aux.getEstudiante().getId() == id) {
                aux.getEstudiante().setNombre(Nombre);
                aux.getEstudiante().setApellido(Apellido);
                aux.getEstudiante().setEncargado(Encargado);
                aux.getEstudiante().setCorreo(Correo);
                aux.getEstudiante().setId(id);
                aux.getEstudiante().setTelefono(Telefono);
                aux.getEstudiante().setEdad(Edad);
                aux.getEstudiante().setNivelEducativo(NivelEducativo);
            }
            aux = aux.getAtras();
        }
        return null;
    }

    public Estudiante modificaEstuduante(String Correo, String Telefono, int id) {
        NodoEst aux = Frente;
        while (aux != null) {
            if (aux.getEstudiante().getId() == id) {
                aux.getEstudiante().setCorreo(Correo);
                aux.getEstudiante().setId(id);
                aux.getEstudiante().setTelefono(Telefono);
            }
            aux = aux.getAtras();
        }
        return null;
    }

    public Estudiante BuscarEstudiante(int id) {
        NodoEst aux = Frente;
        while (aux != null) {
            if (aux.getEstudiante().getId() == id) {
                return aux.getEstudiante();
            }
            aux = aux.getAtras();
        }
        return null;
    }

    public String eliminadatosEstudiante(int id) {
        NodoEst aux = Frente;
        NodoEst aux2 = aux;
        while (aux != null) {
            if (aux.getEstudiante().getId() == id) {
                if (aux == Frente) {
                    Frente = aux.getAtras();
                    return "Se elimino el Estuiante";
                } else if (aux == Ultimo) {
                    Ultimo = aux2;
                    return "Se elimino el Estudiante";
                } else {
                    aux2.setAtras(aux.getAtras());
                    return "Se elimino el Estudiante";
                }
            } else {
                aux2 = aux;
                aux = aux.getAtras();
            }
        }
        return "No se encontro con el id " + id;
    }
}
