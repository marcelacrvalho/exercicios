package metodos;

public class Cotacao {

    private double qnt;
    private double valorDolar = 3.5;

    public Cotacao (double qnt){
        this.setQnt(qnt);
    }

    public Cotacao () {}

    public String toString () {
        return "O dolar hoje está: " + valorDolar +
                "\nA conversão para reais do valor recebido foi de R$ " + converteParaReais();
    }


    public double converteParaReais () {
        return getQnt() * 3.5;
    }

    public double getQnt() {
        return qnt;
    }

    public void setQnt(double qnt) {
        this.qnt = qnt;
    }
}


package metodos;

public class CotacaoTeste {

    public static void main(String[] args) {

        Cotacao cot = new Cotacao(10000);

        cot.converteParaReais();
        System.out.println(cot);
    }
}
