package exercicios.biblioteca;

import java.text.DateFormat;
import java.util.Calendar;

public class Biblioteca {

    private String nomeLivro;
    private Calendar dataDevolucao;
    private static int prazoDias = 5;

    public Biblioteca(String nomeLivro) {
        this.nomeLivro = nomeLivro;

    }

    public Biblioteca() { }


    public void retirarLivro() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_WEEK, prazoDias);
        DateFormat df = DateFormat.getInstance();
        DateFormat.getDateInstance(DateFormat.SHORT);
        this.dataDevolucao = calendar;
        System.out.println("Boa leitura!");
        System.out.println("O prazo para devolver o livro é " + df.format(calendar.getTime()) );
    }


    public void devolverLivro(Calendar diaHoje) {
        System.out.println("Obrigada por devolver! Volte sempre!");

        if(diaHoje.compareTo(dataDevolucao) > 0) {
            System.out.println("Multa de R$ 10, 50");
        }
    }


    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public Calendar getDataDevolucao() {
        return dataDevolucao;
    }

    public static int getPrazoDias() {
        return prazoDias;
    }
}


package exercicios.biblioteca;

import java.util.Calendar;

public class BibliotecaTest {

    public static void main(String[] args) {

        Biblioteca b = new Biblioteca();
        b.setNomeLivro("Quem é voce, Alasca");
        b.retirarLivro();

        Calendar c = Calendar.getInstance();
        c.add(Calendar.DAY_OF_WEEK, 3);
        b.devolverLivro(c);
    }
}
