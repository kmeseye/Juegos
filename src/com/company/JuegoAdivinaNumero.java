package com.company;

import java.util.Scanner;

public class JuegoAdivinaNumero extends Juegos {
    private int numeroAdivinar;

    public JuegoAdivinaNumero(int vidas, int numero) {
        super(vidas);

        this.numeroAdivinar = numero;
    }

    @Override
    public void Juega() {
        this.reiniciarpartida();
        Scanner leer = new Scanner(System.in);
        int numero;

        boolean seguir = true;

        do {
            System.out.println("Adivina un numero entre 0 y 10");
            numero = leer.nextInt();
            leer.nextLine();
            if (numero == numeroAdivinar) {
                System.out.println("Has acertado");
                actualizarRecord();
                seguir = false;

            } else {
                if (quitarVidas()) {
                    if (numero > numeroAdivinar) {
                        System.out.println("El numero es menor");


                    } else {
                        System.out.println("El numero es mayor");
                    }
                    System.out.println("TRY AGAIN");
                } else {
                    System.out.println("El juego ha terminado");
                    seguir = false;
                }
            }


        }
        while(seguir) ;
    }
}