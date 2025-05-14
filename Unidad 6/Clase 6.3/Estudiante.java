/**
 * The Estudiante class represents a student, which is a subclass of Persona.
 * It includes additional information about the number of credits the student has.
 * 
 * <p>This class provides constructors to initialize the student's name, age, 
 * and optionally the number of credits. It also overrides the toString method 
 * to include the student's credit information in the string representation.
 * 
 * @author Your Name
 */
public class Estudiante extends Persona {

    private int creditos;

    /**
     * Constructor for the Estudiante class.
     *
     * @param nombre The name of the student.
     * @param edad   The age of the student.
     */
    public Estudiante(String nombre, int edad) {
        super(nombre, edad);
    }

    public Estudiante(String nombre, int edad, int creditos) {
        super(nombre, edad);
        this.creditos = creditos;
    }

    
    @Override
    public String toString() {
        return super.toString() + " Estudiante [creditos=" + creditos + "]";
    }
    

    
}
