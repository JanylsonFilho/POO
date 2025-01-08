package beecrowd04;

public abstract  class  Animal {
    protected String filo;
    protected String classe;
    protected String ordem;
    protected String nome;
    public Animal(String filo1,String classe1,String ordem1){
this.filo=filo1;
this.classe=classe1;
this.ordem=ordem1;

    }

    public String getOrdem() {
        return ordem;
    }

    public void setOrdem(String ordem) {
        this.ordem = ordem;
    }

    public String getClasse() {
        return classe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getFilo() {
        return filo;
    }

    public void setFilo(String filo) {
        this.filo = filo;
    }



}

