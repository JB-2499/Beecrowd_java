package beecrowd;
import java.util.Scanner;

public class Bee1003 {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        int A = pergunta.nextInt();
        int B = pergunta.nextInt();
        System.out.println("SOMA = "+(A + B));
        pergunta.close();
    }
}