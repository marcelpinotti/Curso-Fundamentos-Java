package estruturaderepeticaoforpassada;

import java.util.Scanner;
/**
 * @author Marcel PInotti
 */
public class EstruturaDeRepeticaoForPassada {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Número Inicial: ");
        int numeroInicial = teclado.nextInt();
        System.out.print("Número Final: ");
        int numeroFinal = teclado.nextInt();
        System.out.print("Intervalos: ");
        int numeroPassada = teclado.nextInt();

        for (int contador = numeroInicial; contador <= numeroFinal; contador += numeroPassada) {
            System.out.print(contador + " ");
        }
        
        teclado.close();
    }                                   
    
}
