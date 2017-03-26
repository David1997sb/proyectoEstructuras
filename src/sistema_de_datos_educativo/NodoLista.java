/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_de_datos_educativo;

/**
 *
 * @author Nicol
 */
public class NodoLista {
    private Usuario dato;//se encuentran los datos de la persona
    private NodoLista next;//Hace referencia al nodo siguiente

    public NodoLista(Usuario dato) {//Constructor que recibe datos de persona
        this.dato = dato;
    }

    public Usuario getDato() {
        return dato;
    }

    public void setDato(Usuario dato) {
        this.dato = dato;
    }

    public NodoLista getNext() {
        return next;
    }

    public void setNext(NodoLista next) {
        this.next = next;
    }
    
    @Override
    public String toString() {
        return "dato:" + dato;
    }
   
}
