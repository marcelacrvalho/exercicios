package exercicios;

public abstract class Banco {

    protected String nomeCliente;
    protected String numeroConta;
    protected TipoConta tipoConta;
    protected double valorConta;

    public abstract void sacar(double qntSaque);
    public abstract void depositar(double qntDeposito);
    public abstract void verificarSaldo();


    public Banco(String nomeCliente, String numeroConta, TipoConta tipoConta, double valorConta) {
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
        this.valorConta = valorConta;
    }

    public Banco() {}

    @Override
    public String toString() {
        return "NOME CLIENTE: " + nomeCliente + " - " + tipoConta +
                "\nValor em conta - R$ " + valorConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getValorConta() {
        return valorConta;
    }

    public void setValorConta(double valorConta) {
        this.valorConta = valorConta;
    }
}


package exercicios;

public class Cliente extends Banco {

    private boolean emprestimo = false;

    public Cliente(String nomeCliente, String numeroConta, TipoConta tipoConta, double valorConta) {
        super(nomeCliente, numeroConta, tipoConta, valorConta);
    }

    public Cliente() { }

    @Override
    public void sacar(double qntSaque) {

        if (super.valorConta > 0 && qntSaque < valorConta) {
            super.valorConta -= qntSaque;
        } else {
                System.out.println("Operação impossível!!");
            }
    }


    @Override
    public void depositar(double qntDeposito) {
        if (qntDeposito > 0) {
            super.valorConta += qntDeposito;
        }
    }

    @Override
    public void verificarSaldo() {
        System.out.println("Total em conta - R$ " + super.valorConta);
    }

    public void pedirEmprestimo() {
        if (super.tipoConta == tipoConta.CORRENTE && super.valorConta > 30000){
            this.emprestimo = true;
        } else {
            System.out.println("Seu saldo é insuficiente ou sua conta não é corrente");
        }
    }

    public void financiarCasa() {
        if(this.emprestimo == true) {
            System.out.println("Pode financiar a casa!");
        } else {
            System.out.println("Aguarde algum tempo!");
        }
    }
}



package exercicios;

public class FinanciamentoEstudantil {

    protected Cliente [] cliente;
    private boolean financiamento = false;


    public FinanciamentoEstudantil(Cliente[] cliente) {
        this.cliente = cliente;
    }

    public FinanciamentoEstudantil() { }


    public void pedirFinanciamentoEstudantil(Cliente cliente, double mediaNotasFaculdade) {
        if (mediaNotasFaculdade >= 70) {
            financiamento = true;
            if(cliente.valorConta >= 50000 && cliente.valorConta <= 40000) {
                System.out.println("Porcentagem de financiamento de 80%");
            } else if (cliente.valorConta >= 20000) {
                System.out.println("Financiamento de 50%");
            } else {
                System.out.println("Valor em conta muito baixo para financiamento");
            }
        } else {
            System.out.println("Financiamento estudantil não concedido");
        }
    }


    public Cliente[] getCliente() {
        return cliente;
    }

    public void setCliente(Cliente[] cliente) {
        this.cliente = cliente;
    }

    public boolean isFinanciamento() {
        return financiamento;
    }
}



package exercicios;

public class BancoTest {

    public static void main(String[] args) {

        Cliente c = new Cliente("Marcela Carvalho", "12345", TipoConta.POUPANCA, 40000);
        FinanciamentoEstudantil financiamento = new FinanciamentoEstudantil();

        c.sacar(20000);
        c.verificarSaldo();

        financiamento.pedirFinanciamentoEstudantil(c, 80);

    }
}
