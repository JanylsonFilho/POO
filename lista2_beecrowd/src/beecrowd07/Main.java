package beecrowd03;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

int condicao = dado.nextInt();

for (int i =0;i<condicao;i++){
    dado.nextLine();
    Competidor competidor = new Competidor(dado.next());

    Competicao competicao = new Competicao();

    competidor.setGrau(dado.nextDouble());

    for(int j =0;j<7;j++){
        competicao.addValorNotas(dado.nextDouble());
    }
    competicao.getNotas().remove(Collections.max(competicao.getNotas()));
    competicao.getNotas().remove(Collections.min(competicao.getNotas()));
    System.out.printf("%s %.2f\n", competidor.getNome(), competicao.Resultado(competidor.getGrau()));

}


    }
}
