package com.br.learningjava;

public class Chuveiro {

    private String marca;
    private boolean ligado;
    String estado;

    public Chuveiro (String marca, boolean ligado){
        this.setMarca(marca);
        this.setLigado(ligado);
    }

    public Chuveiro(){}


    public String toString(){
        return estado;
    }


    public void ligar(){
        if (!isLigado()){
            this.setLigado(true);
            estado = "Chuveiro ligado";
        }
    }

    public void desligar(){
        if(isLigado()){
            this.setLigado(false);
            estado = "Chuveiro desligado";
        }
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}


package com.br.learningjava;

public class ChuveiroTeste {

    public static void main(String[] args) {

        Chuveiro c = new Chuveiro("Lorenzetti", true);

        c.desligar();
        System.out.println(c);
        c.ligar();
        System.out.println(c);
    }
}
