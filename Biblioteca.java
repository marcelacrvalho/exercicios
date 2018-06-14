package exerciciosbasico.livroBiblioteca;

public class Livro {

    protected String titulo;
    protected String autor;
    protected String codigo;

    public Livro(String titulo, String autor, String codigo) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
    }

    public Livro() { }


    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", codigo='" + codigo + '\'' +
                '}';
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}


package exerciciosbasico.livroBiblioteca;

import java.text.DateFormat;
import java.util.Calendar;

public class Leitor {

    private String nome;
    private String registro;
    private Livro [] livros;

    public Leitor(String nome, String registro, Livro[] livros) {
        this.nome = nome;
        this.registro = registro;
        this.livros = livros;
    }

    public Leitor() { }


    public void pegarLivro(Livro livro, Calendar calendar) {
        calendar.add(Calendar.DAY_OF_WEEK, 5);
        DateFormat df = DateFormat.getDateInstance();
        DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(this.nome + " deverá devolver o livro no dia " + df.format(calendar.getTime()));
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }
}


package exerciciosbasico.livroBiblioteca;

import java.util.Calendar;

public class BibliotecaTest {

    public static void main(String[] args) {

        Livro livro = new Livro();
        Leitor leitor = new Leitor();
        Calendar calendar = Calendar.getInstance();

        livro.setTitulo("Quem é voce, Alasca");
        livro.setCodigo("12345");
        livro.setAutor("Jhon Green");

        leitor.setNome("Marcela");
        leitor.setRegistro("123");
        leitor.pegarLivro(livro, calendar);
    }
}
