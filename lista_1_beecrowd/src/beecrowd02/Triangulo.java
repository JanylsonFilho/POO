package beecrowd02;

public class Triangulo extends Figura {
    public Triangulo (double a,double b,double c ){
        super(a,b,c);
    }

    public void perimetro(){
        System.out.println("Perimetro = "+ (v1+v2+v3));
    }



}
