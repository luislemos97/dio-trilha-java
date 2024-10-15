package com.luis.exercicios;

public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume=25;

    public void ligar () {
    ligada=true;
    }

    public void desligar () {
    ligada=false;
    }

    public void aumentarVolume () {
        // volume=volume +1;
        volume++;
        System.out.println("aumentando o volume para: " + volume);
    }

    public void diminuirVolume () {
        // volume=volume -1;
        volume--;
        System.out.println("diminuindo o volume para: " + volume);

    }

    public void  mudarCanal (int novoCanal) {
        canal=novoCanal;
    }

    public void  subirCanal () {
        canal++;
        System.out.println(" Subindo o canal para: " + canal);
    }

    public void descerCanal () {
        canal--;
        System.out.println("Descendo o canal para : " + canal);
    }
    
}
