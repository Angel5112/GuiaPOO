package BatallaBotes;

public class Jugador {
    
    // Atributos de la clase

    private String alias;
    private String colorBotes;

    // Constructor sin parametros

    public Jugador(){
        alias = "Sin Identificar";
        colorBotes = "Blanco";
    }

    // Constructor con parametros

    public Jugador(String alias, String colorBotes){
        setAlias(alias);
        setColorBotes(colorBotes);
    }

    // Setters

    public void setAlias(String alias){
        this.alias = alias;
    }

    public void setColorBotes(String colorBotes){
        this.colorBotes = colorBotes;
    }

    // Getters

    public String getAlias(){
        return alias;
    }

    public String getColorBotes(){
        return colorBotes;
    }

    // Metodos de la clase

    public void imprimir(){
        System.out.println("Alias del Jugador: " + alias + "\n" +
                            "Color de Botes: " + colorBotes + "\n");
    }
}
