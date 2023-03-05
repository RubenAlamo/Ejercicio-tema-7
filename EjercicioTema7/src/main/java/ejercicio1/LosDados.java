package ejercicio1;
import java.util.Random;
public class LosDados {
    private int numCaras;
    private int ultimaCara;
    public static void main(String[] args) {
        LosDados dado6 = new LosDados();
        LosDados dado10 = new LosDados(10);
        LosDados dado12 = new LosDados(12);
        int sum = 0;

        while (sum < 20) {
            sum = dado6.tirar() + dado10.tirar() + dado12.tirar();
            System.out.println("Suma: " + sum);
        }
    }
    public LosDados() {
        this.numCaras = 6;
    }
    public LosDados(int numCaras) {
        this.numCaras = numCaras;
    }
    public int tirar() {
        Random rand = new Random();
        this.ultimaCara = rand.nextInt(this.numCaras) + 1;
        System.out.println("Ultima cara: " );
        return this.ultimaCara;
    }

    public int getNumCaras() {
        return numCaras;
    }

    public void setNumCaras(int numCaras) {
        this.numCaras = numCaras;
    }

    public int getUltimaCara() {
        return ultimaCara;
    }

    public void setUltimaCara(int ultimaCara) {
        this.ultimaCara = ultimaCara;
    }
}

