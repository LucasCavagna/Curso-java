public class Estudiante extends Persona {

    private int creditos;

    public Estudiante(String nombre, int edad) {
        super(nombre, edad);
    }

    public Estudiante(String nombre, int edad, int creditos) {
        super(nombre, edad);
        this.creditos = creditos;
    }
    
    @Override
    public void mostrarDatos() {
        
        System.out.println("Nombre estaudiante es: "+ getNombre());
    }

    @Override
    public String toString() {
        mostrarDatos();
        return super.toString() + " Estudiante [creditos=" + creditos+ "]";
    }
    

    
}
