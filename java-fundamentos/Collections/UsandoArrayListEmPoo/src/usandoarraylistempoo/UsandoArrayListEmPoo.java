package usandoarraylistempoo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Marcel Pinotti
 */
public class UsandoArrayListEmPoo {

    public static void main(String[] args) {

        ClassePessoas p1 = new ClassePessoas("Marcel Pinotti", 38);
        ClassePessoas p2 = new ClassePessoas("Viviane Pinotti", 37);
        ClassePessoas p3 = new ClassePessoas("Marry Pinotti", 01);

        ArrayList<ClassePessoas> pessoas = new ArrayList<>();

        System.out.println("Mostra a ArrayList vazia, pois ainda não foi add os objetos a ArrayList ---> " + pessoas);
        System.out.println("------------");

        //adicionando os objetos a Lista pessoas pelo método add.
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        
        /** System.out.println(pessoas);
        * Se o método toString na classe não tivesse sido modificado, a impressão na tela seriam os valores de referência,
        * pois o toString() estava sendo "herdado" da classe mãe Object.
        *[usandoarraylistempoo.ClassePessoas@4f023edb, 
        * usandoarraylistempoo.ClassePessoas@3a71f4dd, 
        * usandoarraylistempoo.ClassePessoas@7adf9f5f]
        **/
                
        System.out.println("Mostra os objetos criados\n" + pessoas);
        System.out.println("------------");
        
        //Ordenando usando Collections.sort() após a implementação do compareTo() na ClassePessoa.
        Collections.sort(pessoas);
        System.out.println("Ordenado Alfabeticamente:\n" + pessoas);
        System.out.println("------------");
        
        //Ordenando pela idade, usando o Comparator.comparing
        /**Implementação antes do Java 8
        * Collections.sort(pessoas,Comparator.comparing(ClassePessoas::getIdade));
        **/
        // Ordenando a partir do Java 8 
        
        pessoas.sort(Comparator.comparing(ClassePessoas::getIdade));
        System.out.println("Ordenado pela Idade:\n" + pessoas);
        System.out.println("------------");
        
        
        

    }

}
