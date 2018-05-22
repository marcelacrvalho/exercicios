package Heranca;

public class Pessoa {

    private String nome;
    private String cpf;
    private Endereco endereco;

    public void imprime () {
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereço: " + this.getEndereco().getRua());
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}


package Heranca;

public class Funcionario extends Pessoa {

    private double sal;


    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}



package Heranca;

public class Endereco {

    private String rua;
    private String bairro;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}



package Heranca;

public class TesteFuncionario {

    public static void main(String[] args) {

        Funcionario fun = new Funcionario();
        Endereco end = new Endereco ();
        Pessoa p = new Pessoa ();

        end.setBairro("Centro");
        end.setRua("Maria Leia");

        fun.setNome("Rafaela");
        fun.setSal(3400);
        fun.setEndereco(end);
        fun.imprime();
    }
}
