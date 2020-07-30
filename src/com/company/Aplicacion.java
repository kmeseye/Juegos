package com.company;

public class Aplicacion {

    public static void main(String[] args) {
        JuegoAdivinaNumero juego=new JuegoAdivinaNumero(3,7);
        JuegoAdivinaPar juego1=new JuegoAdivinaPar(3,4);
        JuegoAdivinaImpar juego2=new JuegoAdivinaImpar(3,7);
        juego.muestraNombre();
        juego.muestrainfo();
        juego.Juega();
        juego1.muestraNombre();
        juego1.muestrainfo();
        juego1.Juega();
        juego2.muestraNombre();
        juego2.muestrainfo();
        juego2.Juega();
    }
}
