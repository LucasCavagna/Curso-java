

public class Hexadecimal{

    // Metodo de Hola Mundo
    public static void main(String[] args){

        byte hex=0x70;

        // Hay que castear para que lo tome como binario complemento a 2
        byte hexNeg = (byte)0x90; 

        int hexInt = 0x90000000;

        System.out.println(hex);
        System.out.println(hexNeg);
        System.out.println(hexInt);

    }


}