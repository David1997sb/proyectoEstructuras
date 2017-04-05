package Estructuras;

import sistema_de_datos_educativo.Usuario;

public class ListaUsuarios {

    private NodoUsuario cabeza;

    public void insert(Usuario p) {
        if (cabeza == null) {
            //Se crea el nuevo Nodo
            cabeza = new NodoUsuario(p);

        } else //Se obtiene el dato menor
        {
            if (p.getId() <= cabeza.getDato().getId()) {
                NodoUsuario aux = new NodoUsuario(p);
                aux.setNext(cabeza);
                cabeza = aux;
            } else //Se inserta el dato menor
            {
                if (cabeza.getNext() == null) {
                    cabeza.setNext(new NodoUsuario(p));

                } else {
                    NodoUsuario aux = cabeza;//Se pone un nodo en medio de la lista
                    while (aux.getNext() != null && aux.getNext().getDato().getId() < p.getId()) {
                        aux = aux.getNext();
                    }
                    NodoUsuario temp = new NodoUsuario(p);
                    temp.setNext(aux.getNext());
                    aux.setNext(temp);
                }
            }
        }
    }

    public Usuario BuscarUsuario(String usuario, String password) {
        NodoUsuario aux = cabeza;
        while (aux != null) {
            if (aux.getDato().getNombre().equals(usuario) && aux.getDato().getPassword().equals(password)) {
                return aux.getDato();
            }
            aux = aux.getNext();
        }
        return null;
    }

    public Usuario BuscarUsuarioID(int id) {
        NodoUsuario aux = cabeza;
        while (aux != null) {
            if (aux.getDato().getId() == id) {
                return aux.getDato();
            }
            aux = aux.getNext();
        }
        return null;

    }

    public void ModificaUsuario(String usuario, String password, int id) {
        NodoUsuario aux = cabeza;
        while (aux != null) {
            if (aux.getDato().getId() == id) {
                aux.getDato().setNombre(usuario);
                aux.getDato().setPassword(password);
            }
            aux = aux.getNext();
        }
    }

    public void eliminar(String nombreUsuario) {
        if (cabeza != null) { //Si la lista no esta vacia
            NodoUsuario aux = cabeza;
            NodoUsuario anterior = null;
            while (aux != null) {

                if (aux.getDato().getNombre().equals(nombreUsuario)) {
                    if (aux == cabeza) {//Caso 1
                        cabeza = aux.getNext();
                    } else if (aux.getNext() == null) { //caso 2
                        anterior.setNext(null);
                    } else {
                        anterior.setNext(aux.getNext());
                    }
                }
                anterior = aux;
                aux = aux.getNext();

            }
        } else {
            System.out.println("La lista esta vacia");
        }
    }

    public String toString() {
        NodoUsuario aux = cabeza;
        String s = "Lista : \n";
        while (aux != null) {
            s += aux + "\n";
            aux = aux.getNext();
        }
        return s;
    }

}
