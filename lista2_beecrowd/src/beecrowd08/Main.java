package beecrowd04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        Colecao colecao = new Colecao();

        int testes = dado.nextInt();

        for (int i =0;i<testes;i++){
            colecao.setQtdTestes(dado.nextLine());
            colecao.addValorPomekons(colecao.getQtdTestes());

        }
        colecao.qtdFaltantesPomekons();
    }
}
