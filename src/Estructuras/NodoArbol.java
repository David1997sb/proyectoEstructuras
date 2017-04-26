/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import sistema_de_datos_educativo.Estudiante;

/**
 *
 * 
 */
public class NodoArbol {
    /**
     * Se generan objetos de tipo estudiante y 2 de tipo NodoArbol para asi poder generar los respectivos gets y sets y constructores.
     */
    private Estudiante estudiante;//se encuentran los datos del estudiante

    private NodoArbol hijoIzq;//Se hace referencia al hijo izquierdo del arbol
    private NodoArbol hijoDer;//Se hace referencia al hijo derecho del arbol

    public NodoArbol(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    

    public NodoArbol getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(NodoArbol hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public NodoArbol getHijoDer() {
        return hijoDer;
    }

    public void setHijoDer(NodoArbol hijoDer) {
        this.hijoDer = hijoDer;
    }
    
}
