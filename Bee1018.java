package beecrowd;
import java.util.Scanner;

public class Bee1018 {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        int n = pergunta.nextInt();
        System.out.println(n);
        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        for(int nota : notas) {
            System.out.println((n/nota)+"nota(s) de R$ "+nota+",00");
            n = n - (n/nota)*nota;
        }
        pergunta.close();
    }
}