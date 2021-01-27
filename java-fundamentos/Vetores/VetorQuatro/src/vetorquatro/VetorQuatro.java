package vetorquatro;

import java.util.Arrays;

/**
 * @author Marcel Pinotti
 */
public class VetorQuatro {

    public static void main(String[] args) {
        int vetor[] = {3, 2, 9, 7, 5, 6};
        System.out.print("Quais são os valores do vetor? ");
        Arrays.sort(vetor); // para colocar os valores do vetor em ordem.
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
        System.out.println("");
        int posicao = Arrays.binarySearch(vetor, 9);// encontra a posição do valor.
        System.out.println("");
        System.out.println("O valor 9 está na posição: " + posicao);
        int pos = Arrays.binarySearch(vetor, 8);// caso o valor não exista, é retornada uma posição negativa.
        System.out.println("O valor 8 está na posição: " + pos);
        System.out.println(" ");
    }

}
