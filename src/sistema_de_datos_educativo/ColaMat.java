/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_de_datos_educativo;

/**
 *
 * @author Frander B.A
 */
public class ColaMat {

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
        NodoMat aux = Frente;
        if (Frente != null) {
            Frente = Frente.getAtras();
            aux.setAtras(null);
        }
        return aux;
    }

    @Override
    public String toString() {
        String s = "";
        NodoMat aux = Frente;
        while (aux != null) {
            s += aux + "\n";
            aux = aux.getAtras();
        }
        return s;
    }

    public boolean agregarProfeAmateria(Profesor profe, String nombreMateria) {
        NodoMat aux = Frente;
        while (aux != null) {
            if (aux.getMateria().getNombreMateria().equals(nombreMateria)) {
                aux.getMateria().setProfe(profe);
                return true;
            }
            aux = aux.getAtras();
        }
        return false;
    }

    public boolean agregarEsteAmateria(Estudiante est, String nombreMateria) {
        NodoMat aux = Frente;
        while (aux != null) {
            if (aux.getMateria().getNombreMateria().equals(nombreMateria)) {
                if(aux.getMateria().getCantidadAlumnos()<=aux.getMateria().getCanMaxAlumnos()){
                    
                
                aux.getMateria().getEstudiantes().enCola(new NodoEst(est));
                int cantidad=aux.getMateria().getCantidadAlumnos();
                aux.getMateria().setCantidadAlumnos(cantidad++);
                return true;
                }else{
                    return false;
                }
                }
            aux = aux.getAtras();
        }
        return false;
    }

    public String imprimeEstudiantesMateria(String materia) {
        NodoMat aux = Frente;
        while (aux != null) {
            if (aux.getMateria().getNombreMateria().equals(materia)) {
                return aux.getMateria().getEstudiantes().toString();
            }
            aux = aux.getAtras();
        }
        return null;
    }
}
