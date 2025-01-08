package beecrowd04;

public class Mamifero extends Vertebrado{

    public Mamifero(String filo1,String classe1,String ordem1 ) {
        super(filo1,classe1,ordem1);

if(ordem1 == "onivoro"){
    this.nome="homem";
}
else{
    this.nome="vaca";
}

    }


}
