public class Main {

    public static void main(String[] args) {
        Persona p1 = new Persona("Juan", 25, "12345678A");
        p1.mostrarDatos();
        p1.mostrarDatosConBordes();

        Persona p2 = new Persona("Marta", 35, "87654321A");
        p2.mostrarDatos();
        p2.mostrarDatosConBordes();
    }
}
