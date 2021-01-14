package tiposprimitivos;

import java.util.Scanner;

/** @author Marcel Pinotti
 */
public class TiposPrimitivos {

    public static void main(String[] args) {
        
        
        Scanner teclado = new Scanner (System.in);
        
        // Alguns tipos primitivos.
        // Ficaram faltando o Long, Short, Byte, Float, Character. 
        
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.next();
        
        System.out.print("Digite a nota 1 do aluno (use vígula com separador): ");
        double notaUm = teclado.nextDouble();
        
        System.out.print("Digite a nota 2 do aluno (use vígula com separador): ");
        double notaDois = teclado.nextDouble();
        
        double media = (notaUm + notaDois) / 2;
        System.out.println("A média do aluno " + nome + " é : " + media);
                
        System.out.print("Digite idade do aluno: ");
        int idade = teclado.nextInt();
        System.out.println("A idade do " + nome + " é: " + idade);
        
        
        System.out.print("Digite o gênero do aluno: ");
        String genero = teclado.next();
        System.out.println("A gênero do aluno é: " + genero);       
        
        teclado.close();
        }
    
}
