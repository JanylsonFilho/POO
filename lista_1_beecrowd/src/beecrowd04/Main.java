package beecrowd04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dado=new Scanner(System.in);
    Animal a;
    String filo1=dado.nextLine();
    String classe1= dado.nextLine();
    String ordem1 = dado.nextLine();

if(filo1 == "vertebrado" && classe1== "mamifero"){
    a=new Mamifero(filo1, classe1,ordem1);

}else if (filo1 == "vertebrado" && classe1 =="ave"){
    a=new Ave(filo1,classe1,ordem1);
}else if(filo1 == "invertebrado" && classe1 =="inseto") {
    a = new Inseto(filo1, classe1, ordem1);
}else {
    a = new Anelideo(filo1, classe1, ordem1);
}
        System.out.println(a.getNome());

    }
}
