package beecrowd03;

import java.util.ArrayList;

import java.util.List;

public class Competicao{
    private  List<Double> notas = new ArrayList<>();



    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    public void addValorNotas(double  valor){
        this.notas.add(valor);
    }

    public double Resultado(double grau ){

        double soma=0;
        for(Double   x : this.notas){

            soma =soma+ x;
        }

        return soma * grau;
    }
}
