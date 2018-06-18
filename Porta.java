package exerciciosbasico.porta;

public class Porta {

    private String cor;
    private boolean aberta = false;


    public Porta(String cor, boolean aberta) {
        this.cor = cor;
        this.aberta = aberta;
    }

    public Porta() { }


    public String toString() {
        return "Cor: " + cor;
    }


    public void abrir() {
        if(!isAberta()) {
            aberta = true;
        }
    }


    public void fechar() {
        if(isAberta()) {
            aberta = false;
        }
    }


    public boolean estaAberta() {
        return aberta;
    }


    public void pintar(String cor) {
        this.cor = cor;
    }


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }
}


package exerciciosbasico.porta;

public class PortaTest {

    public static void main(String[] args) {

        Porta p = new Porta("Branca", true);

        p.abrir();
        System.out.println(p.estaAberta());
        p.pintar("Amarelo");
        System.out.println(p);
        p.fechar();
        System.out.println(p.estaAberta());
    }
}
