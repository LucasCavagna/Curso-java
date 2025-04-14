public class Matriz {

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
         // Imprimir la matriz tradiconal
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Imprimir la matriz compacta
        for (int[] fila : matriz) {
            for (int elemento : fila) {
            System.out.print(elemento + " ");
            }
            System.out.println();
        }


    }
}
