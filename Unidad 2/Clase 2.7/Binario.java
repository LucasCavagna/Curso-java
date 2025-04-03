public class Binario{

    // Metodo de Hola Mundo
    public static void main(String[] args){

        byte bin = 0b01110000;

        // Hay que castear para que lo tome como binario complemento a 2
        byte binNeg = (byte)0b11110011; 
        int binInt = 0b11110000;

        System.out.println(bin);
        System.out.println(binNeg);
        System.out.println(binInt);

    }


}