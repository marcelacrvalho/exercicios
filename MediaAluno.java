package com.exercios;

public class MediaAluno {

    private String nomeAluno;


    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public void notasALuno(double n1, double n2, double n3){
        retornaMedia(n1, n2, n3);
    }

    private void retornaMedia (double n1, double n2, double n3){
        double md;
        md = (n1+n2+n3)/3;
        System.out.println("A média de " + nomeAluno + " foi " + md);

        if (md >= 7){
            System.out.println("APROVADO (A)!!");
        } else if (md < 4){
            System.out.println("REPROVADO!!");
        } else {
            System.out.println("RECUPERAÇÃO!!");
        }
    }
}


package Teste;

import com.exercios.MediaAluno;

public class MediaAlunoTeste
{
    public static void main(String[] args) {

        MediaAluno media = new MediaAluno();

        media.setNomeAluno("Marcela Carvalho");
        media.notasALuno(6,9,6);
    }
}
