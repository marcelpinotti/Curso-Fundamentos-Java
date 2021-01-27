package vetorcinco;

import java.util.Arrays;

/**
 * @author Marcel Pinotti
 */
public class VetorCinco {

    public static void main(String[] args) {
        int x[] = new int[20];
        Arrays.fill(x, 0); // Preenchimento automático do vetor.
        for (int valor : x) {
            System.out.print(valor + " ");
        }
    }

}
