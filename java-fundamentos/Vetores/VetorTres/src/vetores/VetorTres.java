package vetores;

/**
 * @author Marcel Pinotti
 */
public class VetorTres {

    public static void main(String[] args) {
        String meses[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun",
            "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int c = 0; c < meses.length; c++) {
            System.out.println("O mês de " + meses[c] + " tem " + tot[c] + " dias ao todo.");
        }
    }

}
