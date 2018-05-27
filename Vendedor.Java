package com.br.learningjava;

public class Vendedor {

    private String nome;
    private double sal;
    private int totVendas;

    public Vendedor(String nome, double sal, int totVendas){
        this.setNome(nome);
        this.setSal(sal);
        this.setTotVendas(totVendas);
    }

    public Vendedor(){}


    public String toString(){
        return "Vendedor: " + getNome() +
                "\nTotal a receber R$" + verificarSalarioMensal();
    }


    public double verificarSalarioMensal(){
        return getSal() + (getTotVendas() * 0.15);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getTotVendas() {
        return totVendas;
    }

    public void setTotVendas(int totVendas) {
        this.totVendas = totVendas;
    }
}


package com.br.learningjava;

public class VendedorTeste {

    public static void main(String[] args) {

        Vendedor v = new Vendedor("Marcela", 1300, 40);

        v.verificarSalarioMensal();
        System.out.println(v);
        System.out.println("---------");

        Vendedor v2 = new Vendedor("Rafaela", 1300, 400);
        v2.verificarSalarioMensal();
        System.out.println(v2);
    }
}

