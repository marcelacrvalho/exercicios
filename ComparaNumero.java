package com.exercios;

public class ComparaNumero {

    public void entrarNumeros (int n1, int n2){
        comparaNumeros(n1,n2);
    }

    private void comparaNumeros (int n1, int n2){
        if (n1 == n2){
            System.out.println("Os números são iguais!!");
        }else {
            if (n1 > n2){
                System.out.println("O número " + n1 + " é maior que " + n2);
            } else {
                System.out.println("O número " + n2 + " é maior que " + n1);
            }
        }
    }
}


package Teste;

import com.exercios.ComparaNumero;

public class ComparaNumeroTeste {

    public static void main(String[] args) {

        ComparaNumero compara = new ComparaNumero();

        compara.entrarNumeros(20,20);

    }
}
