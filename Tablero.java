
package obligatorio_1;


public class Tablero {
 
    private int dimension;
    private Auto[][] matriz;

    
    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }
    
    public Tablero(int dimension) {
        this.dimension = dimension;
        matriz = new Auto[dimension][dimension];
    }

    public boolean validarMovimiento(int fila, int columna) {
        return true;
    }
    public void imprimirTablero(int dimension){
        String borde=" +----+----+----+----+----+";
        String centro = "|    |    |    |    |    |";
        String [] letras={"A","B","C","D","E","F","G"};
        System.out.println("  1    2    3    4    5");
        for (int i = 0; i < this.getDimension; i++) {
            System.out.println(borde);
            System.out.println(letras[i] + centro + "\n" +" "+ centro +"\n" +" "+ centro + "\n" +" "+ centro);
            /*for (int j = 0; j < 5; j++) {
                
            }*/
        }
        System.out.println(borde);   
    }
    
    public void imprimirAuto(){
          for (int i = 0; i < matriz.length; i++) {
            
            
        }
    }

}  

