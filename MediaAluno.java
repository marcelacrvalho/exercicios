package basico.metodos;

public class Estudante {

    private String nome;
    private String matricula;
    private double [] notas;
    private double media = 0;


    public Estudante(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;

    }

    public Estudante() { }


    public void calcularMedia(double [] notas){
        for (double notaAluno : notas) {
            media += notaAluno / notas.length;
        }
        retonarSituacao();
    }

    private void retonarSituacao () {
        if (media >= 7){
            System.out.println("Aluno " + this.nome + " aprovado!");
        } else if (media < 4){
            System.out.println("Aluno " + this.nome + " reprovado");
        } else {
            System.out.println("Aluno " + this.nome + " fará recuperação");
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public Estudante(double[] notas) {
        this.notas = notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}


package basico.metodos;

public class EstudanteTest {

    public static void main(String[] args) {

        Estudante estudante = new Estudante ("Marcela", "12345");
        double [] notas = {10, 3, 3};

        estudante.calcularMedia(notas);
    }
}
