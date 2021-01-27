package estruturacondicionalswitch;

import java.util.Scanner;

/**
 * @author Marcel Pinotti
 */
public class EstruturaCondicionalSwitch {

    public static void main(String[] args) {
        
        // Abaixo Exemplo Pernas
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantas pernas? R: ");
        int pernas = teclado.nextInt();
        System.out.println(" ");
        String tipo;
        System.out.print("Isso é um(a): ");
        switch (pernas){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrúpide";
                break;
            case 6:
                tipo = "Aranha";
                break;
            case 8:
                tipo = "Aranha";
                break;
            default:
                tipo = "E.T.";    
        }
        System.out.println(tipo);
        
        
        
        teclado.close();
        
    }
    
}
