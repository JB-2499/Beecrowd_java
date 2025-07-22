package beecrowd;
import java.util.Scanner;

public class Bee1015 {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);

        String ponto_1 = pergunta.nextLine();
        String[] ponto_A = ponto_1.split(" ");
        double xA = Double.parseDouble(ponto_A[0]);
        double yA = Double.parseDouble(ponto_A[1]);
        String ponto_2 = pergunta.nextLine();
        String[] ponto_B = ponto_2.split(" ");
        double xB = Double.parseDouble(ponto_B[0]);
        double yB = Double.parseDouble(ponto_B[1]);

        double distancia = Math.sqrt((xB - xA)*(xB - xA) + (yB - yA)*(yB - yA));

        System.out.printf("%.4f\n", distancia);
        pergunta.close();   
    }
}