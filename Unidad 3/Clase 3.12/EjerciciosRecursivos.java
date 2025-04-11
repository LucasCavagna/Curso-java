public class  EjerciciosRecursivos {

    static int power(int n, int p) { 
        if(p == 0) return 1;  
        else return n*power(n,p-1); 
    }


    static int digitos(int n) { 
        if(n < 10) return 1;  
        else return 1 + digitos(n/10); 
    }
    
    static int reverse(int n) { 
        if(n < 10) return n;  
        else return (n%10)*power(10,digitos(n/10)) + reverse(n/10); 
    }
    
    static boolean esBinario(int n){
        if(n == 0 || n == 1) return true;  
        else 
            if(n%10 > 1) return false;  
            else return esBinario(n/10); 
    }

    static int makeBinario(int n) { 
        if(n == 0) return 0;  
        else return n%2 + 10*makeBinario(n/2); 
    }

    static boolean estaOrdendoAlfabetic(String s) {
        if(s.length() == 1) return true;  
        else 
            return (s.charAt(0) < s.charAt(1) || s.charAt(0) == s.charAt(1)) 
                    && estaOrdendoAlfabetic(s.substring(1));

    } 

    static int sumaDesdeCero(int n) { 
        if(n == 0) return 0;  
        else return n + sumaDesdeCero(n-1); 
    }

    public static void main(String args[])  {
    
      int d = digitos(1234567890);
      System.out.println("Numero de digitos = " + d);

      int p = power(2, 10);
      System.err.println("2^10 = " + p);

      int r = reverse(1234567890);
      System.out.println("Numero invertido = " + r);

      int b = 1010101;
      boolean binario = esBinario(b);
      if(binario) System.out.println(b + " es binario");  
      else System.out.println(b + " no es binario");
      int b2 = 1010102;
      boolean binario2 = esBinario(b2);
      if(binario2) System.out.println(b2 + " es binario");  
      else System.out.println(b2 + " no es binario");

      int numero= 10;
      int binario3 = makeBinario(numero);
      System.out.println("El binario de " + numero + " es " + binario3);

      String s = "abcde";
      boolean ordenado = estaOrdendoAlfabetic(s);
      if(ordenado) System.out.println(s + " esta ordenado");  
      else System.out.println(s + " no esta ordenado");
      String s2 = "abCde"; 
      boolean ordenado2 = estaOrdendoAlfabetic(s2);
      if(ordenado2) System.out.println(s2 + " esta ordenado");  
      else System.out.println(s2 + " no esta ordenado");


      int n = 10;
      int suma = sumaDesdeCero(n);
      System.out.println("La suma desde 0 hasta " + n + " es " + suma);
      int n2 = 5;
      int suma2 = sumaDesdeCero(n2);
      System.out.println("La suma desde 0 hasta " + n2 + " es " + suma2);

    }
}  