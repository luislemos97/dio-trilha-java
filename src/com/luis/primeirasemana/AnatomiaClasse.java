package com.luis.primeirasemana;

public class AnatomiaClasse {
    public static void main(String[] args) {

        String primeiroNome = "Luis";
        String segundoNome = "lemos";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {

        return"Resultado do nome completo: " + primeiroNome.concat(" ") .concat(segundoNome);
    }

    
}
