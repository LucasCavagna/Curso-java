public class Main {

    public static void main(String[] args) {
        Persona p1 = new Persona("Juan", 25, "12345678A");
        p1.mostrarDatos();
        p1.mostrarDatosConBordes();
        Persona p2 = new Persona("Ana", 30, "87654321B");
        p2.mostrarDatos();  

        p2.mostrarDatosConBordes();
        CuentaBancaria c1 = new CuentaBancaria(1, p1);
        c1.ingresar(1000);
        c1.retirar(500);
        c1.verSaldo();
        c1.mostrarDatos();
    }
}
