package com.luis.estruturaderepeticao;

public class ExemploForArrays {
    public static void main(String[] args) {
        
        String alunos [] = { "Borracha" , "Luis", "Lemos", "Aquiles"};

        for (int x = 0; x < alunos.length; x++ ) {
            System.out.println("O aluno no indice x:" + x + " é " + alunos[ x ]);
        }
    }

}
