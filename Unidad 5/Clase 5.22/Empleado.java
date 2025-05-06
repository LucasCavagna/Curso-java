public class Empleado {
    private String nombre;
    private String apellidos;
    private int tiempoTrabajado;
    private double salario;

    private static int PrincipianteLimit = 3;
    private static int IntermedioLimit= 18;
    //private static int SeniorLimit = 18;

    public Empleado(String nombre, String apellidos, int tiempoTrabajado, double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tiempoTrabajado = tiempoTrabajado >= 0 ? tiempoTrabajado : 0;
        this.salario = salario >= 0 ? salario : 0.0;
    }

    public Empleado() {
        this.nombre = "Jhon";
        this.apellidos = "Doe";
        this.tiempoTrabajado = 0;
        this.salario = 0.0;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return tiempoTrabajado;
    }

    public double getSalario() {
        return salario;
    }

    public void status() {
        if (tiempoTrabajado < PrincipianteLimit) {
            System.out.println("Principiante");
        } else if (tiempoTrabajado < IntermedioLimit) {
            System.out.println("Intermedio");
        }else{
            System.out.println("Senior");
        }
    }
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Tiempo Trabajado: " + tiempoTrabajado + " años");
        System.out.println("Salario: $" + salario);
    }

    public boolean actualizarSalario(double nuevoSalario) {
        if (nuevoSalario > 0) {
            this.salario = nuevoSalario;
            return true;
        } else {
            System.out.println("El salario no puede ser negativo o cero.");
            return false;
        }
    }

    public void subirSalario(double porcentaje) {
        if (porcentaje > 0) {
            this.salario += this.salario * (porcentaje / 100);
        } else {
            System.out.println("El porcentaje no puede ser negativo o cero.");
        }
    }
}