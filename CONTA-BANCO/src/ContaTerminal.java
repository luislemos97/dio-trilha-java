import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da conta: ");
        int numeroDaConta = scanner.nextInt();

        System.out.println("Saldo Disponível: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente +
         " , Obrigado por criar uma conta em nosso banco, sua agência é: " + agencia +
         ", conta: " + numeroDaConta+ " e seu saldo: " + saldo + " já está disponível para saque! ");

    }
}
