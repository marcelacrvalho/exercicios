public class Aluno {

    private String nome;
    private int id;
    private Seminario seminario;


    public Aluno(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public Aluno() {

    }

    public void print (){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.id);
        System.out.println("Está presente no seminário: " + this.seminario.getTitulo() + " - " + this.seminario.getLocal().getBairro() + " - " + this.seminario.getLocal().getRua());
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}


public class Seminario {

    private String titulo;
    private Aluno [] alunos;
    private Professor professor;
    private Local local;


    public Seminario (String titulo){
        this.titulo = titulo;
    }

    public Seminario () {

    }

    public void print (){
        System.out.println("Título: " + this.titulo);
        System.out.println("Professor palestrante: " + this.professor.getNome());
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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


public class Professor {
    private String nome;
    private String especialiade;


    public Professor(String nome, String especialidade){
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor (){

    }

    public void print () {
        System.out.println("Nome: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
    }


    private String especialidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}


public class Local {
    private String rua;
    private String bairro;


    public Local (String rua, String bairro){
        this.rua = rua;
        this.bairro = bairro;
    }

    public Local () {

    }

    public void print () {
        System.out.println("Nome da rua: " + this.rua);
        System.out.println("Bairro: " + this.bairro);
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
}


public class TesteAssociacaoClasses {

    public static void main(String[] args) {

        Aluno aluno = new Aluno ("Marcela Carvalho", 21);

        Seminario semi = new Seminario("Como ser um excelente profissional");

        Local local = new Local ("Rua da Bahia", "Centro");

        Professor prof = new Professor ("Rafaela Carvalho", "Biomédica");

        semi.setProfessor(prof);
        aluno.setSeminario(semi);
        semi.setLocal(local);

        aluno.print();

    }
}
