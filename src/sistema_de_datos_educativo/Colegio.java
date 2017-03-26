/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_de_datos_educativo;

import java.util.Date;

/**
 *
 * @author aldomora89
 */
public class Colegio {
    
    ColaProf profes;
    ColaEst estudiantes;
    ColaMat materias;
    ListaUsuarios listaUsuarios;
    int idProfes=1;
    int idEstudiantes=1;
    int idUsuarios=1;
    
    public Colegio() {
        profes = new ColaProf();
        estudiantes = new ColaEst();
        materias = new ColaMat();
        listaUsuarios = new ListaUsuarios();
       
    }
    
    public ColaProf getProfes() {
        return profes;
    }
    
    public void setProfes(ColaProf profes) {
        this.profes = profes;
    }
    
    public ColaEst getEstudiantes() {
        return estudiantes;
    }
    
    public void setEstudiantes(ColaEst estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    public ColaMat getMaterias() {
        return materias;
    }
    
    public void setMaterias(ColaMat materias) {
        this.materias = materias;
    }
    
    public ListaUsuarios getListaUsuarios() {
        return listaUsuarios;
    }
    
    public void setListaUsuarios(ListaUsuarios listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    
    public void AgregaProfesor(String Nombre, String Apellido, String Correo, String Curso, int Telefono, int Edad, Date fechaDeIngreso) {
        Profesor profesor = profes.enCola(new NodoProf(new Profesor(Nombre, Apellido, Correo, Curso,idProfes++, 0, 0, fechaDeIngreso)));
        String nombreUsuario = profesor.getNombre().toLowerCase().charAt(0) + profesor.getApellido().toLowerCase()+ profesor.getId();
        agregaUsuario(nombreUsuario, "profesor", "Profesor", profesor, null);
    }
    
    public String imprimeProfe() {
        return profes.toString();
        
    }

<<<<<<< Updated upstream
    public void agregaEstudiantes(String NombreEstudiante, String ApellidoEstudiante, String Encargado, String CorreoEstudiante, String TelefonoEstudiante, int EdadEstudiante, String NivelEducativo) {
        Estudiante estudiante =estudiantes.enCola(new NodoEst(new Estudiante(NombreEstudiante, ApellidoEstudiante, Encargado, CorreoEstudiante, idEstudiantes++, TelefonoEstudiante, EdadEstudiante, NivelEducativo)));
=======
    public void agregaEstudiantes (String Nombre, String Apellido, String Encargado, String Correo, int id, String Telefono, int Edad, String NivelEducativo) {
        Estudiante estudiante =estudiantes.enCola(new NodoEst(new Estudiante(Nombre, Apellido, Encargado, Correo, id++, Telefono, Edad, NivelEducativo)));
>>>>>>> Stashed changes
        String nombreUsuario = estudiante.getNombre().toLowerCase().charAt(0) + estudiante.getApellido().toLowerCase()+ estudiante.getId();
        agregaUsuario(nombreUsuario, "estudiante", "Estudiante", null, estudiante);
    }
    public String imprimeUsuario(){
        return listaUsuarios.toString();
    }
    
    public String imprimeEstudiantes() {
        return estudiantes.toString();
    }

    public void agregaMateria(String NombreMateria, int Aula, String Horario, int canMaxAlumnos) {
        materias.enCola(new NodoMat(new Materia(NombreMateria, Aula, Horario, canMaxAlumnos)));
    }
    public String imprimeMateria(){
        return materias.toString();
    }
    public void agregaProfeAmateria(int idProfesor, String NombreMateria){
        Profesor profe =profes.BuscarProfesor(idProfesor);
        materias.agregarProfeAmateria(profe, NombreMateria);
    }
    
    public void agregaEstudiantesAmateria(int idEstudiante, String NombreMat){
        Estudiante estudiante = estudiantes.BuscarEstudiante(idEstudiante);
        materias.agregarEsteAmateria(estudiante, NombreMat);
        
    }
    
    public String imprimeEstMateria(String materia){
        return materias.imprimeEstudiantesMateria(materia);
    }
    public void cambiaCorreoProfesor(int id){
        Profesor profe = profes.BuscarProfesor(id);
        profes.modificaCorreoProfe(id);
    }
    public void eliminaProfesor(int id){
        profes.eliminadatosProfesor(id);
    }
    
    public void agregaUsuario(String nombre, String password, String rol,Profesor profe, Estudiante estudiante){
        Usuario usuario = new Usuario(nombre,password,rol,idUsuarios++);
        if(profe!=null){
            usuario.setProfesor(profe);
            listaUsuarios.insert((usuario));
        }else if(estudiante!=null){
            usuario.setEstuduante(estudiante);
            listaUsuarios.insert((usuario));
        }
    }
}
