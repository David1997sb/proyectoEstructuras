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
public class ColaEst {
/**
 * En la clase colaEst lo que podemos observar sin objetos tipo NodoEst que hacen referencia a la clase NodoEst.
 * 
 */
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
   /**
    * El metodo atiende lo que hace es sacar el primer nodo de la cola
    */
        NodoEst aux = Frente;
        if (Frente != null) {
            Frente = Frente.getAtras();
            aux.setAtras(null);
        }
        return aux;
    }

    @Override
    public String toString() {
        //Este metodo nos permite convertir todo a String para asi poder imprimirlo.
        String s = "";
        NodoEst aux = Frente;
        while (aux != null) {
            s += aux + "\n";
            aux = aux.getAtras();
        }
        return s;
    }
    
        public Arbol generarNotas() {
        //Este metodo lo que realiza es que se genera un objeto de tipo Arbol y otro de tipo Estudiante
        //Para poder insertar todos los estudiantes y tambien se genera la raiz del metodo
        NodoEst aux = Frente;
        Arbol arbol = new Arbol();
        Estudiante estudiante = new Estudiante();
        estudiante.setNota(70);
        arbol.insertar(estudiante);
        while (aux != null) {
            arbol.insertar(aux.getEstudiante());
            aux = aux.getAtras();
        }
        
        return arbol;
    }
    
    public void modificanota(int id, int nota){
        /**
         * Este metodo es encargado de poder modificar la nota de los estudiantes que se encuentran en el arbol
         * Se hace una validacion conforme al id del estudiante, este se busca y cuando se encuentra se le cambia la nota.
         */
        NodoEst aux = Frente;
        while (aux != null) {
            if (aux.getEstudiante().getId() == id) {
                aux.getEstudiante().setNota(nota);
            }
            aux = aux.getAtras();
        }
    
    }
    public Estudiante modificaEstudianteAdmin(String Nombre, String Apellido, String Encargado, String Correo, int id, String Telefono, int Edad, String NivelEducativo) {
       /**
        * Este metodo lo que realiza son todos los cambios a lo que el administrador tiene acceso para realizar los cambios del estudiante.
        * Se hace una validacion conforme a un ID para asi encontrar a un estudiante, una vez encontrado se le cambian sus datoss.
        */
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
        /**
         * Este metodo es al que el estudiante tiene acceso, y se le muestran los datos que este puede cambiar.
         */
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
        /**
         * Se realiza una validacion con un id que tiene por parametro para asi encontrar el estudiante.
         * Una vez este se a encontrado es retornado
         */
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
        /**
         * Este metodo lo que realiza es poder eliminar un estudiante de la colaEst conforme un ID que se le manda por parametro
         */
        NodoEst aux = Frente;
        NodoEst aux2 = aux;
        while (aux != null) {
            if (aux.getEstudiante().getId() == id) {
                if (aux == Frente) {
                    Frente = aux.getAtras();
                    return "Se elimino el estudiante";
                } else if (aux == Ultimo) {
                    Ultimo = aux2;
                    aux2.setAtras(aux.getAtras());
                    return "Se elimino el estudiante";
                } else {
                    aux2.setAtras(aux.getAtras());
                    return "Se elimino el estudiante";
                }
            } else {
                aux2 = aux;
                aux = aux.getAtras();
            }
        }
        return "No se encontro con el id " + id;
    }
}
