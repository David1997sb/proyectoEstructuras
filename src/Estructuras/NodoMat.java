/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import sistema_de_datos_educativo.Materia;

/**
 *
 * @author Frander B.A
 */
public class NodoMat {
   /**
 * Se generan los atributos de tipo NodoMat y mater para asi generar sus respectivos get y sets, junto con su metodo toString
 */
    private NodoMat Atras;//Hace referencia al nodo de atras

    private Materia materia;//se encuentran los datos de la matera

    public NodoMat getAtras() {
        return Atras;
    }

    public void setAtras(NodoMat Atras) {
        this.Atras = Atras;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public NodoMat(Materia materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Materia: " + materia + "\n";
    }
    
    
}
