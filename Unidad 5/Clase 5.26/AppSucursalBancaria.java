
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class AppSucursalBancaria {

    private static Scanner entrada = new Scanner(System.in);
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static ArrayList<Cuenta> cuentas = new ArrayList<>();
    private static Cuenta cuentaActiva = null;
    private static int contadorCuenta = 1;

    public static void main(String[] args) {
        int opcion = 0;
        while (opcion != 4) {
            menuPrincipal();
            String input = entrada.nextLine();
            if (!input.matches("\\d+")) {
                System.out.println("Opción no válida, selecciona una opción entre 1 y 4");
                continue;
            }
            opcion = Integer.parseInt(input);
            switch (opcion) {
                case 1: crearCliente(); break;
                case 2: crearCuenta(); break;
                case 3: seleccionarCuenta(); break;
                case 4: System.out.println("Fin del programa"); break;
                default: System.out.println("Opción no válida, selecciona una opción entre 1 y 4");
            }
        }
        entrada.close();
    }

    static void crearCliente() {
        System.out.println("Dime el nombre del cliente");
        String nombre = validarNombre();
        System.out.println("Dime los apellidos del cliente");
        String apellidos = validarString();
        System.out.println("Dime la dirección del cliente");
        String direccion = entrada.nextLine();
        System.out.println("Dime la ciudad de residencia del cliente");
        String ciudad = entrada.nextLine();
        System.out.println("Dime la fecha de nacimiento del cliente AAAA-MM-DD");
        LocalDate fecha = validarFechaNacimiento();

        clientes.add(new Cliente(nombre, apellidos, direccion, ciudad, fecha));
        System.out.println("El cliente de nombre " + nombre + " " + apellidos + " se ha creado correctamente");
    }

    static LocalDate validarFechaNacimiento() {
        while (true) {
            String input = entrada.nextLine();
            if (input.matches("\\d{4}-\\d{2}-\\d{2}")) {
                return LocalDate.parse(input);
            } else {
                System.out.println("El formato de la fecha no es válido: Introduce una nueva fecha con formato AAAA-MM-DD");
            }
        }
    }

    static String validarString() {
        while (true) {
            String s = entrada.nextLine();
            if (s.matches("[a-zA-ZñÑáéíóúÁÉÍÓÚüÜ\\s]+")) return s;
            System.out.println("ERROR: únicamente puedes introducir letras y espacios en blanco");
        }
    }

    static String validarNombre() {
        while (true) {
            String s = validarString();
            boolean existe = false;
            for (Cliente c : clientes) {
                if (c.getNombre().equals(s)) {
                    System.out.println("Ya existe un cliente con ese nombre");
                    existe = true;
                    break;
                }
            }
            if (!existe) return s;
        }
    }

    static void crearCuenta() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes en la sucursal, primero debes crear uno");
            return;
        }

        Cliente cliente = validarCliente();
        Cuenta cuenta = validarCuenta(cliente);
        cuentas.add(cuenta);
        System.out.println("La cuenta a nombre de " + cliente.nombreCompleto() + " se ha creado correctamente");
    }

    static Cuenta validarCuenta(Cliente c) {
        int opcion = 0;
        while (opcion < 1 || opcion > 3) {
            menuTipoCuenta();
            String input = entrada.nextLine();
            if (input.matches("[1]")) {
                opcion = Integer.parseInt(input);
                return new Cuenta(contadorCuenta++, 0.0, c);
            } else {
                System.out.println("Tipo de cuenta no válida, selecciona una opción entre 1 y 3");
            }
        }
        return null;
    }

    static Cliente validarCliente() {
        String nombre;
        while (true) {
            System.out.println("Dime el nombre del cliente que quiere abrir una cuenta");
            for (Cliente c : clientes) {
                System.out.println(c.getNombre());
            }
            nombre = entrada.nextLine();
            for (Cliente c : clientes) {
                if (c.getNombre().equals(nombre)) {
                    return c;
                }
            }
        }
    }

    static void seleccionarCuenta() {
        if (cuentas.isEmpty()) {
            System.out.println("No hay ninguna cuenta en la sucursal, primero debes crear alguna");
            return;
        }

        int numCuenta = 0;
        do {
            System.out.println("Selecciona un número de cuenta");
            for (Cuenta c : cuentas) {
                System.out.println(c.toString());
            }
            String input = entrada.nextLine();
            if (input.matches("\\d+")) {
                numCuenta = Integer.parseInt(input);
            } else {
                System.out.println("Debes seleccionar un número de cuenta válido, entre 1 y " + (contadorCuenta - 1));
            }
        } while (!validarCuenta(numCuenta));

        seleccionarOpcionCuenta();
    }

    static boolean validarCuenta(int numCuenta) {
        for (Cuenta c : cuentas) {
            if (c.getNumeroCuenta() == numCuenta) {
                cuentaActiva = c;
                return true;
            }
        }
        return false;
    }

    static void seleccionarOpcionCuenta() {
        int opcionCuenta = 0;
        while (opcionCuenta != 4) {
            menuCuenta();
            String input = entrada.nextLine();
            if (!input.matches("[1-4]")) {
                System.out.println("Opción no válida, selecciona una opción entre 1 y 4");
                continue;
            }
            opcionCuenta = Integer.parseInt(input);
            switch (opcionCuenta) {
                case 1: ingresar(); break;
                case 2: retirar(); break;
                case 3: cuentaActiva.verDatos(); break;
                case 4: System.out.println("Volviendo al menú principal"); break;
                default: System.out.println("Opción no válida");
            }
        }
    }

    static void ingresar() {
        System.out.println("Indica la cantidad a ingresar");
        String input = entrada.nextLine();
        if (input.matches("\\d+(\\.\\d+)?")) {
            double cantidad = Double.parseDouble(input);
            if (cantidad > 0) {
                cuentaActiva.ingreso(cantidad);
            } else {
                System.out.println("Cantidad inválida: debe ser mayor a 0");
            }
        } else {
            System.out.println("Debes introducir una cantidad numérica válida");
        }
    }

    static void retirar() {
        System.out.println("Indica la cantidad a retirar");
        String input = entrada.nextLine();
        if (input.matches("\\d+(\\.\\d+)?")) {
            double cantidad = Double.parseDouble(input);
            if (cantidad > 0 && cuentaActiva.getSaldo() >= cantidad) {
                cuentaActiva.retiro(cantidad);
            } else {
                System.out.println("Cantidad inválida: o bien es negativa o supera el saldo disponible");
            }
        } else {
            System.out.println("Debes introducir una cantidad numérica válida");
        }
    }

    static void menuPrincipal() {
        System.out.println("MENU PRINCIPAL");
        System.out.println("1 - Crear Cliente");
        System.out.println("2 - Crear Cuenta");
        System.out.println("3 - Mantenimiento de cuenta");
        System.out.println("4 - Salir");
    }

    static void menuCuenta() {
        System.out.println("MENU CUENTA");
        System.out.println("1 - Ingresar");
        System.out.println("2 - Retirar");
        System.out.println("3 - Ver datos cuenta");
        System.out.println("4 - Volver al menú principal");
    }

    static void menuTipoCuenta() {
        System.out.println("QUÉ TIPO DE CUENTA QUIERES CREAR?");
        System.out.println("1 - Cuenta Corriente");

    }
}
