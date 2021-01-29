package arraylists;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Marcel Pinotti
 */
public class ArrayLists {

    public static void main(String[] args) {

        String nomeUm = "Marcel Pinotti";
        String nomeDois = "Viviane Pinotti";
        String nomeTres = "Marry Pinotti";

        ArrayList<String> nomes = new ArrayList<>();

        // adicionar elementos
        nomes.add(nomeUm);
        nomes.add(nomeDois);
        nomes.add(nomeTres);

        System.out.println(nomes); // mostra a lista completa, todos os elementos da lista.
        System.out.println("--------");

        //remover elementos
        nomes.remove(0); //remove pelo índice ou pelo objeto
        System.out.println(nomes);
        System.out.println("--------");

        //imprimindo utilizando o "foreach"
        for (String nome : nomes) {
            System.out.println("Nome: " + nome);
        }
        System.out.println("--------");

        // imprimindo um elemento usando o índice
        String primeiroNome = nomes.get(0);
        System.out.println("Imprimindo o 1º nome pelo índice: " + primeiroNome);
        System.out.println("--------");

        // imprimindo usando o for e o método side()
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(" for + size: " + nomes.get(i));
        }
        System.out.println("--------");

        // percorrendo a lista pelo método forEach + Lambda (estudar com mais calma)
        nomes.forEach(nome -> {
            System.out.print("Usando o método forEach + lambda: ");
            System.out.println(nome);
        });
        System.out.println("--------");

        // ordenar usando Collections
        Collections.sort(nomes);
        System.out.println("Ordenando os nomes usando Collections: " + nomes);
    }

}
