package dowhilesoma;

import java.util.Scanner;

/**
 * @author Marcel Pinotti
 */
public class DoWhileSoma {

    public static void main(String[] args) {
        int numero , soma = 0;
        Scanner teclado = new Scanner(System.in);
        String resp;

        do {
            System.out.print("Digite um número: ");
            numero = teclado.nextInt();
            soma += numero;
            System.out.print("Deseja continuar(S/N)? ");
            resp = teclado.next().toUpperCase();
        } while (resp.equals("S"));
        System.out.println("A soma dos valores digitados é: "+ soma);
        
        teclado.close();
    }
    
}
