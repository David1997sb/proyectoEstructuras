/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_de_datos_educativo;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Frander B.A
 */
public class ColaProf {

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
        NodoProf aux = Frente;
        if (Frente != null) {
            Frente = Frente.getAtras();
            aux.setAtras(null);
        }
        return aux;
    }

    @Override
    public String toString() {
        String s = "";
        NodoProf aux = Frente;
        while (aux != null) {
            s += aux + "\n";
            aux = aux.getAtras();
        }
        return s;
    }

    public Profesor BuscarProfesor(int id) {
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
    
    public void modificaProfe( String Correo, int Telefono,int id, int Edad) {
        NodoProf aux = Frente;
        while (aux != null) {
            if (aux.getNodoprof().getId() == id) {
                aux.getNodoprof().setCorreo(Correo);
                aux.getNodoprof().setTelefono(Telefono);
                aux.getNodoprof().setEdad((Edad));
            }
            aux = aux.getAtras();
        }
    }

    public void modificaCorreoProfe(int id) {
        NodoProf aux = Frente;
        while (aux != null) {
            if (aux.getNodoprof().getId() == id) {
                aux.getNodoprof().setCorreo(JOptionPane.showInputDialog("Ingrese el correo"));
            }
            aux = aux.getAtras();
        }
    }

    public void modificaTelefono(int id) {
        NodoProf aux = Frente;
        while (aux != null) {
            if (aux.getNodoprof().getId() == id) {
                aux.getNodoprof().setTelefono(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero telefonico")));
            }
            aux = aux.getAtras();
        }
    }

    public void modificaCurso(int id) {
        NodoProf aux = Frente;
        while (aux != null) {
            if (aux.getNodoprof().getId() == id) {
                aux.getNodoprof().setCurso(JOptionPane.showInputDialog("Ingrese el curso"));
            }
            aux = aux.getAtras();
        }
    }

    public void modificaNombre(int id) {
        NodoProf aux = Frente;
        while (aux != null) {
            if (aux.getNodoprof().getId() == id) {
                aux.getNodoprof().setNombre((JOptionPane.showInputDialog("Ingrese el nombre correcto")));
            }
            aux = aux.getAtras();
        }
    }

    public String eliminadatosProfesor(int id) {
        NodoProf aux = Frente;
        NodoProf aux2 = aux;
        while (aux != null) {
            if (aux.getNodoprof().getId() == id) {
                if (aux == Frente) {
                    Frente = aux.getAtras();
                    return "Se elimino el profe";
                } else if (aux == Ultimo) {
                    Ultimo = aux2;
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
