package com.br.learningjava;

public class Lutador{

    private String nome;
    private String nacionalidade;
    private String categoria;
    private int id;
    protected int ganhar = 0, perder = 0, empatar = 0;

    public Lutador(String nome, String nacionalidade, String categoria, int id){
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setCategoria(categoria);
        this.setId(id);
    }

    public Lutador(){}


    public String toString(){
        return "Nome: " + getNome() +
                "\nIdade: " + getId() +
                "\nNatural de " + getNacionalidade() +
                "\nCategoria: " +getCategoria();
    }


    public void lutasGanhar(){

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}



ppackage com.br.learningjava;

public class Luta extends Lutador{

    private boolean vaiAcontecer;


    public void marcarLuta(Lutador lutador, Lutador lutador2){
        if (lutador.getCategoria().equalsIgnoreCase(lutador2.getCategoria())){
            System.out.println("A luta está marcada!!\n");
            System.out.println(lutador.toString());
            System.out.println("---------- VERSUS ----------");
            System.out.println(lutador2.toString());
            vaiAcontecer = true;
        } else{
            System.out.println("Não é possível uma luta de lutadores com categorias diferentes\n");
            vaiAcontecer = false;
        }
    }

    public void ganharLuta (){
        if(vaiAcontecer){
            System.out.println("\nO campeão foiiiiiii " + super.getNome());
            super.ganhar += 1;
        }else{
            System.out.println("\nNão é possível ganhar essa luta");
        }
    }

    public void empatarLuta (){
        if (vaiAcontecer) {
            System.out.println("\nAmbos foram campeões!!!");
            super.empatar += 1;
        } else {
            System.out.println("\nImpossível empatar essa luta");
        }
    }

    public void perderLuta(){
        if (vaiAcontecer) {
            System.out.println("\nYOU LOSEEEEEE");
            super.perder += 1;
        } else{
            System.out.println("\nNão é possível perder uma luta que não existe");
        }
    }

    public void verInfos (Lutador lutador){
        System.out.println("\n---------- INFORMAÇÕES DO JOGADOR ----------");
        System.out.println(lutador.getNome());
        System.out.println(lutador.getNacionalidade());
        System.out.println("Lutas ganhas: " + super.ganhar);
        System.out.println("Lutas perdidas: " + super.perder);
        System.out.println("Lutas empadatas: " + super.empatar);
    }
}


package com.br.learningjava;

public class LutaTeste{

    public static void main(String[] args) {

        Lutador lutador = new Lutador("Robson", "Brasil", "Peso pesado", 28);
        Lutador lutador2 = new Lutador("Joaquim", "Brasil", "Peso pesado", 26);

        Luta luta = new Luta();
        luta.marcarLuta(lutador, lutador2);
        luta.empatarLuta();
        luta.verInfos(lutador);
    }
}
