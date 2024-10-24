package com.luis.estruturaexcepcionais;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

            System.out.println("Digite o seu nome");
            String nome = scanner.next();

            System.out.println("Digite o seu sobrenome");
            String sobrenome= scanner.next();

            System.out.println(" Digite sua idadde");
            int idade = scanner.nextInt();

            System.out.println(" Digite sua altura ");
            double altura = scanner.nextDouble();

            System.out.println("Ola meu nome é " + nome.toUpperCase() + " " + sobrenome);
            System.out.println(" Minha idade é " + idade + " anos");
            System.out.println("Minha altura é " + altura+ " cm");
            scanner.close();

        } catch (Exception e ) {
            System.out.println("O campo idade e altura precisa ser númerico ");
        }
        
    }

}

