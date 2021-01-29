package vetorseis;

import java.util.Arrays;

/**
 * @author Marcel PInotti
 */
public class VetorSeis {

    public static void main(String[] args) {

        int vetor[] = {3, 2, 9, 7, 5, 6};

        System.out.print("O vetor em ordem ficou assim: ");

        Arrays.sort(vetor);
        for (int c = 0; c < vetor.length; c++) {
            System.out.print(vetor[c] + " ");
        }

    }
}
