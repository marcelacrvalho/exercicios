package exerciciosbasico.cinema;

import java.util.Calendar;

public class EntradaCinema {

    private short sala;
    private double valor;


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
            if(numeroCarteirinhaEstudante.length() > 0){
                if(ano - anoNascimento < 12) {
                    System.out.println("Desconto de 30%");
                    this.valor *= 0.3;
                } else if (ano - anoNascimento > 12 && (ano - anoNascimento) <= 17) {
                    System.out.println("Desconto de 20%");
                    this.valor *= 0.2;
                } else {
                    System.out.println("Desconto de 10%");
                    this.valor *= 0.1;
                }
            }
        } else {
            System.out.println("Desconto apenas para estudantes com carteirinha!");
        }
    }


    public void valorAPagar() {
        System.out.println("TOTAL R$ " + this.valor);
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
}


package exerciciosbasico.cinema;

import java.util.Calendar;

public class CinemaTest {

    public static void main(String[] args) {

        EntradaCinema cinema = new EntradaCinema();
        Calendar dataNasciment = Calendar.getInstance();
        
        dataNasciment.set(1999, 9, 6);

        cinema.setValor(50);
        cinema.calculaDescontoEstudante(dataNasciment, "");
        cinema.valorAPagar();
    }
}
