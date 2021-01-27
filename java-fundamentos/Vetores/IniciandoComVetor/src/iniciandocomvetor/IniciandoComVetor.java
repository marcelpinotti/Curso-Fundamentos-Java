package iniciandocomvetor;

/**
 * @author Marcel PInotti
 */
public class IniciandoComVetor {

    public static void main(String[] args) {

        int n[] = {3, 5, 6, 7, 4, 9};
        System.out.println("Total de casas de n é: " + n.length);
        for (int cc = 0; cc <= n.length - 1; cc++) {
            System.out.println("No índice " + cc + " temos o valor " + n[cc] + "!");
        }
    }

}
