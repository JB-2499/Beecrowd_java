package beecrowd;
import java.util.Scanner;

public class Bee1009 {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        String nome = pergunta.nextLine();
        double salario_fixo = pergunta.nextDouble();
        double total_vendas = pergunta.nextDouble();
        double renda_total = salario_fixo + total_vendas*0.15;
        System.out.printf("TOTAL = R$ %.2f\n", renda_total);
        pergunta.close();
    }
}