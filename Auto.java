
package obligatorio_1;


public class Auto {
    private int fila;
    private int columna;
    private int direccion;
    
    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }
    

    public Auto(int fila, int columna, int direccion) {
        this.fila = fila;
        this.columna = columna;
        this.direccion = direccion;
    }

    public void girar() {
    }

}   

