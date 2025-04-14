public class Ejercicio {

    static int[][] maximoIrregular(int[][] matriz1, int[][] matriz2) {
        int maxFilas = Math.max(matriz1.length, matriz2.length);
        int[][] resultado = new int[maxFilas][];
        for (int i = 0; i < maxFilas; i++) {
            if(matriz1[i] == null){
                resultado[i] = matriz2[i];
            } else if(matriz2[i] == null){
                resultado[i] = matriz1[i];
            } else {
                int maxColumnas = Math.max(matriz1[i].length, matriz2[i].length);
                resultado[i] = new int[maxColumnas];
                for (int j = 0; j < maxColumnas; j++) {
                    if (i < matriz1.length && j < matriz1[i].length && i < matriz2.length && j < matriz2[i].length) {
                        resultado[i][j] = Math.max(matriz1[i][j], matriz2[i][j]);
                    } else if (i < matriz1.length && j < matriz1[i].length) {
                        resultado[i][j] = matriz1[i][j];
                    } else if (i < matriz2.length && j < matriz2[i].length) {
                        resultado[i][j] = matriz2[i][j];
                    }
                }
            }
            
        }

        return resultado;
    }


    public static void main(String[] args) {

        int[][] matriz1 = {
            {1, 2, 3},
            {4, 5},
            {6}
        };

        int[][] matriz2 = {
            {7, 8},
            {9, 10, 11},
            {1, 13}
        };

        int[][] resultado = maximoIrregular(matriz1, matriz2);

        for (int[] fila : resultado) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }   


    }
}
