package sistema_de_datos_educativo;

import Estructuras.ColaEst;
import Estructuras.ListaUsuarios;
import Estructuras.ColaMat;
import Estructuras.NodoMat;
import Estructuras.NodoProf;
import Estructuras.ColaProf;
import Estructuras.NodoEst;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author aldomora89
 */
public class Colegio {

    ColaProf profes;
    ColaEst estudiantes;
    ColaMat materias;
    ListaUsuarios listaUsuarios;
    int idProfes = 1;
    int idEstudiantes = 1;
    int idUsuarios = 1;

    public Colegio() {
        profes = new ColaProf();
        estudiantes = new ColaEst();
        materias = new ColaMat();
        listaUsuarios = new ListaUsuarios();

    }

    public void AgregaProfesor(String Nombre, String Apellido, String Correo, String Curso, int Telefono, int Edad, Date fechaDeIngreso) {
        Profesor profesor = profes.enCola(new NodoProf(new Profesor(Nombre, Apellido, Correo, Curso, idProfes++, Telefono, Edad, fechaDeIngreso)));
        agregaUsuario(profesor.getNombreUsuario().toLowerCase(), "profesor", "Profesor", profesor, null);
    }

    public String imprimeProfe() {
        return profes.toString();

    }

    public void agregaEstudiantes(String Nombre, String Apellido, String Encargado, String Correo, String Telefono, int Edad, String NivelEducativo) {
        Estudiante estudiante = estudiantes.enCola(new NodoEst(new Estudiante(Nombre, Apellido, Encargado, Correo, idEstudiantes++, Telefono, Edad, NivelEducativo)));
        agregaUsuario(estudiante.getNombreUsuario().toLowerCase(), "estudiante", "Estudiante", null, estudiante);
    }

    public String imprimeEstudiantes() {
        return estudiantes.toString();
    }

    public void agregaMateria(String NombreMateria, int Aula, String Horario, int canMaxAlumnos) {
        materias.enCola(new NodoMat(new Materia(NombreMateria, Aula, Horario, canMaxAlumnos)));
    }

    public String imprimeMateria() {
        return materias.toString();
    }

    public void agregaProfeAmateria(int idProfesor, String NombreMateria) {
        Profesor profe = profes.BuscarProfesor(idProfesor);
        materias.agregarProfeAmateria(profe, NombreMateria);
    }
    
   

    public void agregaEstudiantesAmateria(int idEstudiante, String NombreMat) {
        Estudiante estudiante = estudiantes.BuscarEstudiante(idEstudiante);
        materias.agregarEsteAmateria(estudiante, NombreMat);

    }

    public String imprimeEstMateria(String materia) {
        return materias.imprimeEstudiantesMateria(materia);
    }

    public void eliminaProfesor(int id) {
        Profesor profesor = profes.BuscarProfesor(id);
        listaUsuarios.eliminar(profesor.getNombreUsuario());
        profes.eliminadatosProfesor(id);
    }

   public void eliminaEstudiante(int id) {
        Estudiante estudiante = estudiantes.BuscarEstudiante(id);
        listaUsuarios.eliminar(estudiante.getNombre());
        estudiantes.eliminadatosEstudiante(id);

    }


    public void eliminaMateria(String nombreMateria) {
        Materia materia = materias.BuscarMateria(nombreMateria);
        materias.eliminadatosMateria(nombreMateria);

    }

    public void agregaUsuario(String nombre, String password, String rol, Profesor profe, Estudiante estudiante) {
        Usuario usuario = new Usuario(nombre, password, rol, idUsuarios++);
        if (profe != null) {
            usuario.setProfesor(profe);
            listaUsuarios.insert((usuario));
        } else if (estudiante != null) {
            usuario.setEstudiante(estudiante);
            listaUsuarios.insert((usuario));
        }
    }

    public String imprimeUsuario() {
        return listaUsuarios.toString();
    }

    public Usuario validaUsuario(String nombreUsuario, String password) {
        Usuario usuario = listaUsuarios.BuscarUsuario(nombreUsuario, password);
        if (usuario != null) {
            return usuario;
        } else {
            return null;
        }

    }
    
    public void eliminaUsuario (int id){
        Usuario usuario = listaUsuarios.BuscarUsuarioID(id);
        listaUsuarios.eliminar(usuario.getNombre());
        
    }

    public void agregaAdmin(String nombre, String password) {
        Usuario usuario = new Usuario(nombre, password, "Administrador", idUsuarios++);
        listaUsuarios.insert((usuario));
    }

    public void modificaMateria(String NombreMateria, int Aula, String Horario, int canMaxAlumnos) {
        materias.modificaMateria(NombreMateria, Aula, Horario, canMaxAlumnos);
    }

    public void modificaProfeMat(int idpProfe, String materia) {
        Profesor profe = profes.BuscarProfesor(idpProfe);
        materias.modificaProfeMateria(profe,materia);
    }
    
    public void modificaProfeAdmin(int id,String Nombre, String Apellido, String Correo, String Curso, int Telefono, int Edad, Date fechaDeIngreso){
        profes.modificaProfeAdmin(Nombre, Apellido, Correo, Curso, id, Telefono, Edad, fechaDeIngreso);
        
    }
    public void modifySigleTeacher(String Correo, int Telefono, int id){
        profes.modificaProfe(Correo, Telefono, id);
        profes.BuscarProfesor(id);
    }
    
    public void modificaEstudianteAdmin(String Nombre, String Apellido, String Encargado, String Correo, int id, String Telefono,int edad, String NivelEducativo){
        Estudiante estudiante= estudiantes.BuscarEstudiante(id);
        estudiantes.modificaEstudianteAdmin(Nombre, Apellido, Encargado, Correo, id, Telefono, edad, NivelEducativo);
    }
    public void modifySingleEstudent(String Correo, String Telefono, int id){
        Estudiante estudiante = estudiantes.modificaEstuduante(Correo, Telefono, id);
        JOptionPane.showMessageDialog(null,estudiantes.BuscarEstudiante(id));
    }
    public void modificaUsuario(String usuario, String password, int id){
        listaUsuarios.ModificaUsuario(usuario, password, id);
        JOptionPane.showMessageDialog( null, listaUsuarios.BuscarUsuario(usuario, password));
        
    }
   
 
       
        
    }

