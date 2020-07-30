package com.company;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero {
    public JuegoAdivinaImpar(int vidas, int numero) {
        super(vidas, numero);
    }

    @Override
    public boolean validaNumero(int num) {
        if (num % 2 == 0) {
            System.out.println("error");
            return false;
        } else {
            return true;
        }
    }
}
