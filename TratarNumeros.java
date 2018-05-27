package com.br.learningjava;

public class Soma {

    private int num1;
    private int num2;

    public Soma (int num1, int num2){
        this.setNum1(num1);
        this.setNum2(num2);
    }

    public Soma(){}


    public String toString(){
        return "Soma: " + somar() + "\nSubtração: " + subtrair() +
                "\nDivisão: " + dividir() + "\nMultiplicação: " + multiplicar();
    }


    public void tratarNumeros(){
        somar();
        subtrair();
        dividir();
        multiplicar();
    }

    private int somar(){
        return this.getNum1() + this.getNum2();
    }

    private int subtrair(){
        return this.getNum1() - this.getNum2();
    }

    private double dividir(){
        return this.getNum1() / this.getNum2();
    }

    private int multiplicar(){
        return this.getNum1() * this.getNum2();
    }


    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}


package com.br.learningjava;

public class SomaTeste {

    public static void main(String[] args) {

        Soma s = new Soma(10,2);

        s.tratarNumeros();
        System.out.println(s);
    }
}
