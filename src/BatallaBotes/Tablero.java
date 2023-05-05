package BatallaBotes;

public class Tablero {
    
    // Atributos de la clase

    private Jugador[] jugadores;
    private int dimension;
    private Bote[][] cuadricula;

    // Constructores sin parametros

    public Tablero(){
        dimension = 0;
    }

    // Constructor con parametros

    public Tablero(Jugador[] jugadores, int dimension){
        setJugadores(jugadores);
        setDimension(dimension);
        crearTablero();
    }

    // Setters

    public void setJugadores(Jugador[] jugadores){

        this.jugadores = new Jugador[jugadores.length];

        for (int i = 0; i < jugadores.length; i++){
            this.jugadores[i] = jugadores[i];
        }
    }

    public void setDimension(int dimension){
        this.dimension = dimension;
    }

    // Getters

    public Jugador[] getJugadores(){
        return jugadores;
    }

    public int getDimension(){
        return dimension;
    }

    // Metodos de la clase

    public void crearTablero(){
        cuadricula = new Bote[dimension][dimension];

        for (int i = 0; i < dimension; i++){
            for (int j = 0; j < dimension; j++){
                cuadricula[i][j] = null;
            }
        }
    }

    public boolean verCasilla(int coordX, int coordY){
        if (cuadricula[coordX][coordY] == null){
            return false;
        } else {
            return true;
        }
    }

    public void agregarBote(int coordX, int coordY, Bote bote){
        if (verCasilla(coordX, coordY) == false){
            System.out.println("Agregando bote a la casilla (" + coordX + ", " + coordY + ")");
            cuadricula[coordX][coordY] = bote;
        }
        else {
            System.out.println("No es posible agregar un bote en la casilla (" + coordX + ", " + coordY + "), pues esta ocupada!");
        }
    }

    public void hundirBote(int coordX, int coordY){
        if (verCasilla(coordX, coordY) == true){
            System.out.println("Barco hundido con exito!");
            cuadricula[coordX][coordY] = null;
        } else {
            System.out.println("No hay barco en la coordenada ingresada!");
        }
    }

    public void reiniciarTablero(){
        for (int i = 0; i < dimension; i++){
            for (int j = 0; j < dimension; j++){
                cuadricula[i][j] = null;
            }
        }

        System.out.println("Tablero reiniciado con exito!");
    }

    public void imprimir(){
        System.out.println("\n***** Datos de los Jugadores *****\n");
        for (Jugador jugador : jugadores){
            jugador.imprimir();
        }
        
        System.out.println("***** Informacion del Tablero *****" + "\n\n" +
                            "Dimension: " + dimension + " x " + dimension + "\n");
        
        for (int i = 0; i < dimension; i++){
            for (int j = 0; j < dimension; j++){
                if (cuadricula[i][j] == null){
                    System.out.print("Vacio ");
                }
                else {
                    System.out.println(cuadricula[i][j].getClass().getSimpleName());
                }
            }
            System.out.print("\n");
        }
    }

}
