package com.company.numeros;

public abstract class Juegos {
    private int vidas;
    private int vidasIniciales;
    private static int record = 0;


    public Juegos(int vidas) {
        this.vidas = vidas;
        this.vidasIniciales = vidas;
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

    public boolean quitarVidas() {
        this.vidas--;
        if (this.vidas == 0) {
            System.out.println("EL juego ha terminado");
            return false;
        } else {
            return true;
        }
    }

    public void reiniciarpartida() {
        this.vidas = vidasIniciales;
    }

    public void actualizarRecord() {
        if (this.vidas > Juegos.record) {
            Juegos.record = this.vidas;
            System.out.println("Has conseguido el record" + Juegos.record);
        } else if (this.vidas == Juegos.record) {
            System.out.println("Se ha alcanzado el record");

        }

    }

}


