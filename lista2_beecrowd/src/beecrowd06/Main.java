package beecrowd02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        Sapo sapo=new Sapo(dado.nextInt());
        Jogo jogo = new Jogo(sapo);
        int condicao = dado.nextInt();




        for(int i=0;i<condicao;i++){
          Cano cano = new Cano(dado.nextInt());
            jogo.addValoresCano(cano.getAlturaCano());
        }
        System.out.println(jogo.faseJogo());
    }
}
