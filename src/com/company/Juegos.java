package com.company;

public class Juegos {
    private int vidas;

    public Juegos(int vidas) {
        this.vidas = vidas;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public void vidasRestantes() {
        System.out.println("Numero de vidas restantes: " + vidas);

    }

    public static void main(String[] args) {
        Juegos juego = new Juegos(5);
        juego.vidasRestantes();
        juego.vidas--;
        Juegos juego1=new Juegos(5);
        juego.vidasRestantes();
        juego1.vidasRestantes();
    }
}