public class AppEstudiantePersona {

    public static void main(String[] args) {
        Persona p = new Persona("Luís García", 20);
        Estudiante e = new Estudiante("Luís García", 20, 100);
        Estudiante e2 = new Estudiante("Pepe Martínez", 20);

        
        System.out.println(p);
        System.out.println(e);
        System.out.println(e2);
        p.mostrarDatos();
        e.toString();

    }
}
