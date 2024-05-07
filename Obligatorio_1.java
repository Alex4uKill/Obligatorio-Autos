
package obligatorio_1;

import java.util.*;



public class Obligatorio_1 {
   

    
    

    public static void main(String[] args) {
      
        
        Scanner in = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu:");
            System.out.println("1. Registrar jugador");
            System.out.println("2. Configurar tablero propio");
            System.out.println("3. Jugar");
            System.out.println("4. Ranking");
            System.out.println("5. Fin");
            System.out.print("Ingrese su opcion: ");
            opcion = in.nextInt();

            switch (opcion) {
                case 1:
                    //registrarJugador();
                    break;
                case 2:
                    configurarTableroPropio();
                    break;
                case 3:
                    jugar();
                    break;
                case 4:
                    mostrarRanking();
                    break;
                case 5:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opcion invalida. Por favor, ingrese un numero del 1 al 5.");
            }
        } while (opcion != 5);
    
    }

   

    private static void configurarTableroPropio() {
        
    }

    private static void jugar() {
       
    }

    private static void mostrarRanking() {
        
    }
}}

    

