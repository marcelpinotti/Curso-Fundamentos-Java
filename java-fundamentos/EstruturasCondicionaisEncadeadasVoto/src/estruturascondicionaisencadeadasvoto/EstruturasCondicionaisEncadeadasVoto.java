package estruturascondicionaisencadeadasvoto;

import java.util.Calendar;
import java.util.Scanner;


/**
 * @author Marcel Pinotti
 */
public class EstruturasCondicionaisEncadeadasVoto {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
                
                
        System.out.print("Digite seu ano de nascomento: ");      
        int anoNascimento = teclado.nextInt();
        
        Calendar calendario = Calendar.getInstance();
        int anoAtual = calendario.get(Calendar.YEAR);
        System.out.print("Ano Atual: " + anoAtual);
       
        int idade = anoAtual - anoNascimento;
        System.out.println("Você tem " + idade + " anos." );
        if (idade < 16){
            System.out.println("NÃO VOTA.");
        } else {
            if ((idade >= 16 && idade < 18) || (idade > 70)){
                System.out.println("O VOTO É OPCIONAL.");
            } else {
                System.out.println("O VOTO É OBRIGATÓRIO.");
            }
        }
        
        teclado.close();
    }
    
    
}
