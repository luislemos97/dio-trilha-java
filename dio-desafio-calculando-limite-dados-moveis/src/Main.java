import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    // Função para calcular o consumo total de dados móveis
    public static int calcularConsumoTotal(String[] consumoSemanal) {
        int total = 0;
        for (String consumo : consumoSemanal) {
            total += Integer.parseInt(consumo.trim());
        }
        return total;
    }

    // Função para calcular a média semanal de consumo de dados móveis
    public static int calcularMediaSemanal(int totalConsumo, int numeroDeSemanas) {
        return totalConsumo / numeroDeSemanas;
    }

    // Função para identificar a semana de maior consumo
    public static int identificarSemanaDeMaiorConsumo(String[] consumoSemanal) {
        int semanaDeMaiorConsumo = 0;
        int maiorConsumo = 0;

        for (int i = 0; i < consumoSemanal.length; i++) {
            int consumo = Integer.parseInt(consumoSemanal[i].trim());
            if (consumo > maiorConsumo) {
                maiorConsumo = consumo;
                semanaDeMaiorConsumo = i + 1; // Semanas começam em 1
            }
        }
        return semanaDeMaiorConsumo;
    }

    public static void main(String[] args) throws IOException {
        // Utilizando BufferedReader para entrada de dados
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Lendo a entrada do usuário
        String input = br.readLine();

        // Convertendo a entrada em uma lista de strings
        String[] consumoSemanal = input.split(",");

        // Calculando o consumo total de dados móveis no mês
        int totalConsumo = calcularConsumoTotal(consumoSemanal);

        // Calculando a média semanal de consumo de dados móveis
        int mediaSemanal = calcularMediaSemanal(totalConsumo, consumoSemanal.length);

        // Identificando a semana de maior consumo
        int semanaDeMaiorConsumo = identificarSemanaDeMaiorConsumo(consumoSemanal);

        // Exibindo o consumo total de dados móveis no mês
        System.out.println("Total mensal: " + totalConsumo + " MB");

        // Exibindo a média semanal de consumo
        System.out.println("Media semanal: " + mediaSemanal + " MB");

        // Exibindo a semana de maior consumo
        System.out.println("Maior consumo: Semana " + semanaDeMaiorConsumo);
    }
}
