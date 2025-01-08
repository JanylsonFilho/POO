package beecrowd02;

public class Figura {

    protected double v1,v2,v3;

    public Figura(double a,double b,double c ) {
        this.v1=a;
        this.v2=b;
        this.v3=c;
    }

    public double getV1() {
        return v1;
    }

    public void setV1(double v1) {
        this.v1 = v1;
    }

    public double getV2() {
        return v2;
    }

    public void setV2(double v2) {
        this.v2 = v2;
    }

    public double getV3() {
        return v3;
    }

    public void setV3(double v3) {
        this.v3 = v3;
    }


public void calculo(){
        if((v1<v2+ v3) && (v2<v1+v3) && (v3<v2+v1)){
            Triangulo resposta =  new Triangulo (v1,v2,v3);
        resposta.perimetro();
}   else{
            Trapezio resposta = new Trapezio(v1,v2,v3);
            resposta.area();

        }


    }


















}
