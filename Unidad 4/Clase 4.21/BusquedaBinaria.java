public class BusquedaBinaria {

    static boolean busquedaBinaria(int[] nums, int numBuscado, int limiteInf, int limiteSup) {

        System.out.println("limiteInf:"+limiteInf+" -- limiteSup:"+limiteSup);
        if (limiteInf > limiteSup)
            return false; // no quedan elementos por analizar, NO ENCONTRADO

        int mitad = (limiteInf + limiteSup) / 2;

        if (nums[mitad] < numBuscado)
            return busquedaBinaria(nums, numBuscado, mitad + 1, limiteSup); // buscamos por la mitad der

        else if (nums[mitad] > numBuscado)
            return busquedaBinaria(nums, numBuscado, limiteInf, mitad - 1); // buscamos por la mitad izq

        else
            return true; // el elemento de la mitad coincide con numBuscado, ENCONTRADO
    }

    static void mostrarBusquedaBinaria(int[] numeros, int numeroBuscado) {

        if (busquedaBinaria(numeros, numeroBuscado, 0, numeros.length - 1))
            System.out.println("El número " + numeroBuscado + " está en el Array.");
        else
            System.out.println("El número " + numeroBuscado + " NO está en el Array.");
    }


    public static void main(String[] args) {

        int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int numeroBuscado = 5;

        mostrarBusquedaBinaria(numeros, numeroBuscado);

        // Buscamos un número que no está
        numeroBuscado = 11;
        mostrarBusquedaBinaria(numeros, numeroBuscado);
    }
    
}
