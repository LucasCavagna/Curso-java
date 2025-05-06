public class AppEmpleados {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", "Pérez", 5, 3000.0);
        Empleado empleado2 = new Empleado("Ana", "Gómez", 20, 5000.0);
        Empleado empleado3 = new Empleado("Luis", "Martínez", 2, 2500.0);

        empleado1.mostrarDatos();
        empleado1.status();
        System.out.println("--------------------------");

        empleado2.mostrarDatos();
        empleado2.status();
        System.out.println("--------------------------");

        empleado3.mostrarDatos();
        empleado3.status();
        System.out.println("--------------------------");

    }
}
