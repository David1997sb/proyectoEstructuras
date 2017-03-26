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
public class NodoMat {
    
    private NodoMat Atras;
    private Materia materia;

    public NodoMat getAtras() {
        return Atras;
    }

    public void setAtras(NodoMat Atras) {
        this.Atras = Atras;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public NodoMat(Materia materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "NodoMat{" + "materia=" + materia + '}';
    }
    
    
}
