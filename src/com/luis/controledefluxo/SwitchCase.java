package com.luis.controledefluxo;

public class SwitchCase {
    
    public static void main(String[] args) {
        String plano = "T";

        switch (plano) {
            case "T": {
            System.out.println("5gb de youtube");
                break;
            }
        case "M": {
            System.out.println(" 100 minutos de ligação");
                break;
            }
        case "H": {
            System.out.println("Whatsap e instagram gratis ");
            }
        }
    }

}
