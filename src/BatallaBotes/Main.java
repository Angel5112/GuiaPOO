package BatallaBotes;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){

        // Atributos a usar durante la ejecucion

        Scanner myScanner = new Scanner(System.in);

        String alias, colorBotes;
        int coordX, coordY, dimension, numJugadores, ronda;
        Tablero tablero;
        Jugador[] jugadores;

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

        System.out.println("Cuantas rondas desean jugar?");
        ronda = myScanner.nextInt();
        myScanner.nextLine();

        for (int i = 0; i < ronda; i++){
            for (int j = 0; j < jugadores.length; j++){
                System.out.println("Jugador " + (j + 1) + " ingrese las coordenadas donde desea agregar el bote");
                System.out.println("Coordenada X: ");
                coordX = myScanner.nextInt();
                myScanner.nextLine();

                System.out.println("Coordenada Y: ");
                coordY = myScanner.nextInt();
                myScanner.nextLine();

                tablero.agregarBote(coordX, coordY, jugadores[j].getColorBotes());

                System.out.println("Momento de atacar! En que coordenadas desea atacar?");
                System.out.println("Coordenada X: ");
                coordX = myScanner.nextInt();
                myScanner.nextLine();

                System.out.println("Coordenada Y: ");
                coordY = myScanner.nextInt();
                myScanner.nextLine();

                tablero.hundirBote(coordX, coordY);
            }
            System.out.println("Ronda " + (i + 1) + " completada! Asi se ve el campo de batalla...");
            tablero.imprimir();
            System.out.println("Comenzando proxima ronda!");
        }

        System.out.println("La partida ha terminado! Reiniciando tablero...");
        tablero.reiniciarTablero();
        tablero.imprimir();

    }
    
    
}
