package BatallaBotes;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){

        // Atributos a usar durante la ejecucion

        Scanner myScanner = new Scanner(System.in);

        String alias, colorBotes;
        int coordX, coordY, dimension, numJugadores;
        Tablero tablero;
        Jugador jugadores[];

        // Registro de Jugadores

        System.out.println("Cuantos jugadores van a participar en el juego?");
        numJugadores = myScanner.nextInt();
        myScanner.nextLine();

        jugadores = new Jugador[numJugadores];

        for (int i = 0; i < numJugadores; i++){
            System.out.println("Ingrese el Alias del Jugador " + (i + 1));
            alias = myScanner.nextLine();

            System.out.println("Ingrese el color de botes del Jugador " + (i + 1));
            colorBotes = myScanner.nextLine();

            jugadores[i] = new Jugador(alias, colorBotes);
        }

        System.out.println("Ingrese la dimension del Tablero de Juego (NxN, solo colocar N una vez)): ");
        dimension = myScanner.nextInt();
        myScanner.nextLine();

        // Creacion del tablero

        System.out.println("Creando tablero...");
        tablero = new Tablero(jugadores, dimension);
        tablero.imprimir();

    }
    
    
}
