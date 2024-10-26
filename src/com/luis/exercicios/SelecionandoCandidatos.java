package com.luis.exercicios;

import java.util.concurrent.ThreadLocalRandom;

public class SelecionandoCandidatos {
    public static void main(String[] args) {
        selecaoDeCandidatos();
    }

    static void selecaoDeCandidatos () {
        String [] candidatos =  {"Luis" , "Marcos" , "Julia", "Gabriela", "Isabele"};

        int candidatosSelecionados = 0;
        int candidatosAtual= 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 ) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O canditato" + candidato + " Solicitou esse valor de sálario" + salarioPretendido );
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga " );
            }
            candidatosAtual ++;
        }

    }        
    static double valorPretendido () {
            return ThreadLocalRandom.current().nextDouble(1800, 2200);
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



