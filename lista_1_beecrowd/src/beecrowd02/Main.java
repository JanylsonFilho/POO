package beecrowd02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dado= new Scanner(System.in);

        double a =dado.nextDouble();
        double b = dado.nextDouble();
        double c = dado.nextDouble();

Figura fig = new Figura(a,b,c);



fig.calculo();





    }
}
