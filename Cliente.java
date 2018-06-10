package basico.enumeracoes;

public enum TipoCliente {

    PESSOA_FISICA, PESSOA_JURIDICA;
}


package basico.enumeracoes;

public enum TipoPagamento {

    A_VISTA, A_PRAZO;
}


package basico.enumeracoes;

public class Pessoa {

    protected String nome;
    private String cpf;
    private int idade;
    Sexo sexo;

    public Pessoa(String nome, String cpf, int idade, Sexo sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
    }

    public Pessoa() { }


    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", idade=" + idade +
                ", sexo=" + sexo +
                '}';
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
}


public class Cliente extends Pessoa {

    private String nomerua;
    private String nomecidade;
    private TipoPagamento pagamento;
    protected double valor;

    public Cliente(String nome, String cpf, int idade, Sexo sexo, String nomerua, String nomecidade, TipoPagamento pagamento) {
        super(nome, cpf, idade, sexo);
        this.nomerua = nomerua;
        this.nomecidade = nomecidade;
        this.pagamento = pagamento;
    }

    public Cliente() { }

    @Override
    public String toString() {
       super.toString();
       return "Nome: " + super.nome + " - " + super.sexo +
               "\nTotal a pagar " + this.valor;
    }


    public void totalPagar() {
        if (pagamento == TipoPagamento.A_VISTA) {
            valor -= 30;
        } else {
            valor += valor * 0.2;
        }
    }
}



package basico.enumeracoes;

public class ClienteTest {

    public static void main(String[] args) {

            Cliente c = new Cliente("Marcela", "12876512", 21, Sexo.FEMININO, "Maria Leia", "Boa Esperança", TipoPagamento.A_PRAZO);

            c.valor = 120;
            c.totalPagar();
            System.out.println(c);
    }
}
