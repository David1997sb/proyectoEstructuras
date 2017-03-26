# proyectoEstructuras
Hola! Yo ya me pude conectar

    public Estudiante modificaEstudiante(String Nombre, String Apellido, String Encargado, String Correo, int id, String Telefono, int Edad, String Nivel) {
        
        while (aux != null) {
            if (aux.getEstudiante().getId() == id) {
                aux.getEstudiante().setNombre(Nombre);
                aux.getEstudiante().setApellido(Apellido);
                aux.getEstudiante().setEncargado(Encargado);
                        aux.getEstudiante().setId(id);
                aux.getEstudiante().setTelefono(Telefono);
                aux.getEstudiante().setEdad(Edad);
                aux.getEstudiante().setNivel(Nivel);
                
                
            }
            aux = aux.getAtras();

        }
        return null;
    }
