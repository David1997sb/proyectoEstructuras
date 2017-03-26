
package sistema_de_datos_educativo;

public class NodoUsuario {
    private Usuario dato;//se encuentran los datos de la persona
    private NodoUsuario next;//Hace referencia al nodo siguiente

    public NodoUsuario(Usuario dato) {//Constructor que recibe datos de persona
        this.dato = dato;
    }

    public Usuario getDato() {
        return dato;
    }

    public void setDato(Usuario dato) {
        this.dato = dato;
    }

    public NodoUsuario getNext() {
        return next;
    }

    public void setNext(NodoUsuario next) {
        this.next = next;
    }
    
    @Override
    public String toString() {
        return "dato:" + dato;
    }
   
}
