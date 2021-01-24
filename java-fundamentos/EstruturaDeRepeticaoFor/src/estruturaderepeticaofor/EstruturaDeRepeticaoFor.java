package estruturaderepeticaofor;

import java.util.Scanner;

/**
 * @author Marcel Pinotti
 */
public class EstruturaDeRepeticaoFor {

    public static void main(String[] args) {
        int cc;
        for (cc = 0; cc <= 3; cc++) {
            System.out.println("Cambalhota " + (cc + 1));
        }
        System.out.println("FIM!");

        System.out.println(" ");
        System.out.println("x-x-x-x-x-x-x-x-x");
        System.out.println(" ");

        for (int cont = 0; cont <= 10; cont++) {
            if (cont % 2 == 0) {
                continue;
            }
            if (cont == 9) {
                break;
            }

            System.out.println("Contador" + (cont));
        }
        System.out.println("FIM!");

        System.out.println(" ");
        System.out.println("x-x-x-x-x-x-x-x-x");
        System.out.println(" ");

        for (int c1 = 15; c1 > 5; c1 -= 2) {
            System.out.println(c1);
        }
        System.out.println("Fim!");

        System.out.println(" ");
        System.out.println("x-x-x-x-x-x-x-x-x");
        System.out.println(" ");

        Scanner teclado = new Scanner(System.in);
        int vetor[] = new int[6];
        System.out.println("Digite os valores: ");
        for (int i = 0; i <= vetor.length-1; i++) {
            vetor[i] = teclado.nextInt();
        }
        for (int valores : vetor){  
        System.out.print(valores + " ");
        }

        teclado.close();
    }
    
}
