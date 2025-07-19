package beecrowd;
import java.util.Scanner;

public class Bee1005 {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        double A = pergunta.nextDouble();
        double B = pergunta.nextDouble();
        double media = (A * 3.5 + B * 7.5)/11;
        System.out.printf("MEDIA = %.5f\n", media);
        pergunta.close();
    }
}