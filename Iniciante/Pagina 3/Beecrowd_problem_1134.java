import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while(true) {
            int numero = pergunta.nextInt();
            if (numero == 1) {
                alcool++;
            } else if (numero == 2) {
                gasolina++;
            } else if (numero == 3) {
                diesel++;
            } else if (numero == 4) {
                break;
            } else {
                continue;
            }
        }
        pergunta.close();

        System.out.println("MUITO OBRIGADO\nAlcool: "+alcool+"\nGasolina: "+gasolina+"\nDiesel: "+diesel);
    }
}
