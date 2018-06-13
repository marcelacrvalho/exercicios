package exerciciosbasico.livrolivraria;

public class Livro {

    protected String nome;
    protected String autor;
    protected String editora;
    protected int totalPaginas;
    protected double preco;

    public Livro(String nome, String autor, String editora, int totalPaginas, double preco) {
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.totalPaginas = totalPaginas;
        this.preco = preco;
    }

    public Livro() { }


    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", editora='" + editora + '\'' +
                ", totalPaginas=" + totalPaginas +
                ", preco=" + preco +
                '}';
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}


package exerciciosbasico.livrolivraria;

public class Cliente {

    private String nomeCliente;
    private Livro [] livros;
    private double valorTotal = 0;

    public Cliente(String nomeCliente, Livro[] livros) {
        this.nomeCliente = nomeCliente;
        this.livros = livros;
    }

    public Cliente() { }


    public void comprarLivro(Livro livro) {
        this.valorTotal += livro.preco;
    }


    public void calcularTotal() {
        System.out.println(this.nomeCliente + " - R$ " + this.valorTotal);
    }


    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}



package exerciciosbasico.livrolivraria;

public class LivrariaTest {

    public static void main(String[] args) {

        Cliente c = new Cliente();
        Livro livro = new Livro();
        Livro livro2 = new Livro();

        livro.setNome("Harry Potter e o Prisioneiro de Azkabam");
        livro.setPreco(22.45);
        livro2.setPreco(40);

        c.setNomeCliente("Rafaela");
        c.comprarLivro(livro);
        c.comprarLivro(livro2);
        c.calcularTotal();
    }
}
