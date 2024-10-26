package com.luis.exercicios;

public class AnaliseDeCandidatura {
    public static void main(String[] args) {
        analisarCandidato (1900.0);
        analisarCandidato (2200.0);
        analisarCandidato (3000.0);
    }

    static void analisarCandidato (double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("ligar para o candidatoo");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("ligar oferendo contra proposta");
        } else {
            System.out.println(" Analisar outros candidatos");
        }

    }

}
