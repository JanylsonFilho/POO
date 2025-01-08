package beecrowd03;

public class ParImparRoubo extends ParOuImpar {
    private int r;
    private int a;

    public void setR(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void Vencedor(){
if ( r == 1 && a ==0 ){
    System.out.println("Jogador 1 ganha!");
} else if( r==0 && a==1){
    System.out.println("Jogador 1 ganha!");
} else if(r==1 && a ==1){
    System.out.println("Jogador 2 ganha!");
}else if(p==0 && (j1+j2)% 2 !=0){
    System.out.println("Jogador 1 ganha!");
}else if(p==1 && (j1+j2)% 2 ==0 ){
    System.out.println("Jogador 1 ganha!");
}else {
    System.out.println("Jogador 2 ganha!");
      }
}
    }

