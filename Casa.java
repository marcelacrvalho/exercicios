package exerciciosbasico.casa;

import exerciciosbasico.porta.Porta;

public class Casa {

    private Porta porta1;
    private Porta porta2;
    private Porta porta3;
    private String cor;
    private Endereco endereco;


    public Casa(Porta porta1, Porta porta2, Porta porta3, String cor, Endereco endereco) {
        this.porta1 = porta1;
        this.porta2 = porta2;
        this.porta3 = porta3;
        this.cor = cor;
        this.endereco = endereco;
    }

    public Casa(Endereco endereco) {
        this.endereco = endereco;
    }


    @Override
    public String toString() {
        return "ENDEREÇO" + "\n" + endereco +
                "\nCor: " + cor +
                "\nTOTAL DE PORTAS ABERTAS: " + portasAbertas();
    }


    public int portasAbertas() {
        int totalAberta = 0;

        if(porta1.isAberta()) {
            return totalAberta += 1;
        } else if(porta2.isAberta()) {
            return totalAberta += 1;
        } else if(porta3.isAberta()) {
            return totalAberta =+ 3;
        }
        return 0;
    }


    public void pintarCasa(String cor) {
        this.cor = cor;
    }


    public Endereco mudar(Endereco novoEndereco) {
        this.endereco = novoEndereco;
        return endereco;
    }


    public Porta getPorta1() {
        return porta1;
    }

    public void setPorta1(Porta porta1) {
        this.porta1 = porta1;
    }

    public Porta getPorta2() {
        return porta2;
    }

    public void setPorta2(Porta porta2) {
        this.porta2 = porta2;
    }

    public Porta getPorta3() {
        return porta3;
    }

    public void setPorta3(Porta porta3) {
        this.porta3 = porta3;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}


package exerciciosbasico.casa;

public class Endereco {

    protected String cidade;
    protected String nomeRua;
    protected String bairro;
    protected String numero;


    public Endereco(String cidade, String nomeRua, String bairro, String numero) {
        this.cidade = cidade;
        this.nomeRua = nomeRua;
        this.bairro = bairro;
        this.numero = numero;
    }

    public Endereco(String cidade) {
        this.cidade = cidade;
    }


    @Override
    public String toString() {
        return "Cidade: " + cidade +
                "\nRua: " + nomeRua + " - " + numero +
                "\nBairro: " + bairro;
    }


    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNomeRua() {
        return nomeRua;
    }

    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}


package exerciciosbasico.casa;

import exerciciosbasico.porta.Porta;

public class CasaTest {

    public static void main(String[] args) {

        Endereco endereco = new Endereco("Lavras", "Padre Dehon", "Centro", "10");

        Porta p1 = new Porta();
        Porta p2 = new Porta();
        Porta p3 = new Porta();

        Casa casa = new Casa(p1, p2, p3, "amarelo", endereco);

        p1.abrir();

        casa.pintarCasa("Branco");

        System.out.println(casa);
    }
}
