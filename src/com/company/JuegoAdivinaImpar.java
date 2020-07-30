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

    @Override
    public void muestrainfo() {
        System.out.println("Juego adivina Numero imPar");
        this.vidasRestantes();
    }

    @Override
    public void muestraNombre() {
        System.out.println("Tiene que introduce numeros imPares hasta que acierte el numero par aleatorio");
    }
}
