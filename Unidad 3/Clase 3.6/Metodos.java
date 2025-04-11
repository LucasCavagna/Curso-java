public class Metodos {

    // Método para sumar dos números enteros
    static int sumar(int a, int b) {
        return a + b;
    }

    // Sobrecarga del método para sumar tres números enteros
    static int sumar(int a, int b, int c) {
        return a + b + c;
    }

    /**
     * 
     * 
     * Sobrecarga del método para sumar dos números de tipo double
     * 
     * @param a primer número
     * @param b segundo número
     */
    // Sobrecarga del método para sumar dos números de tipo double
    static double sumar(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
    
        // Llamadas a los métodos sobrecargados
        System.out.println("Suma de dos enteros: " + sumar(5, 10));
        System.out.println("Suma de tres enteros: " + sumar(5, 10, 15));
        System.out.println("Suma de dos doubles: " + sumar(5.5, 10.5));
    }
}