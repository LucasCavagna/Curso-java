import java.util.ArrayList;

public class AppFiguras {

    public static void main(String[] args) {

        Punto2D p1 = new Punto2D(0.3, 0.3);
        Punto2D p2 = new Punto2D(0.1 + 0.2, 0.1 + 0.2);
        Punto2D p3 = new Punto2D(0, 0);

        // no triángulo
        Triangulo t1 = new Triangulo(p1, p2, p3);
        System.err.println(t1.toString());

        // isósceles
        p2 = new Punto2D(1, 0);
        p3 = new Punto2D(0, 1);
        t1 = new Triangulo(p1, p2, p3);
        System.err.println( t1.toString());

        // escaleno
        p3 = new Punto2D(0, 2);
        t1 = new Triangulo(p1, p2, p3);
        System.err.println(t1.toString());

        // equilátero
        p3 = new Punto2D(0.5, 0.5 * Math.sqrt(3));
        p2 = new Punto2D(0,0);
        p1 = new Punto2D(1,0);
        t1 = new Triangulo(p1, p2, p3);
        System.err.println(t1.toString());


        // ArrayList de figuras
        ArrayList<Figura2D> figuras = new ArrayList<>();
        figuras.add(new Triangulo(p1, p2, p3));
        figuras.add(new Triangulo(p1, p2, p3));
        figuras.add(new Triangulo(p1, p2, p3));
        figuras.add(new Triangulo(p1, p2, p3));
        for (Figura2D figura : figuras) {
            System.out.println(figura);
        }
        System.out.println("El área del triángulo es: " + t1.area());
        System.out.println("El perímetro del triángulo es: " + t1.perimetro());
        System.out.println("El triángulo es: " + t1.tipoTriangulo());
        System.out.println("El triángulo es: " + t1.esTriangulo());
        System.out.println("El triángulo es: " + t1.getClass().getName());
        System.out.println("El triángulo es: " + t1.getClass().getSuperclass().getName());
        
    }

    
}
