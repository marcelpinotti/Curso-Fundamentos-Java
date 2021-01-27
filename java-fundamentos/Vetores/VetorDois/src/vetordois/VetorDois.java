package vetordois;

import java.util.Scanner;

/**
 * @author Marcel Pinotti
 */
public class VetorDois {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o ano atual: ");
        int anoAtual = teclado.nextInt();

        if (anoAtual % 4 == 0 || anoAtual % 400 == 0 && anoAtual % 100 != 0) {
            System.out.println("É um ano Bisexto!!!");

            String meses[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun",
                "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
            int tot[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            for (int c = 0; c < meses.length; c++) {
                System.out.println("O mês de " + meses[c] + " tem " + tot[c] + " dias ao todo.");
            }

        } else {
            System.out.println("Não é um ano Bisexto!!!");
            String meses[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun",
                "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
            int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            for (int c = 0; c < meses.length; c++) {
                System.out.println("O mês de " + meses[c] + " tem " + tot[c] + " dias ao todo.");
            }
        }

        teclado.close();
    }

}
