public class Ejercicio {

    static int[][] maximo(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = Math.max(matriz1[i][j], matriz2[i][j]);
            }
        }
        return resultado;

    }


    public static void main(String[] args) {

        int[][] matriz1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matriz2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        int[][] resultado = maximo(matriz1, matriz2);

        for (int[] fila : resultado) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }   

    }
}
