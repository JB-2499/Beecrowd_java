package beecrowd;
import java.util.Scanner;

public class Bee1007 {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        int A = pergunta.nextInt();
        int B = pergunta.nextInt();
        int C = pergunta.nextInt();
        int D = pergunta.nextInt();
        int dif = (A*B - C*D);
        System.out.println("DIFERENCA = "+dif);
        pergunta.close();
    }
}