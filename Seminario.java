package basico.associacaoclasses;

import java.util.Arrays;

public class Seminario {

    private String nome;
    private Aluno [] alunos;
    private Professor professor;
    private Local local;

    public Seminario(String nome, Aluno[] alunos, Professor professor, Local local) {
        this.nome = nome;
        this.alunos = alunos;
        this.professor = professor;
        this.local = local;
    }

    public Seminario() { }

    @Override
    public String toString() {
        return verificaNome();
    }

    private String verificaNome() {
        if (this.getNome() != null){
            return this.getNome();
        }
        return "Seminário sem nome";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}


package basico.associacaoclasses;

public class Aluno {

    private String nome;
    private Seminario seminario;

    public Aluno(String nome, Seminario seminario) {
        this.nome = nome;
        this.seminario = seminario;
    }

    public Aluno() { }


    @Override
    public String toString() {
        return informacaoAluno();
    }


    private String informacaoAluno() {
        return "Aluno " + this.nome + "\nPresente no seminário " + this.seminario;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}



package basico.associacaoclasses;

import java.util.Arrays;

public class Professor {

    private String nome;
    private Seminario [] seminarios;

    public Professor(String nome, Seminario[] seminarios) {
        this.nome = nome;
        this.seminarios = seminarios;
    }

    public Professor() { }


    @Override
    public String toString() {
        return verificaNomeProfessor();
    }


    private String verificaNomeProfessor() {
        if (this.getNome() != null){
            return "Nome " + nome;
        }

        return "sem nome";
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}



package basico.associacaoclasses;

public class Local {

    private String rua;
    private String bairro;
    private String cidade;

    public Local(String rua, String bairro, String cidade) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public Local() { }


    @Override
    public String toString() {
        return verificaInfo();
    }


    private String verificaInfo() {
        if (this.getRua()!= null) {
            if (this.getBairro() != null) {
                return "Local: " + this.getRua() + " - " + this.getCidade();
            }
        }
        return "Rua e cidade não preenchidos!";
    }


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

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}



package basico.associacaoclasses;

public class SistemaSeminarioTest {

    public static void main(String[] args) {

        Seminario seminario = new Seminario();
        Aluno aluno = new Aluno();
        Professor prof = new Professor();
        Local local = new Local("Maria Leia", "Centro", "Boa Esperança");

        seminario.setLocal(local);
        seminario.setNome("Java");
        aluno.setNome("Marcela");
        aluno.setSeminario(seminario);
        prof.setNome("Rafaela");

        System.out.println(aluno);
        System.out.println("---------------------");
        System.out.println(seminario);
        System.out.println("----------------");
        System.out.println(prof);
        System.out.println("-------------------");
        System.out.println(local);
    }
}

