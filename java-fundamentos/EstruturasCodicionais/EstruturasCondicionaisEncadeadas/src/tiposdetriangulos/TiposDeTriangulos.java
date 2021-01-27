package tiposdetriangulos;

import java.util.Scanner;

/**
 * @author Marcel Pinotti
 */
public class TiposDeTriangulos {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        int numeroA = teclado.nextInt();
        System.out.print("Digite o segundo valor: ");
        int numeroB = teclado.nextInt();
        System.out.print("Digite o terceiro valor: ");
        int numeroC = teclado.nextInt();

        if (numeroA < numeroB + numeroC && numeroB < numeroC + numeroA && numeroC < numeroA + numeroB) {
            System.out.print("Essas medidas FORMAM UM TRIÂNGULO: ");
            if (numeroA == numeroB && numeroB == numeroC) {
                System.out.println("EQUILÁTERO!");
            } else if (numeroA != numeroC && numeroB != numeroA && numeroC != numeroB) {
                System.out.println("ESCALENO!");
            } else {
                System.out.println("ISÓCELES!");
            }
        } else {
            System.out.println("Essas medidas NÃO FORMAM UM TRIÂNGULO!!!");
        }
    
    teclado.close();
    }

}