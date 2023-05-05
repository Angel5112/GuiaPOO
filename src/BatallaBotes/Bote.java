package BatallaBotes;

public class Bote {
 
    // Atributos de la clase

    private int coordX;
    private int coordY;
    private String color;

    // Constructor sin parametros

    public Bote(){
        coordX = 0;
        coordY = 0;
        color = "Blanco";
    }

    // Constructor con parametros

    public Bote(int coordX, int coordY, String color){
        setCoordX(coordX);
        setCoordY(coordY);
        setColor(color);
    }

    // Setters

    public void setCoordX(int coordX){
        this.coordX = coordX;
    }

    public void setCoordY(int coordY){
        this.coordY = coordY;
    }

    public void setColor(String color){
        this.color = color;
    }

    // Getters

    public int getCoordX(){
        return coordX;
    }

    public int getCoordY(){
        return coordY;
    }

    public String getColor(){
        return color;
    }

    // Metodos de la clase

    public void imprimir(){
        System.out.println("Coordenadas del Barco: (" + coordX + ", " + coordY + ")\n" +
                            "Color: " + color + "\n");
    }

}
