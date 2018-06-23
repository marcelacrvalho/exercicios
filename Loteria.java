package exerciciosbasico.loteria;

import java.util.Random;

public class DadosJogo implements InfoJogo{

    protected String nomeJogador;
    private double valor;
    protected String nomeLoteria;
    protected int codJogo;

    public DadosJogo(String nomeJogador, String nomeLoteria) {
        this.nomeJogador = nomeJogador;
        this.nomeLoteria = nomeLoteria;
    }


    public DadosJogo() { }


    @Override
    public String toString() {
        return "DadosJogo{" +
                "nomeJogador='" + nomeJogador + '\'' +
                ", codJogo=" + codJogo +
                ", valor=" + valor +
                ", nomeLoteria='" + nomeLoteria + '\'' +
                '}';
    }


    @Override
    public int gerarCodigo() {
        Random random = new Random();
        this.codJogo = random.nextInt(20000);
        return codJogo;
    }


    @Override
    public double valorTotal() {
        return valor;
    }


    public void jogoBicho() {
        this.valor += 2.50;
    }


    public void jogoMegaSena() {
        this.valor += 3.40;
    }


    public void jogoQuina() {
        this.valor += 2.20;
    }


    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }


    public String getNomeLoteria() {
        return nomeLoteria;
    }

    public void setNomeLoteria(String nomeLoteria) {
        this.nomeLoteria = nomeLoteria;
    }
}


package exerciciosbasico.loteria;

public interface InfoJogo {

    public int gerarCodigo();
    public double valorTotal();
}


package exerciciosbasico.loteria;

public class RelatorioJogo {

    public void relatorioJogo(DadosJogo dados) {
        System.out.println("-------------------------");
        System.out.println("Jogador: " + dados.getNomeJogador());
        System.out.println("Loteria: " + dados.getNomeLoteria());
        System.out.println("Código: " + dados.gerarCodigo());
        System.out.println("TOTAL R$: " + dados.valorTotal());
        System.out.println("-------------------------");
    }
}


package exerciciosbasico.loteria;

public class LoteriaTest {

    public static void main(String[] args) {

        DadosJogo jogo = new DadosJogo("Marcela", "Loteria Central");
        RelatorioJogo relatorioJogo = new RelatorioJogo();

        jogo.gerarCodigo();
        jogo.jogoBicho();
        jogo.jogoMegaSena();
        jogo.valorTotal();

        relatorioJogo.relatorioJogo(jogo);
    }
}
