package beecrowd02;

public class Trapezio extends Figura {
    public Trapezio(double a ,double b ,double c){
        super(a,b,c);

    }

    public void area(){
        System.out.println("Area = "+((v1+v2)*v3)/2);
    }

}
