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
//En la clase colegio se establecen todos los metodos para realizar todas las acciones necesarias para poder
//obtener todos los resusltados del programa, se puede ver como una clase admin

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

    /**
     *
     * El metodo agregaProfesor lo que se encarga es de agregar un profesor a la
     * cola de profesores, con los atributos necesarios, que son los que el
     * profesor obtiene. de la misma forma cuando se crea un profesor se crea
     * tambien un usuario en el programa.
     */
    public void AgregaProfesor(String Nombre, String Apellido, String Correo, String Curso, int Telefono, int Edad, Date fechaDeIngreso) {
        Profesor profesor = profes.enCola(new NodoProf(new Profesor(Nombre, Apellido, Correo, Curso, idProfes++, Telefono, Edad, fechaDeIngreso)));
        agregaUsuario(profesor.getNombreUsuario().toLowerCase(), "profesor", "Profesor", profesor, null);
    }

    /**
     * El metodo imprime profesor es un metodo simple, lo cual su funcion es
     * imprimir toda la cola de profesores que se tiene
     */
    public String imprimeProfe() {
        return profes.toString();

    }

    /**
     *
     * El metodo agrega estudiantes es muy similar al metodo agrega profesor,
     * este recibe todos los atributos que el estudiante tiene. Estos se le
     * mandan por parametro y se le agregan a la cola y de la misma forma se
     * agrega un usuario.
     */
    public void agregaEstudiantes(String Nombre, String Apellido, String Encargado, String Correo, String Telefono, int Edad, String NivelEducativo) {
        Estudiante estudiante = estudiantes.enCola(new NodoEst(new Estudiante(Nombre, Apellido, Encargado, Correo, idEstudiantes++, Telefono, Edad, NivelEducativo)));
        agregaUsuario(estudiante.getNombreUsuario().toLowerCase(), "estudiante", "Estudiante", null, estudiante);
    }

    /**
     *
     * Este metodo lo que realiza es la impresion de los estudiantes que hay en
     * la cola de estudiantes
     */
    public String imprimeEstudiantes() {
        return estudiantes.toString();
    }

    /**
     *
     * El metodo imprimeNomEstu recibe un id como por parametro para asi poder
     * buscar un estudiante especifico en la cola. Se busca un estudiante que
     * tenga ese mismo id que se envia por parametro para asi poder retornarlo y
     * saber quien es. Si no se encontrara retornaria un no existe
     */
    public String imprimeNomEstu(int id) {

        Estudiante estudiante = estudiantes.BuscarEstudiante(id);
        if (estudiante != null) {
            return estudiante.getNombre();
        }
        return "No Existe";
    }

    /**
     *
     * En los siguientes 6 metodos ( imprimeApelliEstu, imprimeCorreoEstu,
     * imprimeEncargadoEstu,imprimeEdadEstu, imprimeTelEstu, imprimeNivelEstu)
     * se realiza el mismo proceso, Lo que se realiza es recibir un id por
     * parametro para asi buscar un estudiante con ese mismo ID para asi poder
     * retornarlo en caso de que se encuentre, si este no se encuentra se
     * retornaria un no existe. La diferencia es que todos los metodos retorna
     * una valor diferente en imprimeApelliEstu retorna un apellido de
     * estudiante. imprimeCorreoEstu retorna el correo del estudiante.
     * imprimeEncargadoEstu retorna el encargado del estudiante,imprimeEdadEstu
     * retorna la edad del estudiante, imprimeTelEstu retorna el telefono del
     * estudiante, imprimeNivelEstu retorna el nivel del estudiante.
     */
    public String imprimeApelliEstu(int id) {

        Estudiante estudiante = estudiantes.BuscarEstudiante(id);
        if (estudiante != null) {
            return estudiante.getApellido();
        }
        return "No Existe";
    }

    public String imprimeCorreoEstu(int id) {

        Estudiante estudiante = estudiantes.BuscarEstudiante(id);
        if (estudiante != null) {
            return estudiante.getCorreo();
        }
        return "No Existe";
    }

    public String imprimeEncargadoEstu(int id) {

        Estudiante estudiante = estudiantes.BuscarEstudiante(id);
        if (estudiante != null) {
            return estudiante.getEncargado();
        }
        return "No Existe";
    }

    public int imprimeEdadEstu(int id) {

        Estudiante estudiante = estudiantes.BuscarEstudiante(id);
        if (estudiante != null) {

            return estudiante.getEdad();
        }
        return 0;
    }

    public String imprimeTelEstu(int id) {

        Estudiante estudiante = estudiantes.BuscarEstudiante(id);
        if (estudiante != null) {

            return estudiante.getTelefono();
        }
        return "No existe";
    }

    public String imprimeNivelEstu(int id) {

        Estudiante estudiante = estudiantes.BuscarEstudiante(id);
        if (estudiante != null) {

            return estudiante.getNivelEducativo();
        }
        return "No Existe";
    }

    public String imprimeNombreUser(int id) {

        Usuario usuario = listaUsuarios.BuscarUsuarioID(id);
        if (usuario != null) {

            return usuario.getNombre();
        }
        return "No Existe";
    }

    public String imprimePasswordUser(int id) {

        Usuario usuario = listaUsuarios.BuscarUsuarioID(id);
        if (usuario != null) {

            return usuario.getPassword();
        }
        return "No Existe";
    }

    /**
     * El metodo agregaMateria es el que se utiliza para poder agregar materias
     * a la cola, con forme a parametros que el necesita. Luego de que ya se
     * enviaron todos los parametros estos se encolan en la cola. Si no se
     * encontrara se muestra que no existe esa materia.
     */
    public void agregaMateria(String NombreMateria, int Aula, String Horario, int canMaxAlumnos) {
        materias.enCola(new NodoMat(new Materia(NombreMateria, Aula, Horario, canMaxAlumnos)));
    }

    /**
     * El metodo imprime materia lo que realiza es imprimir la cola de materias.
     */
    public String imprimeMateria() {
        return materias.toString();
    }

    /**
     *
     * El metodo imprimeMatHorario recibe un nombreMateria por parametro, para
     * asi poderlo buscar entre la cola y poder obtener el horario que tiene
     * asignado. Ya cuando se encuentra la materia este retorna el horario de la
     * materia encontrada. Si no se encontrara se muestra que no existe esa
     * materia.
     */
    public String imprimeMatHorario(String nombreMateria) {
        Materia materia = materias.BuscarMateria(nombreMateria);
        if (materia != null) {
            return materia.getHorario();
        }
        return "No Existe";
    }

    /**
     * El metodo imprimeMatAula lo que se realiza es que se recibe un parametro
     * del nombre de la materia, se busca dentro de la cola esa materia. Ya
     * cuando se encuentra este imprime el horario que tiene asignado esa
     * materia.
     *
     */
    public int imprimeMatAula(String nombreMateria) {
        Materia materia = materias.BuscarMateria(nombreMateria);
        if (materia != null) {
            return materia.getAula();
        }
        return 0;
    }

    /**
     * El metodo imprimeMatAlum lo que se realiza es que se recibe un parametro
     * del nombre de la materia, se busca dentro de la cola esa materia. Ya
     * cuando se encuentra este imprime la cantidad maxima de alumnos que tiene
     * esta materia que tiene asignado esa materia.
     *
     */
    public int imprimeMatAlum(String nombreMateria) {
        Materia materia = materias.BuscarMateria(nombreMateria);
        if (materia != null) {
            return materia.getCanMaxAlumnos();
        }
        return 0;
    }

    /**
     * El metodo imprimeIDprof lo que se realiza es que se recibe un parametro
     * del nombre de la materia, se busca dentro de la cola esa materia. Ya
     * cuando se encuentra este imprime el el profesor que tiene asignado esa
     * materia. Si no se encontrara se muestra un -1.
     */
    public int imprimeMatIDprof(String nombreMateria) {
        Materia materia = materias.BuscarMateria(nombreMateria);
        if (materia != null) {
            if (materia.getProfe() == null) {
                return -1;
            } else {
                return materia.getProfe().getId();
            }

        }
        return 0;
    }

    /**
     * El metodo agregaProfeAmateria recibe 2 parametros 1 id y 1
     * nombreMateria,por que lo que primero se realiza es buscar a un profesor
     * por medio de el id que esta en el parametro. este id profesor se utiliza
     * en el metodo buscar profesor para poder encontrar a un profesor, despues
     * de eso hay un metodo que se llama modifica profe, por que el profesor al
     * inicio no tiene un curso asignado, entonces lo que se realiza es
     * modificar es la materia asignada de este profesor con la que se le esta
     * enviando por parametro. Por ultimo lo que se realizaes que agrega el
     * profe a la materia con el metodo agregarProfeAmateria con los atributos
     * que se utilizan al inicio.
     *
     */
    public void agregaProfeAmateria(int idProfesor, String NombreMateria) {
        Profesor profe = profes.BuscarProfesor(idProfesor);
        profes.modificaProfe(profe.getCorreo(), profe.getTelefono(), profe.getId(), NombreMateria);
        materias.agregarProfeAmateria(profe, NombreMateria);
    }

    /**
     * El metodo agregaEstudianteAmateria recibe in idEstudiante y un nombreMat,
     * se busca por id en la cola de estudiantes por medio del metodo buscar
     * estudiante. Luego de haber encontrado al estudiante esto lo agrega a la
     * materia
     *
     */
    public void agregaEstudiantesAmateria(int idEstudiante, String NombreMat) {
        Estudiante estudiante = estudiantes.BuscarEstudiante(idEstudiante);
        materias.agregarEsteAmateria(estudiante, NombreMat);

    }

    /**
     *
     * El metodo imprimeEstMateria recibe un nombre de materia por parametro y
     * este imprime los estudiantes de la materia que se ingreso por parametro.
     */
    public String imprimeEstMateria(String materia) {
        return materias.imprimeEstudiantesMateria(materia);
    }

    /**
     *
     * El metodo eliminaProfesor lo que realiza es recibir un id por parametro,
     * se utliza el metodo buscarprofesor para poder encontrar el profesor por
     * medio del id que esta por parametro. Se elimina el profesor de la lista
     * de usuarios y por ultimo se elimina de la cola
     *
     */
    public void eliminaProfesor(int id) {
        Profesor profesor = profes.BuscarProfesor(id);
        listaUsuarios.eliminar(profesor.getNombreUsuario());
        profes.eliminadatosProfesor(id);
    }

    /**
     *
     * El metodo eliminaEstudiante lo que realiza es recibir un id por
     * parametro, se utliza el metodo buscarEstudiante para poder encontrar el
     * estudiante por medio del id que esta por parametro. Se elimina el
     * estudiante de la lista de usuarios y por ultimo se elimina de la cola de
     * estudiantes.
     */
    public void eliminaEstudiante(int id) {
        Estudiante estudiante = estudiantes.BuscarEstudiante(id);
        listaUsuarios.eliminar(estudiante.getNombreUsuario());
        estudiantes.eliminadatosEstudiante(id);

    }

    /**
     *
     * El metodo eliminaMateri lo que realiza es recibir un nombre de materia
     * por parametro, se utliza el metodo buscarMateria para poder encontrarla
     * materia por medio del nombre de la materia que esta por parametro. Se
     * elimina la materia de la cola de materias.
     */
    public void eliminaMateria(String nombreMateria) {
        Materia materia = materias.BuscarMateria(nombreMateria);
        materias.eliminadatosMateria(nombreMateria);

    }

    /**
     *
     * El metodo agregaUsuario recibe por parametro un nombre(que es el nombre
     * de usuario, el rol(ya sea profesor, estudiante o admin) un estudiante y
     * un profesor. primero valida si el profesor que se ingresa es diferente de
     * null, este lo agrega a la lista de usuarios, y despues valida si el
     * estudiante es diferente de null para agregarlo a la lista de usuarios.
     *
     */
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

    /**
     * El metodo imprimeUsuario lo que se realiza es una impresion de la lista
     * de usuarios que hay en el sistema
     *
     */
    public String imprimeUsuario() {
        return listaUsuarios.toString();
    }

    /**
     * El metodo validaUsuario recibe un nombreUsuario y una contrasena, despues
     * de esto verifica si este usuario existe o no.
     *
     */
    public Usuario validaUsuario(String nombreUsuario, String password) {
        Usuario usuario = listaUsuarios.BuscarUsuario(nombreUsuario, password);
        if (usuario != null) {
            return usuario;
        } else {
            return null;
        }

    }

    /**
     * El metodo validaEst recibe un id por parametro y verifica si este
     * estudiante existe o no.
     *
     */
    public Estudiante validaEst(int id) {
        Estudiante estudiante = estudiantes.BuscarEstudiante(id);
        if (estudiante != null) {
            return estudiante;
        } else {
            return null;
        }

    }

    /**
     * El metodo eliminaUsuario recibe in ID por parametro. Lo busca en la lista
     * de usuarios por medio del metodo BuscarUsuarioID y luego este es
     * eliminado de la lista de usuarios
     *
     */
    public void eliminaUsuario(int id) {
        Usuario usuario = listaUsuarios.BuscarUsuarioID(id);
        listaUsuarios.eliminar(usuario.getNombre());

    }

    /**
     * El metodo agregaAdmin recibe un nombre y una contrasena, ya dentro del
     * metodo este agrega al usuario a la lista, y tambien se le define su
     * rol(Administrador).
     */
    public void agregaAdmin(String nombre, String password) {
        Usuario usuario = new Usuario(nombre, password, "Administrador", idUsuarios++);
        listaUsuarios.insert((usuario));
    }

    /**
     * El metodo modifica materia recibe un nombre de la materia, el numero de
     * aula, el horario y la cantidad maxima de alumnos. Luego conforme estos
     * atributos se realiza la modificacion de los mismos en la interfaz.
     *
     */
    public void modificaMateria(String NombreMateria, int Aula, String Horario, int canMaxAlumnos) {
        materias.modificaMateria(NombreMateria, Aula, Horario, canMaxAlumnos);
    }

    /**
     * El metodo modificaProfeMat recibe un id de profesor, este se busca en la
     * cola de profesores. Luego conforme estos atributos se realiza la
     * modificacion de la materia.
     *
     */
    public void modificaProfeMat(int idpProfe, String materia) {
        Profesor profe = profes.BuscarProfesor(idpProfe);
        materias.modificaProfeMateria(profe, materia);
    }

    /**
     * El metodo modificaProfeAdmin recibe por parametroun id de profesor,un
     * nombre profesor, un correo, un curso, un telefono, una edad y una fecha
     * de ingreso. Luego conforme estos atributos se realiza la modificacion de
     * los mismos en la interfaz.
     *
     */
    public void modificaProfeAdmin(int id, String Nombre, String Apellido, String Correo, String Curso, int Telefono, int Edad, Date fechaDeIngreso) {
        profes.modificaProfeAdmin(Nombre, Apellido, Correo, Curso, id, Telefono, Edad, fechaDeIngreso);

    }

    /**
     * El metodo modificaEstuduanteAdmin es a la parte del estudiante que el
     * administrador tiene acceso, y este los puede modificar, el metodo recibe
     * por parametr un nombre,apellido, encargado, correo, id telefono, edad y
     * el nivel educativo. Se busca el estudiante conforme al id que se ingreso.
     * Luego conforme estos atributos se realiza la modificacion de los mismos
     * en la interfaz.
     *
     */
    public void modificaEstudianteAdmin(String Nombre, String Apellido, String Encargado, String Correo, int id, String Telefono, int edad, String NivelEducativo) {
        Estudiante estudiante = estudiantes.BuscarEstudiante(id);
        estudiantes.modificaEstudianteAdmin(Nombre, Apellido, Encargado, Correo, id, Telefono, edad, NivelEducativo);
    }

    /**
     * Este es la parte del programa a la que el estudiante tiene acceso, y los
     * atributos que el puede cambiar son : Correo y el id Ya despues de
     * ingresados los datos se puede modificar al estudiante
     */
    public void modifySingleEstudent(String Correo, String Telefono, int id) {
        Estudiante estudiante = estudiantes.modificaEstuduante(Correo, Telefono, id);
        JOptionPane.showMessageDialog(null, estudiantes.BuscarEstudiante(id));
    }

    /**
     * El metodo modificaUsuario lo que realiza es recibir un usuario, password
     * y un id Despues de eso con el metodo MOdificaUsuario el usuario es
     * modificado de la lista.
     */
    public void modificaUsuario(String usuario, String password, int id) {
        listaUsuarios.ModificaUsuario(usuario, password, id);
        JOptionPane.showMessageDialog(null, listaUsuarios.BuscarUsuario(usuario, password));

    }

    /**
     *
     * En los metodos imprimeProfeNom,imprimeProfeApel,imprimeProfeCorreo,
     * imprimeProfeCurso, imprimeProfeTel, imprimeProfeEdad. Su logica es la
     * misma recibe un id por parametro para buscar al profesor, luego retrona
     * un dato del profesor. la unica diferencia es los datos de retorna.
     * imprimeProfeNom retorna El nombre del profesor, imprimeProfeApel retorna
     * el apellido del profesor, imprimeProfeCorreo retorna el correo del
     * profesor, imprimeProfeCurso retorna el curso del profesor,
     * imprimeProfeTel retorna el telfono del profesor, imprimeProfeEdad retorna
     * la edad del profesor.
     *
     */
    public String imprimeProfeNom(int id) {
        Profesor profe = profes.BuscarProfesor(id);

        if (profe != null) {
            return profe.getNombre();
        }

        return "No existe";
    }

    public String imprimeProfeApel(int id) {
        Profesor profe = profes.BuscarProfesor(id);

        if (profe != null) {
            return profe.getApellido();
        }

        return "No existe";

    }

    public String imprimeProfeCorreo(int id) {
        Profesor profe = profes.BuscarProfesor(id);

        if (profe != null) {
            return profe.getCorreo();
        }

        return "No existe";

    }

    public String imprimeProfeCurso(int id) {
        Profesor profe = profes.BuscarProfesor(id);

        if (profe != null) {
            return profe.getCurso();
        }

        return "No existe";

    }

    public int imprimeProfeTel(int id) {
        Profesor profe = profes.BuscarProfesor(id);

        if (profe != null) {
            return profe.getTelefono();
        }

        return 0;

    }

    public int imprimeProfeEdad(int id) {
        Profesor profe = profes.BuscarProfesor(id);

        if (profe != null) {
            return profe.getEdad();
        }

        return 0;

    }


/**
 * El metodo agrega nota recibe un id de estudiante, nota y nombre materia. Se
 * realiza una busqueda del estudiante y tambien de la materia conforme al ID.
 * Por ultimo agrega la nota a la materia con los anteriores atributos.
 *
 */
public void AgregaNota(int id, int nota, String materia) {
        Estudiante estudiante = estudiantes.BuscarEstudiante(id);
        Materia materia1 = materias.BuscarMateria(materia);
        materias.agregaNota(estudiante, materia1, nota);

    }

    /**
     * El metodo imprimirAprobados recibe una materia y se llama al metodo
     * generarNotas y por ultimo la retorna las notas de los aprobados Lo que se
     * hace es recorrer el arbol del lado derecho para poder observar que
     * estudiantes pasaron la materia debido a que la raiz es 70, y ese es el
     * dato que retorna.
     */
    public String imprimirAprobados(String Materia) {
        materias.generarNotas(Materia);

        return materias.BuscarMateria(Materia).getNotas().notasAprobados();
    }

    /**
     * El metodo imprimirReprobados recibe una materia y se llama al metodo
     * generarNotas y por ultimo la retorna las notas de los aprobados Lo que se
     * hace es recorrer el arbol del lado izquierdo para mostrar los alumnos
     * reprobados debido a que la raiz es 70, y ese es el dato que retorna.
     */
    public String imprimirReprobados(String Materia) {
        materias.generarNotas(Materia);

        return materias.BuscarMateria(Materia).getNotas().notasReprobados();
    }
}
