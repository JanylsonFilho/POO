package beecrowd04;


import java.util.Collection;
import java.util.HashSet;


public class Colecao {
    private String qtdTestes;
   private  Collection< String > pomekons = new HashSet< String >() ;

    public Collection<String> getPomekons() {
        return pomekons;
    }

    public void setPomekons(Collection<String> pomekons) {
        this.pomekons = pomekons;
    }

    public String getQtdTestes() {
        return qtdTestes;
    }

    public void setQtdTestes(String qtdTestes) {
        this.qtdTestes = qtdTestes;
    }



    public void addValorPomekons(String valor){
        this.pomekons.add(valor);
    }

    public void qtdFaltantesPomekons (){

        int cont=0;
        int j =1;
        int contagem=0;
        for (String x: pomekons){

            contagem = 151-cont;
            cont++;
        }


        System.out.println("Falta(m) " + contagem +" pomekon(s).");
    }

}
