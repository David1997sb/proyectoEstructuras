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
public class ListaUsuarios {
    private NodoLista cabeza;

    public void insert(Usuario p) {
        if (cabeza == null) {
            //Se crea el nuevo Nodo
            cabeza = new NodoLista(p);

        } else {
            //Se obtiene el dato menor
            if (p.getId() <= cabeza.getDato().getId()) {
                NodoLista aux = new NodoLista(p);
                aux.setNext(cabeza);
                cabeza = aux;
            } else {
                //Se inserta el dato menor
                if (cabeza.getNext() == null) {
                    cabeza.setNext(new NodoLista(p));

                } else {
                    NodoLista aux = cabeza;//Se pone un nodo en medio de la lista
                    while (aux.getNext() != null && aux.getNext().getDato().getId() < p.getId()) {
                        aux = aux.getNext();
                    }
                    NodoLista temp = new NodoLista(p);
                    temp.setNext(aux.getNext());
                    aux.setNext(temp);
                }
            }
        }
    }

    public String toString() {
        NodoLista aux = cabeza;
        String s = "Lista : \n";
        while (aux != null) {
            s += aux + "\n";
            aux = aux.getNext();
        }
        return s;
    }
}
