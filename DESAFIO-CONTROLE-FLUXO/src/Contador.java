import java.util.Locale;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();

		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem.
			contar(parametroUm, parametroDois);
        		
		}catch (ParametrosInvalidosException e ) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println(e.getMessage());
        }
    }

        static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException {
            if (parametroUm >= parametroDois){
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");               
            }
            int quantidade = parametroDois - parametroUm;

            for (int imprimir =1; imprimir <= quantidade; imprimir++) {
                System.out.println(" imprimindo o número " + imprimir);
            }
        }          
}