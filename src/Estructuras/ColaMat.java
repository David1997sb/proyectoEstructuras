/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import sistema_de_datos_educativo.Estudiante;
import sistema_de_datos_educativo.Materia;
import sistema_de_datos_educativo.Profesor;

/**
 *
 * @author Frander B.A
 */
public class ColaMat {

    /**
     * En la clase colaEst lo que podemos observar son objetos tipo NodoMat que
     * hacen referencia a la clase NodoMat.
     *
     */
    NodoMat Ultimo;
    NodoMat Frente;

    public void enCola(NodoMat n) {
        //Coloca los elementos en la cola
        if (Frente == null) {
            Frente = n;
            Ultimo = n;
        } else {
            Ultimo.setAtras(n);
            Ultimo = n;
        }

    }

    public NodoMat Atiende() {
        /**
         * El metodo atiende lo que hace es sacar el primer nodo de la cola
         */
        NodoMat aux = Frente;
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
        NodoMat aux = Frente;
        while (aux != null) {
            s += aux + "\n";
            aux = aux.getAtras();
        }

        return s;
    }

    public boolean agregarProfeAmateria(Profesor profe, String nombreMateria) {
        /**
         * Este metodo lo que realiza es poder agregar un profesor a una materia
         * conforme a una validacion que se hace con el nombre de la materia,
         * una vez ya encontrada la materia este agrega al profesor.
         */
        NodoMat aux = Frente;
        while (aux != null) {
            if (aux.getMateria().getNombreMateria().equalsIgnoreCase(nombreMateria)) {
                aux.getMateria().setProfe(profe);
                return true;
            }
            aux = aux.getAtras();
        }
        return false;
    }

    public void agregaNota(Estudiante estudiante, Materia materia, int nota) {
        /**
         * Este metodo lo que realiza es poder modificar o agregar una nota al
         * estudiante conforme a la validacion de la materia que se le ingresa
         * por parametro Una vez que se encontro la materia, el parametro de
         * tipo estudiante que se le manda al metodo lo que se realiza es
         * asignarle la nota.
         */
        NodoMat aux = Frente;
        while (aux != null) {
            if (aux.getMateria().getNombreMateria().equalsIgnoreCase(materia.getNombreMateria())) {
                aux.getMateria().getEstudiantes().modificanota(estudiante.getId(), nota);
            }
            aux = aux.getAtras();
        }

    }

    public boolean agregarEsteAmateria(Estudiante est, String nombreMateria) {
        /**
         * Este metodo lo que realiza es poder agregar un estudiante a la cola
         * de materia conforme a una validacion que se hace con el nombre de la
         * materia, una vez ya encontrada la materia este agrega al estudiante.
         * Y de igual forma se le aumenta a la cantidad de alumnos matriculados
         */
        NodoMat aux = Frente;
        while (aux != null) {
            if (aux.getMateria().getNombreMateria().equalsIgnoreCase(nombreMateria)) {
                if (aux.getMateria().getCantidadAlumnos() <= aux.getMateria().getCanMaxAlumnos()) {

                    aux.getMateria().getEstudiantes().enCola(new NodoEst(est));
                    int cantidad = aux.getMateria().getCantidadAlumnos() + 1;
                    aux.getMateria().setCantidadAlumnos(cantidad);
                    return true;
                } else {
                    return false;
                }
            }
            aux = aux.getAtras();
        }
        return false;
    }

    public String imprimeEstudiantesMateria(String materia) {
        /**
         * Este metodo recibe por parametro el nombre de una materia se realiza
         * una busqueda en la cola de materias cuando encuentra la materia
         * conforme al nombre que tiene por parametro, se imprime los
         * estudiantes asignados a esta materia
         */
        NodoMat aux = Frente;
        while (aux != null) {

            if (aux.getMateria().getNombreMateria().equals(materia)) {
                return aux.getMateria().getEstudiantes().toString();
            }
            aux = aux.getAtras();
        }
        return null;
    }

    public Materia BuscarMateria(String nombreMateria) {
        /**
         * Este metodo recibe un nombre de materia, busca una matera en la
         * colaMat con el mismo nombre al que esta en el parametro. Cuando ya la
         * validacion esta hecha retorna la materia encontrada
         */
        NodoMat aux = Frente;
        while (aux != null) {
            if (aux.getMateria().getNombreMateria().equalsIgnoreCase(nombreMateria)) {
                return aux.getMateria();
            }
            aux = aux.getAtras();
        }
        return null;
    }

    public String eliminadatosMateria(String nombreMateria) {
        /**
         * Se realiza una validacion con un nombre de materia que tiene por
         * parametro para asi encontrar la materia que envia por parametro. Una
         * vez este se a encontrada es eliminada
         */
        NodoMat aux = Frente;
        NodoMat aux2 = aux;
        while (aux != null) {
            if (aux.getMateria().getNombreMateria().equalsIgnoreCase(nombreMateria)) {
                if (aux == Frente) {
                    Frente = aux.getAtras();
                    return "Se elimino materia";
                } else if (aux == Ultimo) {
                    Ultimo = aux2;
                    aux2.setAtras(aux.getAtras());
                    return "Se elimino materia";
                } else {
                    aux2.setAtras(aux.getAtras());
                    return "Se elimino materia";
                }
            } else {
                aux2 = aux;
                aux = aux.getAtras();
            }
        }
        return "No se encontro con el nombre " + nombreMateria;
    }

    public void modificaMateria(String NombreMateria, int Aula, String Horario, int canMaxAlumnos) {
        /**
         * Este metodo lo que realiza son todos los cambios a lo que el
         * administrador tiene acceso para realizar los cambios de la materia.
         * Se hace una validacion conforme a un nombre materia para asi
         * encontrar a una materia de la colaMat, una vez encontrado se le
         * cambian sus datoss.
         */
        NodoMat aux = Frente;
        while (aux != null) {
            if (aux.getMateria().getNombreMateria().equalsIgnoreCase(NombreMateria)) {
                aux.getMateria().setHorario(Horario);
                aux.getMateria().setAula(Aula);
                aux.getMateria().setCanMaxAlumnos(canMaxAlumnos);
            }
            aux = aux.getAtras();
        }
    }

    public void modificaProfeMateria(Profesor profe, String materia) {
        /**
         * Este metodo es al que el profesor tiene acceso, y se le muestran los
         * datos que este puede cambiar.
         */
        NodoMat aux = Frente;
        while (aux != null) {
            if (aux.getMateria().getNombreMateria().equals(materia)) {
                aux.getMateria().setProfe(profe);

            }
            aux = aux.getAtras();
        }

    }

    public void generarNotas(String mat) {
        /**
         * Este es el metodo que se utiliza para poder generar las notas conforme al nombre de la materia que se manda por parametro.
         * Ya una vez realizada la validacion se generan las notas de la materia que se encontro y se introduce en el arbol.
         */
        NodoMat aux = Frente;
        while (aux != null) {
            if (aux.getMateria().getNombreMateria().equals(mat)) {
                Materia materia = aux.getMateria();
                Arbol arbol = materia.getEstudiantes().generarNotas();
                materia.setNotas(arbol);

            }
            aux = aux.getAtras();
        }

    }

}
