package exerciciosbasico.lampada;

public class Lampada {

    private String modelo;
    private boolean ligada = false;
    private boolean meiaLuz = false;

    public Lampada(String modelo) {
        this.modelo = modelo;
    }

    public Lampada() { }


    @Override
    public String toString() {
        return "Lampada{" +
                "modelo='" + modelo + '\'' +
                '}';
    }


    public void ligarLampada() {
        if(!isLigada()) {
            System.out.println("Lâmpada ligada!");
            return;
        }
        System.out.println("A lâmpada já está acessa!");
    }


    public void desligarLampada() {
        if(isLigada()) {
            System.out.println("Lâmpada desligada!");
            return;
        }
        System.out.println("A lâmpada já se encontra desligada!");
    }


    public void meiaLuz() {
        if(!isMeiaLuz()) {
            this.meiaLuz = true;
            System.out.println("Meia luz ativado!");
            return;
        }
        System.out.println("Meia luz já está ativo!");
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isLigada() {
        return ligada;
    }

    public boolean isMeiaLuz() {
        return meiaLuz;
    }
}


package exerciciosbasico.lampada;

public class LampadaTest {

    public static void main(String[] args) {

        Lampada lamp = new Lampada("Neon");

        lamp.desligarLampada();
        lamp.ligarLampada();
        lamp.meiaLuz();
    }
}
