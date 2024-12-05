import java.util.Scanner;

public class VerificadorDeContratacao {
    // Função para verificar se o cliente contratou um combo completo
    public static String verificarComboCompleto(String[] servicosContratados) {
        // Variáveis booleanas para verificar a contratação de cada serviço
        boolean movelContratado = false;
        boolean bandaLargaContratada = false;
        boolean tvContratada = false;

        // Iterar sobre os serviços contratados e marcar como contratado se encontrar os serviços
        for (String servico : servicosContratados) {
            if (servico.trim().equalsIgnoreCase("movel")) {
                movelContratado = true;
            } else if (servico.trim().equalsIgnoreCase("banda larga")) {
                bandaLargaContratada = true;
            } else if (servico.trim().equalsIgnoreCase("tv")) {
                tvContratada = true;
            }
        }
        // Verifique se todos os serviços foram contratados
        if (movelContratado && bandaLargaContratada && tvContratada) {
            return "Combo Completo";
        } else {
            return "Combo Incompleto";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de serviços contratados
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] servicosContratados = input.split(",");

        // Verificando se o cliente contratou um combo completo
        String resultado = verificarComboCompleto(servicosContratados);

        // Exibindo o resultado
        System.out.println(resultado);

        // Fechando o scanner
        scanner.close();
    }
}

