
import java.util.Random;

public class Arrays {
 
    //static int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
 
    static void imprimirArray(int i) {
        if (i < array.length) {
            System.out.print(array[i] + " ");
            imprimirArray(i + 1);
        } else
            System.out.println();
    }
    static int[] array = new int[10];
    
    static int[] crearArray(int i) {
        if (i < array.length) {
            array[i] = i + 1;
            crearArray(i + 1);
        }
        return array;
    }

    static int[] crearArrayAleatoreo(int i) {
        if (i < array.length) {
            Random random = new Random();
            int aleatorio = random.nextInt(100); // Genera un número aleatorio entre 0 y 99
            array[i] = aleatorio;
            //array[i] = (int) (Math.random() * 100);
            crearArrayAleatoreo(i + 1);
        }
        return array;
    }
 
    public static void main(String args[]) {
        imprimirArray(0);
        crearArray(0);
        System.out.println("Array creado: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        crearArrayAleatoreo(0); 
        System.out.println("Array aleatorio creado: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}