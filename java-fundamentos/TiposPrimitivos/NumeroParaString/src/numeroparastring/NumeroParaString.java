package numeroparastring;

/**
 * @author Marcel Pinotti
 */
public class NumeroParaString {

    public static void main(String[] args) {
        //Convertendo Wrapper Numérica para String
        Integer numero1 = 1000;
        System.out.println(numero1.toString().length());// Lê a quantidade de caracteres
        System.out.println(numero1.toString());//converte em String

        //Convertendo tipo primitivo para String
        int numero2 = 10000;
        System.out.println(Integer.toString(numero2).length());// Lê a quantidade de caracteres
        System.out.println(Integer.toString(numero2));// necessário invocar o Wrapper para transformar
        //a variável numérica em String

        //Convertendo de forma não usual
        int numero3 = 100000;
        System.out.println("" + numero3);// Concatenando uma String vazia com o tipo primitivo int

        //Concatenando os dois primeiros valores
        System.out.println(numero1.toString() + Integer.toString(numero2));

        //Somando os dois primeiros valores
        System.out.println(numero1 + numero2);
    }

}
