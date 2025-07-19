package beecrowd;
import java.util.Scanner;

public class Bee1008 {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        int number = pergunta.nextInt();
        int horas = pergunta.nextInt();
        double dinheiro_hora = pergunta.nextDouble();
        double salario = dinheiro_hora*horas;
        System.out.println("NUMBER = "+number);
        System.out.printf("SALARY = U$ %.2f\n", salario);
        pergunta.close();
    }
}