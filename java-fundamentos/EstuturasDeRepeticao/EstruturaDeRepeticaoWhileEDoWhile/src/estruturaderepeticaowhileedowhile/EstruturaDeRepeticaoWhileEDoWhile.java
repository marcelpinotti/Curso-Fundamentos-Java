package estruturaderepeticaowhileedowhile;
/**
 * @author Marcel Pinotti
 */
public class EstruturaDeRepeticaoWhileEDoWhile {

    public static void main(String[] args) {
        
        int cc = 0; // cc = 1 - Estrutura de Repetição com Teste lógico no Início.
        while (cc < 10) {
            cc++;
            if (cc % 2 == 0) { // irá pular os contadores pares e continuará executando o bloco.
                continue;
            }
            if (cc == 7) { // irá interromper o bloco no contador 7 e finalizar o programa.
                break;
            }
            System.out.print("Cambalhota "); // "Cambalhota " + (cc+1)
            //cc+=1; // (cc = cc + 1 ou cc++)
            System.out.println(cc);
        }
        System.out.println("Fim!");

        System.out.println(" ");
        System.out.println("-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x");
        System.out.println(" ");

        int cont = 0; // Estrutura de Repetição com Teste lógico no Fim.
        do {
            System.out.print("Cambalhota ");
            System.out.println(cont + 1);
            cont += 1; // cont = cont + 1;
        } while (cont < 4);
        System.out.println("Fim");

    }

}

