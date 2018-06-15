package exerciciosbasico.cinema;

import java.util.Calendar;

public class EntradaCinema {

    protected short sala;
    protected double valor;
    protected boolean estudante = false;


    public EntradaCinema(short sala, double valor) {
        this.sala = sala;
        this.valor = valor;
    }

    public EntradaCinema() { }


    @Override
    public String toString() {
        return " sala=" + sala +
                ", valor=" + valor +
                '}';
    }


    public void calculaDescontoEstudante(Calendar dataNascimento, String numeroCarteirinhaEstudante) {

        Calendar anoAtual = Calendar.getInstance();
        int ano = anoAtual.get(Calendar.YEAR);
        int anoNascimento = dataNascimento.get(Calendar.YEAR);

        if (!numeroCarteirinhaEstudante.equals(null)) {
            if (numeroCarteirinhaEstudante.length() > 0) {
                if (ano - anoNascimento < 12) {
                    System.out.println("Desconto de 30%");
                    this.valor *= 0.3;
                } else if (ano - anoNascimento > 12 && (ano - anoNascimento) <= 17) {
                    System.out.println("Desconto de 20%");

                    this.valor *= 0.2;
                } else {
                    System.out.println("Desconto de 10%");
                    this.valor *= 0.1;
                }
                this.estudante = true;
            }
        } else {
            System.out.println("Desconto apenas para estudantes com carteirinha!");
        }
    }


    public double valorAPagar() {
        return valor;
    }


    public short getSala() {
        return sala;
    }

    public void setSala(short sala) {
        this.sala = sala;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isEstudante() {
        return estudante;
    }
}


package exerciciosbasico.cinema;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Random;

public class GerarIngresso {

    public GerarIngresso() { }

    public void gerarIngressoEstudante(EntradaCinema entrada, String nomeFilme) {
        if(entrada.isEstudante()) {
            Random random = new Random();
            Calendar c = Calendar.getInstance();
            DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);

            System.out.println("-------------- INGRESSO ESTUDANTE ----------------");
            System.out.println("Cód: " + random.nextInt(1000));
            System.out.println("Data: " + df.format(c.getTime()));
            System.out.println("Nome do filme: " + nomeFilme);
            System.out.println("Sala: " + entrada.getSala());
            System.out.println("R$" + entrada.valorAPagar());
        } else {
            System.out.println("Ingressos apenas para estudantes!");
        }
    }


    public void gerarIngresso(EntradaCinema entrada, String nomeFilme) {
        Random random = new Random();
        Calendar c = Calendar.getInstance();
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);

        if(!entrada.estudante) {
            System.out.println("-------------- INGRESSO ----------------");
            System.out.println("Cód: " + random.nextInt(1000));
            System.out.println("Data: " + df.format(c.getTime()));
            System.out.println("Nome do filme: " + nomeFilme);
            System.out.println("Sala: " + entrada.getSala());
            System.out.println("R$" + entrada.valorAPagar());
        }
    }
}


package exerciciosbasico.cinema;

import java.util.Calendar;

public class CinemaTest {

    public static void main(String[] args) {

        EntradaCinema cinema = new EntradaCinema();
        Calendar dataNasciment = Calendar.getInstance();
        GerarIngresso ingresso = new GerarIngresso();

        dataNasciment.set(1999, 9, 6);

        cinema.setValor(50);
        cinema.calculaDescontoEstudante(dataNasciment, "123");
        cinema.valorAPagar();

        ingresso.gerarIngressoEstudante(cinema, "Animais Fantásticos e Onde Habitam");

        EntradaCinema cinema2 = new EntradaCinema();
        cinema2.setValor(30);
        cinema2.valorAPagar();
        cinema2.setSala((short) 12);
        ingresso.gerarIngresso(cinema2, "Planeta dos Macacos");
    }
}
