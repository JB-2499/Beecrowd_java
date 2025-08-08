import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        double n = pergunta.nextDouble();
        pergunta.close();

        int[] notas = {100, 50, 20, 10, 5, 2,};
        double[] moedas = {100, 50, 25, 10, 5, 1};

        System.out.println("NOTAS:");
        for(int nota : notas) {
            int quant = (int) (n/nota);
            System.out.printf("%d nota(s) de R$ %.2f\n", quant, (double) nota);
            n = n - quant*nota;
        }
        n = n*100;
        System.out.println("MOEDAS:");
        for(double moeda : moedas) {
            int quant = (int) (n/moeda);
            System.out.printf("%d moeda(s) de R$ %.2f\n", quant, (double) (moeda/100));
            n = n - quant*moeda;
        }       
    }
}
