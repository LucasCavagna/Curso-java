public class Metodos {


    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int numero1 = 5, numero2 = 10;
        int resultado = suma(numero1, numero2);
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + resultado);

        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + sumaCondi(numero1, numero2));        

        print(resultado);
    }

    static int suma(int a, int b) {
        return a + b;
    }

    static int sumaCondi(int a, int b) {

        if (a > 0 && b > 0) {return a + b;}
        
        return 0;
    }

    static void print(int resultado) {
        System.out.println("El resultado es: " + resultado);
        // Tambien se puede usar return en meodos void, pero no es recomendable
    }
}