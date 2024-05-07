
package obligatorio_1;


public class Jugador {
    private String nombre;
     private int edad;
    private String alias;
    private int puntaje;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getAlias() {
        return alias;
    }

    public int getPuntaje() {
        return puntaje;
    }
   

    public Jugador(String nombre, int edad, String alias) {
        this.nombre = nombre;
        this.edad = edad;
        this.alias = alias;
        this.puntaje = 0;
    }

    public void incrementarPuntaje(int puntos) {
        puntaje += puntos;
    } 
    
}
