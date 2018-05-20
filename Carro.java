ackage com.classesestaticas;

public class Carro {

    private String nome;
    private double velMaxima;
    public static double velLimite = 240;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelMaxima() {
        return velMaxima;
    }

    public void setVelMaxima(double velMaxima) {
        this.velMaxima = velMaxima;
    }

    public Carro  (String nome, double velMaxima) {
        this.nome = nome;
        this.velMaxima = velMaxima;
    }

    public Carro () {
    
    }

    public void imprimeDados(){
        System.out.println("-------------------------------------------");
        System.out.println("NOME: " + nome);
        System.out.println("VELOCIDADE LIMITE: " + velLimite);
        System.out.println("O CARRO ATINGE A VELOCIDADE DE: " + velMaxima + " kms/h");
    }
}


package Teste;

import com.classesestaticas.Carro;

public class CarroTeste {

    public static void main(String[] args) {

        Carro carro1 = new Carro ("BMW", 280);
        Carro carro2 = new Carro ("Mercedes", 200);
        Carro carro3 = new Carro ("Audi", 240);

        carro1.imprimeDados();
        carro2.imprimeDados();
        carro3.imprimeDados();

        Carro.velLimite = 200;

        carro1.imprimeDados();
        carro2.imprimeDados();
        carro3.imprimeDados();
    }
}
