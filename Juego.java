
package obligatorio_1;
import java.util.*;




public class Juego {
    private Tablero tablero;
    private ArrayList<Jugador> jugadores;

    public Juego(Tablero tablero) {
        this.tablero = tablero;
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }   
}
