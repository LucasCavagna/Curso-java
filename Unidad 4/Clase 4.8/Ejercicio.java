public class Ejercicio {

    static int[][] crearMatriz(int n){
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } 
                else {
                    matriz[i][j] = 0;
                }
            }
        }
        return matriz;

    }

    static void imprimirMatriz(int[][] matriz) {
        for (int[] matrizFila : matriz) {
            System.out.print("[");
            for (int i = 0; i < matrizFila.length; i++) {
                char simbolo = '-';
                if (matrizFila[i]== 1){
                    simbolo = 'X'; // Para cualquier otro valor
                }
                System.out.print(simbolo);
                if (i < matrizFila.length - 1) {
                    System.out.print(" "); // Agregar espacio solo si no es el último elemento
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }


    
    static void imprimirMatrizInv(int[][] matriz) {
        for (int[] matrizFila : matriz) {
            System.out.print("[");
            String linea="";
            for (int i = 0; i < matrizFila.length; i++) {
                char simbolo = '-';
                if (matrizFila[i]== 1){
                    simbolo = 'X'; // Para cualquier otro valor
                }
                linea=simbolo+" "+linea;
            }
            linea = linea.substring(0, linea.length() - 1);
            System.out.print(linea);
            System.out.print("]");
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int n = 5; // Tamaño de la matriz
        int[][] matrizIdentidad = crearMatriz(n);

        // Imprimir la matriz identidad
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrizIdentidad[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Imprimir la matriz identidad usando el método imprimirMatriz
        imprimirMatriz(matrizIdentidad);

        System.out.println();
        // Imprimir la matriz identidad usando el método imprimirMatrizInv
        imprimirMatrizInv(matrizIdentidad);

    }
}
