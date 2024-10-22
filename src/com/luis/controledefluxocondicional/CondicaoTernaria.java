package com.luis.controledefluxocondicional;

public class CondicaoTernaria {

    public static void main(String[] args) {
        
        int nota = 6;
        String  resultado = nota >=7 ? "Aprovado" : nota >=5  && nota <7 ? "Prova de recuperação" : "Reprovado";
        System.out.println(resultado);
        
    }

}
