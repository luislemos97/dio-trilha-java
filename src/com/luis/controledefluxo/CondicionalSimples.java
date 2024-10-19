package com.luis.controledefluxo;

public class CondicionalSimples {

    //TODO:Caixa Eletrônico.
    public static void main(String[] args) {
        
        double saldo=25.0;
        double valorSolicitado = 26.0;

        if (valorSolicitado < saldo)
        saldo = saldo - valorSolicitado;

        System.out.println(saldo);
    }

}
