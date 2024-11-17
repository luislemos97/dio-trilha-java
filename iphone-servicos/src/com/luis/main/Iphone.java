package com.luis.main;

import com.luis.reprodutor.ReprodutorMusical;
import com.luis.telefone.AparelhoTelefonico;
import com.luis.navegador.NavegadorInternet;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Implementação dos métodos de ReprodutorMusical
    @Override
    public void play() {
        System.out.println("Reproduzindo música.");
    }

    @Override
    public void pause() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selectTrack(String track) {
        System.out.println("Música selecionada: " + track);
    }

    // Implementação dos métodos de AparelhoTelefonico
    @Override
    public void makeCall(String number) {
        System.out.println("Ligando para " + number);
    }

    @Override
    public void answerCall() {
        System.out.println("Atendendo a chamada.");
    }

    @Override
    public void voicemail() {
        System.out.println("Acessando caixa postal.");
    }

    // Implementação dos métodos de NavegadorInternet
    @Override
    public void browse(String url) {
        System.out.println("Navegando para: " + url);
    }

    @Override
    public void addBookmark(String url) {
        System.out.println("Adicionado aos favoritos: " + url);
    }

    @Override
    public void refreshPage() {
        System.out.println("Página atualizada.");
    }

    // Método principal para teste
    public static void main(String[] args) {
        IPhone iphone = new IPhone();

        // Testando funcionalidades
        iphone.play();
        iphone.selectTrack("Imagine - John Lennon");
        iphone.pause();

        iphone.makeCall("123-456-7890");
        iphone.answerCall();
        iphone.voicemail();

        iphone.browse("https://example.com");
        iphone.addBookmark("https://example.com");
        iphone.refreshPage();
    }
}
