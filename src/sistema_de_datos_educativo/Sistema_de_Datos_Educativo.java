/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_de_datos_educativo;

import java.util.Date;

/**
 *
 * @author Frander B.A
 */
public class Sistema_de_Datos_Educativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Colegio colegio = new Colegio();
        colegio.AgregaProfesor("Frander", "Fallas", "@", "mate", 26, 3, new Date());
        colegio.AgregaProfesor("Andres", "Fallas", "andres.fallas@ulacit.ed.cr", "mate", 26, 3, new Date());
        colegio.AgregaProfesor("JULIO   ", "Fallas", "andres.fallas@ulacit.ed.cr", "mate", 26, 3, new Date());
//        System.out.println(colegio.imprimeProfe());
        colegio.agregaEstudiantes("Aldo", "Bolanos", "Vanessa", "aldo.bola@ulacit.ed.cr", "7162", 12, "Cuarto ano");
        colegio.agregaEstudiantes("David", "Alvarado", "Juan", "@", "7262", 15, "Sexto ano");
//        System.out.println(colegio.imprimeEstudiantes());
        colegio.agregaMateria("Mate", 10, "2-3", 25);
        colegio.agregaProfeAmateria(1, "Mate");
//        System.out.println(colegio.imprimeMateria());
        colegio.agregaEstudiantesAmateria(1, "Mate");
        colegio.agregaEstudiantesAmateria(2, "Mate");
//        System.out.println(colegio.imprimeEstMateria("Mate"));
//        System.out.println(colegio.imprimeMateria());
//        colegio.cambiaCorreoProfesor(2);
ColaProf colaProf = new ColaProf();
//    colaProf.Atiende();
        colegio.eliminaProfesor(2);
                colegio.AgregaProfesor("JULIO3   ", "Fallas", "andres.fallas@ulacit.ed.cr", "mate", 26, 3, new Date());
colegio.imprimeUsuario();
        System.out.println(colegio.imprimeUsuario());

    }

}