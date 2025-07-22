package beecrowd;
import java.util.Scanner;

public class Bee1016 {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        int distancia = pergunta.nextInt();
        System.out.println((distancia*2)+" minutos");
        pergunta.close();
    }
}