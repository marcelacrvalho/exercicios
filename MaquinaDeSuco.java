package com.learningjava.exercicios;

public class MaquinaDeSuco {

    private int quantidade;
    private String saborSuco;
    private double preco;
    private double valorTotal;

    public MaquinaDeSuco (int quantidade, String saborSuco, double preco){
        this.quantidade = quantidade;
        this.saborSuco = saborSuco;
        this.preco = preco;
    }

    public MaquinaDeSuco(){}


    public String toString(){
        return "Preço Total: R$" + valorTotal + " \nQuantidade: " + quantidade +
                "\nSabores: " + saborSuco;
    }


    public void calcularTotal(){
       valorTotal = preco * quantidade;
    }


    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getSaborSuco() {
        return saborSuco;
    }

    public void setSaborSuco(String saborSuco) {
        this.saborSuco = saborSuco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}


package com.learningjava.exercicios;

public class MaquinaDeSucoTeste {

    public static void main(String[] args) {

        MaquinaDeSuco maqui = new MaquinaDeSuco(4, "Abacaxi, Laranja, Uva", 3);

        maqui.calcularTotal();
        System.out.println(maqui); 
    }
}

