import java.util.ArrayList;
import java.util.Collections;

public class Instituto2 {

    public static void main(String[] args) {

        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Pep", "1111A", 15));
        alumnos.add(new Alumno("Ana", "2222A", 17));
        alumnos.add(new Alumno("Ana", "3333A", 14));
        alumnos.add(new Alumno("Ben", "4444A", 14));
        
        Collections.sort(alumnos, new AlumnoPorNiaComparator());
        System.out.println("Alumnos ordenados por NIA:"); 
        System.out.println(alumnos);
        

        Collections.sort(alumnos, new AlumnoPorEdadComparator());
        System.out.println("Alumnos ordenados por edad:"); 
        System.out.println(alumnos); 
        
    }
}
