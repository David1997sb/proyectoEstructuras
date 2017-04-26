/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import sistema_de_datos_educativo.Estudiante;

/**
 *
 * @author Frander B.A
 */
public class NodoEst {
/**
 * Se generan los atributos de tipo NodoEst y Estudiante para asi generar sus respectivos get y sets, junto con su metodo toString
 */
    private NodoEst Atras;//Hace referencia al nodo de atras

    private Estudiante estudiante;//se encuentran los datos del estudiante

    public NodoEst getAtras() {
        return Atras;
    }

    public void setAtras(NodoEst Atras) {
        this.Atras = Atras;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public NodoEst(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    @Override
    public String toString() {
        return "Estudiante: " + estudiante + "\n";
    }

}
