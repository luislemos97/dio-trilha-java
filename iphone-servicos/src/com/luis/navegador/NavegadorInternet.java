package com.luis.navegador;

public interface NavegadorInternet {
    void browse(String url);
    void addBookmark(String url);
    void refreshPage();
}
