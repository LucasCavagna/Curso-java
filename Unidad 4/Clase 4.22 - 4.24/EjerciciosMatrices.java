public class EjerciciosMatrices {

    static int[][] crearMatrizRandom(int filas, int maxValor) {
        int[][] matriz = new int[filas][filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < filas; j++) {
                matriz[i][j] = (int) (Math.random() * maxValor);
            }
        }
        return matriz;
    }

    static int[][] crearMatrizIrreRandom(int maxFilas,int minFilas,int maxCols,int minCols, int maxValor){
        int filas = (int) (Math.random() * (maxFilas - minFilas + 1)) + minFilas;   
        int[][] matriz = new int[filas][];
        for (int i = 0; i < filas; i++) {
            matriz[i] = new int[(int) (Math.random() * (maxCols - minCols + 1)) + minCols];
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * maxValor);
            }
        }
        return matriz;
    }
    
    static int[] maxColumsMartriz(int[][] matriz) {
        int[] maxColums = new int[matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maxColums[j]) {
                    maxColums[j] = matriz[i][j];
                }
            }
        }
        return maxColums;

    }

    static int[][] traspuesta(int[][] matriz) {
        int[][] matrizT = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizT[j][i] = matriz[i][j];
            }
        }
        return matrizT;
    }
    public static void main(String[] args) {
        int[][] matriz = crearMatrizRandom(5, 11);
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print(matriz1[j] + " ");
            }
            System.out.println();
        }
       
        System.out.println("Matriz Irregular: ");
        int[][] matrizIrreg = crearMatrizIrreRandom(5, 2, 5, 2, 11);
        for (int i = 0; i < matrizIrreg.length; i++) {
            for (int j = 0; j < matrizIrreg[i].length; j++) {
                System.out.print(matrizIrreg[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz traspuesta: ");
        int[][] matrizT = traspuesta(matriz);   
        for (int i = 0; i < matrizT.length; i++) {
            for (int j = 0; j < matrizT[i].length; j++) {
                System.out.print(matrizT[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Maximo de cada columna: ");
        int[] maxColums = maxColumsMartriz(matriz); 
        for (int i = 0; i < maxColums.length; i++) {
            System.out.print(maxColums[i] + " ");
        }
        System.out.println();
      
    }
}