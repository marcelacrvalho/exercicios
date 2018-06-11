package basico.Finterfaces;

public interface Tributavel {

    void calcularImposto();
}


package basico.Finterfaces;

public class Produto implements Tributavel{

    private String nome;
    private double valorfinal;
    private double valor;
    private double peso;
    private double valorFrete;


    public Produto(String nome, double valor, double peso) {
        this.nome = nome;
        this.valor = valor;
        this.peso = peso;
    }

    public Produto() { }


    @Override
    public String toString() {
        return this.nome + " - R$ " + this.valor +
                "\nImposto R$ " + this.valorfinal +
                "\nFrete de R$ " + this.valorFrete;
    }


    @Override
    public void calcularImposto() {
        valorfinal = this.valor * 0.4;
    }


    public void calcularFrete () {
        valorFrete = (this.valor / this.peso) * (this.peso * 0.01);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}


package basico.Finterfaces;

public class ProdutoTest {

    public static void main(String[] args) {

        Produto prod = new Produto("Notebook", 1500, 400);

        prod.calcularFrete();
        prod.calcularImposto();

        System.out.println(prod);
    }
}
