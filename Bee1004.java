package beecrowd;
import java.util.Scanner;

public class Bee1004 {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        int A = pergunta.nextInt();
        int B = pergunta.nextInt();
        System.out.println("PROD = "+(A * B));
        pergunta.close();
    }
}