package ejercicio3;
import java.util.Arrays;
public class Barcos {
    private final int TAMANO = 10;
    private final char AGUA = '~';
    private final char BARCO = 'R';
    private final char IMPACTO = 'X';
    private char[][] tabla;

    public Barcos() {
        tabla = new char[TAMANO][TAMANO];
        for (int i = 0; i < TAMANO; i++) {
            Arrays.fill(tabla[i], AGUA);
        }
    }

    public void depositarBarco(int fila, int columna) {
        tabla[fila][columna] = BARCO;
    }

    public boolean disparar(int fila, int columna) {
        if (tabla[fila][columna] == BARCO) {
            tabla[fila][columna] = IMPACTO;
            return true;
        }
        return false;
    }

    public void visualizacion() {
        System.out.print("  ");
        for (int i = 0; i < TAMANO; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < TAMANO; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < TAMANO; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean hundido() {
        for (int i = 0; i < TAMANO; i++) {
            for (int j = 0; j < TAMANO; j++) {
                if (tabla[i][j] == BARCO) {
                    return false;
                }
            }
        }
        return true;
    }
}
