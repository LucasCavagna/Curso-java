public class Cliente {

    private String nombre;
    private String apellidos;
    private String direccion;
    private String localidad;

    //////////////////////////////////////////////////////
    // CONSTRUCTORES
    //////////////////////////////////////////////////////

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public Cliente(String nombre, String apellidos, String direccion,
            String localidad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.localidad = localidad;

    }

    //////////////////////////////////////////////////////
    // GETTERS & SETTERS
    //////////////////////////////////////////////////////

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }


    //////////////////////////////////////////////////////
    // MÉTODOS
    //////////////////////////////////////////////////////

    public String nombreCompleto() {
        return nombre + " " + apellidos;
    }

    public String direccionCompleta() {
        return direccion + ", " + localidad;
    }

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + "]";
    }
}
