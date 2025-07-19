package beecrowd;
import java.util.Scanner;

public class Bee1002 {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);

        double raio = pergunta.nextDouble();
        double area = 3.14159 * (raio*raio);

        System.out.printf("A=%.4f\n", area);

        pergunta.close();
    }
}