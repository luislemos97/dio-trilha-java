package com.luis.exercicios;

public class Usuario {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        smartTv.aumentarVolume ();
        smartTv.aumentarVolume ();
        smartTv.aumentarVolume ();
        smartTv.diminuirVolume();
        System.out.println("Volume atual: "+ smartTv.volume );

        System.out.println("Qual o canal atual : " + smartTv.canal);

        smartTv.mudarCanal(13);

        System.out.println("Qual o canal atual : " + smartTv.canal);

        System.out.println("A tv está ligada : " + smartTv.ligada);
        System.out.println("Qual o canal atual : " + smartTv.canal);
        System.out.println(" Qual o volume atual : " + smartTv.volume);
    }

}
