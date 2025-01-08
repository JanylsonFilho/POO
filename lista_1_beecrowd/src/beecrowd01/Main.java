package beecrowd01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner dado=new Scanner(System.in);


Pessoa p = new Pessoa();

p.setQtdRoupas(dado.nextInt());
    Lavadora l = new Lavadora();

    l.setCapMin(dado.nextInt());

    l.setCapMax(dado.nextInt());

    Secadora s = new Secadora();
    s.setCapMin(dado.nextInt());
    s.setCapMax(dado.nextInt());



    }
}
