package stringparanumero;

/**
 * @author Marcel Pintoti
 */
public class StringParaNumero {

    public static void main(String[] args) {
        String numero1 = "1000";
        String numero2 = "10000";
        
        int valor1 = Integer.parseInt(numero1);
        int valor2 = Integer.parseInt(numero2);
        double media = (valor1 + valor2) / 2;
        
        System.out.println("Concatenando duas Strings: " + numero1 + numero2);
        System.out.println("A soma é: " + (valor1 + valor2));
        System.out.println("A média é: " + media);
        
        //Float: Float.parseFloat();
        //Double: Double.parseDouble();
        //Long: Long.parseLong();
        //Short: Short.parseShorte();
        //Byte: Byte.parseByte();
        
    }
    
}
