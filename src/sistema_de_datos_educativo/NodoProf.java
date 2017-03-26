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
public class NodoProf {
    
    private NodoProf Atras;
    private Profesor nodoprof;

    public NodoProf(Profesor nodoprof) {
        this.nodoprof = nodoprof;
    }

    public NodoProf getAtras() {
        return Atras;
    }

    public void setAtras(NodoProf Atras) {
        this.Atras = Atras;
    }

    public Profesor getNodoprof() {
        return nodoprof;
    }

    public void setNodoprof(Profesor nodoprof) {
        this.nodoprof = nodoprof;
    }

    @Override
    public String toString() {
        return "NodoProf{" + "nodoprof=" + nodoprof + '}';
    }

     
    
    
}
