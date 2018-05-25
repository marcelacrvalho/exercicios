package metodos;

public class ComissaoVendas {

    private int identificacao, codPeca, qntVendida;
    private double preco;

    public ComissaoVendas(int identificacao, int codPeca, int qntVendida, double preco){
        this.identificacao = identificacao;
        this.codPeca = codPeca;
        this.qntVendida = qntVendida;
        this.preco = preco;
    }

    public ComissaoVendas(){}

    public String toString(){
        return "Valor a ser recebido R$ " + calcularComissao();
    }

    public double calcularComissao(){
        return (qntVendida * preco) + 0.05;
    }
}



package metodos;

public class ComissaoVendasTeste {

    public static void main(String[] args) {

        ComissaoVendas c = new ComissaoVendas(1234, 898,10,100);

        c.calcularComissao();
        System.out.println(c);
    }
}
