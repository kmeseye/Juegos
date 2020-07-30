package com.company;

public class Aplicacion {

    public static void main(String[] args) {
        JuegoAdivinaNumero juego=new JuegoAdivinaNumero(5,7);
        juego.Juega();
        JuegoAdivinaPar juego1=new JuegoAdivinaPar(3,4);
        juego1.Juega();
        JuegoAdivinaImpar juego2=new JuegoAdivinaImpar(3,7);
        juego2.Juega();
    }
}
