package metodos;

public class Quantidade {

    private double tempoGasto;
    private double velMedia;

    public Quantidade(double tempoGasto, double velMedia){
        this.setTempoGasto(tempoGasto);
        this.setVelMedia(velMedia);
    }

    public Quantidade(){}


    public String toString(){
        return "A quantidade de litros usados na viagem foi de " + fazerCalc() + " litros";
    }


    public double fazerCalc(){
        double distancia = this.getTempoGasto() * getVelMedia();
        return distancia/12;
    }


    public double getTempoGasto() {
        return tempoGasto;
    }

    public void setTempoGasto(double tempoGasto) {
        this.tempoGasto = tempoGasto;
    }

    public double getVelMedia() {
        return velMedia;
    }

    public void setVelMedia(double velMedia) {
        this.velMedia = velMedia;
    }
}


package metodos;

public class QuantidadeTeste {

    public static void main(String[] args) {

        Quantidade qnt = new Quantidade(5,125);

        qnt.fazerCalc();
        System.out.println(qnt);
    }
}
