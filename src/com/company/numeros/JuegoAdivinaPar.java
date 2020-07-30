package com.company.numeros;

public class JuegoAdivinaPar extends JuegoAdivinaNumero {
    public JuegoAdivinaPar(int vidas, int numero) {
        super(vidas, numero);
    }

    @Override
    public boolean validaNumero(int num) {
        if(num%2==0){
            return true;
        }else {
            System.out.println("Error");
            return false;
        }
    }

    @Override
    public void muestrainfo() {
        System.out.println("Juego adivina Numero Par");
        this.vidasRestantes();
    }

    @Override
    public void muestraNombre() {
        System.out.println("Tiene que introduce numeros Pares hasta que acierte el numero par aleatorio");
    }
}
