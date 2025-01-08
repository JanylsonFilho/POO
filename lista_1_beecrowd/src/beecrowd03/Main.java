package beecrowd03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dado =  new Scanner(System.in);

        ParImparRoubo p =new ParImparRoubo();
        p.setP(dado.nextInt());
        p.setJ1(dado.nextInt());
        p.setJ2(dado.nextInt());
        p.setR(dado.nextInt());
        p.setA(dado.nextInt());

        p.Vencedor();



    }
}
