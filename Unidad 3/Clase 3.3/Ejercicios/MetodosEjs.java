public class MetodosEjs {


    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int numero1 = 5, numero2 = 10;
        menu(numero2);        
    }

    static int multiplicacion(int a, int b) {
        return a * b;
    }

    static int cubo(int a) {
        return a * a * a;
        //* o a^3
    }

    static void saludo(int numero) {
        System.out.println("Este es tu numero: " + numero);
        // Tambien se puede usar return en meodos void, pero no es recomendable
    }

    static void multiplos(int a) {
        int resultado = 0;
        for (int i = 1; i <= 10; i++) {
            resultado = multiplicacion(a, i);
            System.out.println("El " + i + " de " + a + " es: " + resultado);
        }
    }

    static void esPar(int a) {
        if (a % 2 == 0) {
            System.out.println("El numero " + a + " es par.");
        } else {
            System.out.println("El numero " + a + " es impar.");
        }
    }

    static void menu(int opciones){
        for (int i = 1; i <= opciones; i++) {
            System.out.println("Opcion " + i + ": " + i);
            }
    }

    
}