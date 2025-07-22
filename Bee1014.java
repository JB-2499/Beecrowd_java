package beecrowd;
import java.util.Scanner;

public class Bee1014 {
    public static void main(String[] agrs) {
        Scanner pergunta = new Scanner(System.in);
        int X = pergunta.nextInt();
        double Y = pergunta.nextDouble();
        double kml = X/Y;
        System.out.printf("%.3f km/l\n", kml);
        pergunta.close();
    }
}