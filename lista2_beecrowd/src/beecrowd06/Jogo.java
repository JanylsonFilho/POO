package beecrowd02;

import java.util.ArrayList;
import java.util.List;

public class Jogo  {
    private Sapo sapo;

    private List<Integer> valoresCano = new ArrayList<>();


    public Jogo(Sapo sapo ){
    this.sapo=sapo;
    }
public void addValoresCano(int valor){
    this.valoresCano.add(valor);
}

    public String faseJogo() {
        int valorPuloSapo =this.sapo.getAlturaPuloSapo();
        int diferenca;

        int ultimoValor = this.valoresCano.get(0);
        for (Integer x : valoresCano) {
            diferenca = x-ultimoValor;
            if (Math.abs(diferenca) >valorPuloSapo) {
                return "GAME OVER";
            }

            ultimoValor = x;

        }
       return "YOU WIN";
    }

}
