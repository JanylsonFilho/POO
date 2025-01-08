package beecrowd01;


import java.util.ArrayList;
import java.util.List;

public class Motor {
    private int qtdTestes;
    private List<Integer> colecao = new ArrayList<>();


    public void setColecao(List<Integer> colecao) {
        this.colecao = colecao;
    }

    public void addValorMotor(int valor){
        this.colecao.add(valor);
    }

    public List<Integer> getColecao() {
        return colecao;
    }



    public Motor() {

    }


    public void setQtdTestes(int qtdTestes) {
        this.qtdTestes = qtdTestes;
    }

    public int getQtdTestes() {
        return qtdTestes;
    }

    public int  falha() {

        int valorInicial = this.colecao.get(0);

        int j =1;
        for (Integer x: colecao){

            if(x< valorInicial){
                return j;

            }
            j++;
            valorInicial = x;

        }
        return 0;
    }
}
