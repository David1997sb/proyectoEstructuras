/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import sistema_de_datos_educativo.Profesor;

/**
 *
 * @author Frander B.A
 */
public class NodoProf {
/**
 * Se generan los atributos de tipo NodoProf y Profesor para asi generar sus respectivos get y sets, junto con su metodo toString
 */
    private NodoProf Atras;//Hace referencia al nodo de atras

    private Profesor nodoprof;//se encuentran los datos de la persona

    public NodoProf(Profesor nodoprof) {
        this.nodoprof = nodoprof;
    }

    public NodoProf getAtras() {
        return Atras;
    }

    public void setAtras(NodoProf Atras) {
        this.Atras = Atras;
    }

    public Profesor getNodoprof() {
        return nodoprof;
    }

    public void setNodoprof(Profesor nodoprof) {
        this.nodoprof = nodoprof;
    }

    @Override
    public String toString() {
        return "Profesor: " + nodoprof +"\n";
    }
    

    
    
}
