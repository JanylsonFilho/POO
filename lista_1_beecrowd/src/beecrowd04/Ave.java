package beecrowd04;

public class Ave extends Vertebrado{
    public Ave(String filo, String classe,String ordem ) {
        super(filo, classe,ordem);
        if (ordem == "carnivoro"){
            this.nome="aguia";
        }else{
            this.nome="pomba";
        }
    }
}
