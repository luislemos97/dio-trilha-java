import java.util.Scanner;

public class Main {

    // Função para calcular a velocidade média de conexão de internet
    public static double calcularVelocidadeMedia(String[] velocidades) {
        int total = 0;

        // Somando todas as velocidades registradas
        for (String velocidade : velocidades) {
            total += Integer.parseInt(velocidade.trim()); // Convertendo para inteiro e somando
        }

        // Calculando a média
        return (double) total / velocidades.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo a entrada do usuário
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");

        // Calculando a velocidade média de conexão
        double velocidadeMedia = calcularVelocidadeMedia(velocidades);

        // Exibindo a velocidade média de conexão
        System.out.println((int) velocidadeMedia + " Mbps");

        scanner.close();
    }
}
