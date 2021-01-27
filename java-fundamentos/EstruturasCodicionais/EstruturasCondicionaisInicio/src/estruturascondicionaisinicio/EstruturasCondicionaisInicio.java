package estruturascondicionaisinicio;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author Marcel Pinotti
 */
public class EstruturasCondicionaisInicio {

    public static void main(String[] args) {
      
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Primeira nota (use vírgula como separador): ");
        float numero1 = teclado.nextFloat();
        
        System.out.print("Segunda nota (use vírgula como separador): ");
        float numero2 = teclado.nextFloat();
        
        float media = (numero1+numero2)/2;
        System.out.println("Sua média é: " + media);
        if(media>=8.5){
            System.out.println(" Parabéns");
        }
        
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_");
        
        System.out.print("Digite seu ano de nascimento: ");
        int nascimento = teclado.nextInt();
        
        Calendar calendario = Calendar.getInstance();
        int anoAtual = calendario.get(Calendar.YEAR);
        System.out.println("Ano Atual: " + anoAtual);
        
       
        int idade = anoAtual - nascimento;
        System.out.println("Sua idade é: " + idade);
        
        if (idade >=18){
            System.out.println("Você é MAIOR de idade.");
        }else{
            System.out.println("Você é MENOR de idade.");
        }
        teclado.close();

    }
    
}
