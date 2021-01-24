package exerciciorepitaenquanto;

import java.util.Scanner;
/**
 * @author Marcel Pinotti
 */
public class ExercicioRepitaEnquanto {

    public static void main(String[] args) {
        
        
        Scanner teclado = new Scanner(System.in);
        
        int numero, total = 0, pares = 0, impares = 0, maioresQueCem = 0, acumulador = 0, soma = 0;
        double media = 0;      
       
        do{     
              System.out.print("Digite um número (Valor 0 interrompe): ");
              
              numero = teclado.nextInt();
              
              total +=1;
              if (numero %2 == 0 && numero != 0){
                  pares +=1 ;
              }else if (numero %2 !=0 && numero != 0){
                  impares += 1;
              }
              if (numero > 100){
                  maioresQueCem +=1;
              }
            soma = (acumulador = acumulador + numero);
    
        }while( numero != 0);
        total -=1;
        media = (double) soma / total;
        System.out.println("RESULTADOS:"
                + "\nx-x-x-x-x-x-x-x-x-x-x"
                + "\nTotal de valores digitados: " + total
                + "\nTotal de números pares: " + pares
                + "\nTotal de números impares: " + impares
                + "\nTotal de números maiores que 100: " + maioresQueCem
                + "\nMédia dos valores digitados: " + media);
                
        
        teclado.close();

    }
    
}
