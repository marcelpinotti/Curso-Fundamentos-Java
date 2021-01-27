package estruturaderepeticaowhile;

import java.util.Scanner;

/**
 * @author Marcel Pinotti
 */
public class EstruturaDeRepeticaoWhile {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = teclado.nextInt();
        int contador = 1;

        while (numero >= 1) {
            System.out.print(numero);
            numero--;
            contador += contador * numero;
            if (numero >= 1) {
                System.out.print(" x ");
            }
        }
        System.out.print(" = " + contador);
        System.out.println("  ---  FIM!");
        
        teclado.close();
    }
}

