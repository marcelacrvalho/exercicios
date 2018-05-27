package com.br.learningjava;

public class Controle {

    private boolean desligado = true;
    private int vol = 10;
    private String situacaoTv;

    public Controle(boolean desligado, int vol){
        this.setDesligado(desligado);
        this.setVol(vol);
    }

    public Controle(){}

    @Override
    public String toString(){
        return "A tv está " + situacaoTv +
                "\nVolume: " + this.getVol();
    }


    public void ligarTv(){
        if(isDesligado()) {
            situacaoTv = "ligada";
        }
    }

    public void desligarTv(){
        if (desligado != false){
            situacaoTv = "desligada";
        }
    }

    public void alterarVolume(int novoVolume){
        if(situacaoTv == "desligada"){
            System.out.println("Não é possível alterar o volume com a tv desligada!");
        } else if (situacaoTv == "ligada" && novoVolume > 0 && novoVolume < 100) {
            this.setVol(novoVolume);
        }else{
            System.out.println("Esse volume não existe!");
        }
    }


    public boolean isDesligado() {
        return desligado;
    }

    public void setDesligado(boolean desligado) {
        this.desligado = desligado;
    }

    public int getVol() {
        return vol;
    }

    public void setVol(int vol) {
        this.vol = vol;
    }
}


package com.br.learningjava;

public class ControleTeste {

    public static void main(String[] args) {

        Controle tv = new Controle(true, 100);

        tv.ligarTv();
        System.out.println(tv);
        tv.alterarVolume(30);
        System.out.println(tv);
        tv.alterarVolume(-2);
        System.out.println(tv);
        tv.desligarTv();
        System.out.println(tv);
        tv.alterarVolume(10);
        System.out.println(tv);
    }
}
