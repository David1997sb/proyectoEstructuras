/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import java.util.Date;

import sistema_de_datos_educativo.Profesor;

/**
 *
 * @author Frander B.A
 */
public class ColaProf {

    /**
     * En la clase colaEst lo que podemos observar sin objetos tipo NodoEst que
     * hacen referencia a la clase NodoEst.
     *
     */
    private NodoProf Ultimo;
    private NodoProf Frente;

    public Profesor enCola(NodoProf n) {
        //Coloca los elementos en la cola
        if (Frente == null) {
            Frente = n;
            Ultimo = n;
        } else {
            Ultimo.setAtras(n);
            Ultimo = n;
        }
        return n.getNodoprof();
    }

    public NodoProf Atiende() {
        /**
         * El metodo atiende lo que hace es sacar el primer nodo de la cola
         */
        NodoProf aux = Frente;
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
        NodoProf aux = Frente;
        while (aux != null) {
            s += aux + "\n";
            aux = aux.getAtras();
        }
        return s;
    }

    public Profesor BuscarProfesor(int id) {
         /**
         * Se realiza una validacion con un id que tiene por parametro para asi encontrar el respectivo profesor.
         * Una vez este se a encontrado es retornado
         */
        NodoProf aux = Frente;
        while (aux != null) {
            if (aux.getNodoprof().getId() == id) {
                return aux.getNodoprof();
            }
            aux = aux.getAtras();
        }
        return null;
    }

    public void modificaProfeAdmin(String Nombre, String Apellido, String Correo, String Curso, int id, int Telefono, int Edad, Date fechaDeIngreso) {
        /**
        * Este metodo lo que realiza son todos los cambios a lo que el administrador tiene acceso para realizar los cambios del profesor.
        * Se hace una validacion conforme a un ID para asi encontrar al profesor, una vez encontrado se le cambian sus datos.
        */
        NodoProf aux = Frente;
        while (aux != null) {
            if (aux.getNodoprof().getId() == id) {
                aux.getNodoprof().setCorreo(Correo);
                aux.getNodoprof().setTelefono(Telefono);
                aux.getNodoprof().setCurso(Curso);
                aux.getNodoprof().setNombre((Nombre));
                aux.getNodoprof().setApellido((Apellido));
                aux.getNodoprof().setEdad((Edad));
            }
            aux = aux.getAtras();
        }
    }

    public void modificaProfe(String Correo, int Telefono, int id, String Curso) {
        /**
         * Este metodo es al que el profesor tiene acceso, y se le muestran los datos que este puede cambiar.
         */
        NodoProf aux = Frente;
        while (aux != null) {
            if (aux.getNodoprof().getId() == id) {
                aux.getNodoprof().setCorreo(Correo);
                aux.getNodoprof().setTelefono(Telefono);
                aux.getNodoprof().setCurso(Curso);
            }
            aux = aux.getAtras();
        }
    }

    public String eliminadatosProfesor(int id) {
       /**
         * Este metodo lo que realiza es poder eliminar un profesor de la colaProf conforme un ID que se le manda por parametro
         */

        NodoProf aux = Frente;
        NodoProf aux2 = aux;
        while (aux != null) {
            if (aux.getNodoprof().getId() == id) {
                if (aux == Frente) {
                    Frente = aux.getAtras();
                    return "Se elimino el profe";
                } else if (aux == Ultimo) {
                    Ultimo = aux2;
                    aux2.setAtras(aux.getAtras());
                    return "Se elimino el profe";
                } else {
                    aux2.setAtras(aux.getAtras());
                    return "Se elimino el profe";
                }
            } else {
                aux2 = aux;
                aux = aux.getAtras();
            }
        }
        return "No se encontro con el id " + id;
    }
}
