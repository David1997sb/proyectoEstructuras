/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_de_datos_educativo;

import Estructuras.ColaEst;
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
        ColaEst colaEst = new ColaEst();
        colegio.AgregaProfesor("Frander", "Fallas", "fafa@ulacit.ed.cr", "mate", 26, 3, new Date());
        colegio.AgregaProfesor("Andres", "Fallas", "andres.fallas@ulacit.ed.cr", "mate", 26, 3, new Date());
        colegio.AgregaProfesor("Julio", "Fallas", "julio.fallas@ulacit.ed.cr", "mate", 26, 3, new Date());
        colegio.AgregaProfesor("Cesar3", "Fallas", "andres.fallas@ulacit.ed.cr", "mate", 26, 3, new Date());
        // System.out.println(colegio.imprimeProfe());

        colegio.agregaEstudiantes("Aldo", "Bolanos", "Vanessa", "aldo.bola@ulacit.ed.cr", "7162", 12, "Cuarto ano");
        colegio.agregaEstudiantes("Denis", "Olcen", "Cristian", "@", "7262", 15, "Sexto ano");
        colegio.agregaEstudiantes("Diego", "Nunez", "Andres", "@", "7262", 15, "Sexto ano");
        colegio.agregaEstudiantes("Dorlan", "Donineli", "Gaby", "@", "7262", 15, "Sexto ano");
        colegio.agregaMateria("Mate", 10, "2-3", 25);
        colegio.agregaMateria("Ingles", 10, "2-3", 25);
        colegio.agregaProfeAmateria(1, "Mate");
        //System.out.println(colegio.imprimeMateria());
        colegio.agregaEstudiantesAmateria(1, "Mate");
//        colegio.agregaEstudiantesAmateria(2, "Mate");
//        colegio.eliminaEstudiante(4);
//        System.out.println(colegio.imprimeEstudiantes());
                colegio.agregaMateria("Sociales", 11, "2-3", 25);
        colegio.agregaMateria("Estructura de datos", 12, "5-6", 25);
        colegio.eliminaMateria("Estructura de datos");
        System.out.println(colegio.imprimeMateria());

    }

}
