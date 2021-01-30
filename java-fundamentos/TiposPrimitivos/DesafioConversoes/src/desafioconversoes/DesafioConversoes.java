package desafioconversoes;

import java.util.Scanner;

/**
 * @author Marcel Pinotti
 */
public class DesafioConversoes {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        String salarioUm = teclado.nextLine().replace(",", ".");
        System.out.print("Digite o segundo valor: ");
        String salarioDois = teclado.nextLine().replace(",", ".");
        System.out.print("Digite o terceiro valor: ");
        String salarioTres = teclado.nextLine().replace(",", ".");
        
        double salario1 = Double.parseDouble(salarioUm);
        double salario2 = Double.parseDouble(salarioDois);
        double salario3 = Double.parseDouble(salarioTres);
        
        double media = (salario1 + salario2 + salario3) / (salarioUm + salarioDois + salarioTres).length();
        
        System.out.println("A média dos valores é: " + media);
        
       teclado.close();
    }
    
}
