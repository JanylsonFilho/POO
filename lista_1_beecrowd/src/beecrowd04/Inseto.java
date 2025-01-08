package beecrowd04;

public class Inseto extends Invertebrado{
    public Inseto(String filo,String classe,String ordem ) {
        super(filo,classe,ordem);

        if(ordem == "hematofago"){
            this.nome="pulga";
        }
        else{
            this.nome="lagarta";
        }

    }
}
