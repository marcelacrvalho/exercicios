package basico.Gpolimorfismo;

public abstract class Funcionario {

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public Funcionario() { }


    @Override
    public String toString() {
        return nome + " R$ " + salario;
    }

    public abstract void calcularSalario();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}


package basico.Gpolimorfismo;

public class Gerente extends Funcionario {

    double clt;
    public Gerente(String nome, double salario, double clt) {
        super(nome, salario);
        this.clt = clt;
    }

    public Gerente() { }


    @Override
    public String toString() {
        return nome + " R$ " + salario;
    }


    @Override
    public void calcularSalario() {
         super.salario += (salario + this.clt * 0.2);
    }
}



package basico.Gpolimorfismo;

public class Vendedor extends Funcionario {

    private int totVendas;

    public Vendedor(String nome, double salario, int totVendas) {
        super(nome, salario);
        this.totVendas = totVendas;
    }

    public Vendedor() { }


    @Override
    public String toString() {
        return nome + " R$ " + salario;
    }


    public int getTotVendas() {
        return totVendas;
    }

    public void setTotVendas(int totVendas) {
        this.totVendas = totVendas;
    }


    @Override
    public void calcularSalario() {
        super.salario += (this.totVendas * 0.2);
    }
}


package basico.Gpolimorfismo;

public class RelatorioPagamento  {

    public void pagamentoGerente(Gerente gerente) {
        System.out.println("GERANDO RELATÓRIO DE PAGAMENTO PARA GERENCIA");
        gerente.calcularSalario();
        System.out.println(gerente.getNome() + " - R$ " + gerente.getSalario());
    }

    public void pagamentoVendedor(Vendedor vendedor) {
        System.out.println("GERANDO RELATÓRIO DE PAGAMENTO VENDEDORES");
        vendedor.calcularSalario();
        System.out.println(vendedor.getNome() + " - R$ " + vendedor.getSalario());
    }
}


package basico.Gpolimorfismo;

public class LojaTest {

    public static void main(String[] args) {

        Gerente g = new Gerente("Paulo", 2000, 800);
        Vendedor v = new Vendedor("Rodrigo", 1200, 10000);
        RelatorioPagamento r = new RelatorioPagamento();

        r.pagamentoGerente(g);
        System.out.println("------------------------------");
        r.pagamentoVendedor(v);
    }
}
