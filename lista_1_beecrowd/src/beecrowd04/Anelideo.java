package beecrowd04;

public class Anelideo extends Invertebrado{
    public Anelideo(String filo,String classe,String ordem ) {
        super(filo,classe,ordem);

        if(ordem == "hematofago"){
            this.nome="sanguessuga";
        }
        else{
            this.nome="minhoca";
        }

    }
}
