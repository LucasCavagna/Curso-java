public class Cadenas{

    // Metodo de Hola Mundo
    public static void main(String[] args){

        String cadena = "hola";
        int longitud = cadena.length();
        System.out.println(cadena);

        System.out.println(longitud);

        System.out.println("La cadena "+cadena+" tiene la lonjitud de : "+longitud);

        System.out.println(cadena.charAt(1));

        System.out.println(cadena.charAt(cadena.length()-1));

        System.out.println("CaDeNa".toLowerCase());

        System.out.println("CaDeNa".toUpperCase());

        System.out.println("CaDeNa".substring(2, 4));
    }


}