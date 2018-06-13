Override
    public String toString() {
        return "Nome: " + nome + " CPF " + cpf;
    }


    public void validarCpf () {
        try {
            cpf.trim();
            if(cpf.length() == 11) {
                for (int i = 0; i < cpf.length(); i++){
                    if(Character.isDigit(i) == true) {
                        System.out.println("CPF VÁLIDO!!");
                    }
                }
            } else {
                System.out.println("CPF INVÁLIDO!!");
            }
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
           }
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
}



package exerciciosbasico.verificacpf;

public class CPFTest {

    public static void main(String[] args) {

        CPF cpf = new CPF("Marcela Carvalho", "12718333611");

        cpf.validarCpf();

        CPF cp2 = new CPF("Nina", "12nmas1");

        cpf.validarCpf();
    }
}
