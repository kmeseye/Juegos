package com.company;


import com.company.interfaces.Jugable;
import com.company.numeros.JuegoAdivinaImpar;
import com.company.numeros.JuegoAdivinaNumero;
import com.company.numeros.JuegoAdivinaPar;

import java.util.Scanner;

public class Aplicacion {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String seguir;
        do {
            Jugable juego = EligeJuego();
            juego.muestraNombre();
            juego.muestrainfo();
            juego.Juega();
            System.out.println("seguir Jugando s/n \n");
            seguir = leer.nextLine();


        } while (seguir.equals("s"));
    }

    public static Jugable EligeJuego() {
        JuegoAdivinaNumero juego1 = new JuegoAdivinaNumero(3, 7);
        JuegoAdivinaPar juego2 = new JuegoAdivinaPar(3, 4);
        JuegoAdivinaImpar juego3 = new JuegoAdivinaImpar(3, 7);
        Jugable[] juegos = new Jugable[3];
        juegos[0] = juego1;
        juegos[1] = juego2;
        juegos[2] = juego3;
        Scanner leer = new Scanner(System.in);

        int opcion = 0;
        do {

            System.out.println("Selecciona un juego\n" +
                    "0.Juega a Adivina Numero\n" +
                    "1.Juega a Adivinar numeros Pares\n" +
                    "2.Juaga a Adivinar numeros Imaopres\n");
            opcion = leer.nextInt();
            leer.nextLine();
        } while (!(opcion <= 2 && opcion >= 0));

        return juegos[opcion];
    }

}
