package beecrowd01;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int n = dado.nextInt();
        Motor m = new Motor();


        for (int i =0;i<n;i++) {
            m.setQtdTestes(dado.nextInt());
            m.addValorMotor(m.getQtdTestes());
        }

        System.out.println(m.falha());
    }}
