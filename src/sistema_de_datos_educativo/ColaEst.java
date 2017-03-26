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
public class ColaEst {
    
    NodoEst Ultimo;
    NodoEst Frente;
    
    public Estudiante enCola(NodoEst n){
        //Coloca los elementos en la cola
        if(Frente==null){
            Frente=n;
            Ultimo=n;
        }else{
            Ultimo.setAtras(n);
            Ultimo=n;
        }
        return n.getEstudiante();
    }
    public NodoEst Atiende(){
        NodoEst aux=Frente;
        if (Frente!=null) {
            Frente = Frente.getAtras();
            aux.setAtras(null);
        }
        return aux;
    }

    @Override
    public String toString() {
        String s="";
        NodoEst aux=Frente;
        while(aux!=null){
            s+= aux+"\n";
            aux=aux.getAtras();
        }
        return s;
    }
    
    public Estudiante modificaEstudiante(int id){
        NodoEst aux= Frente;
        while (aux!=null){
            if(aux.getEstudiante().getId()==id){
                return aux.getEstudiante();
            }
                aux=aux.getAtras();
        }
        return null;
    }
    
      
    public Estudiante BuscarEstudiante(int id){
        NodoEst aux=Frente;
        while(aux!=null){
            if( aux.getEstudiante().getId()==id){
                return aux.getEstudiante();
            }
            aux=aux.getAtras(); 
        }
        return null;
    }
//    public void cambiaNumero(String numero){
//         NodoEst aux= Frente;
//        while (aux!=null){
//            if(aux.getEstudiante().getTelefonoEstudiante()==numero){
//                aux.getEstudiante().setTelefonoEstudiante(JOptionPane.showInputDialog("Ingrese su nuevo correo electronico"));
//            }
//                aux=aux.getAtras();
//        }
//    }
}
