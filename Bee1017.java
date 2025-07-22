package beecrowd;
import java.util.Scanner;

public class Bee1017 {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        int tempo = pergunta.nextInt();
        int velocidade = pergunta.nextInt();
        int distancia = tempo*velocidade;
        double litros_gasolina = distancia/12.0;
        System.out.printf("%.3f\n", litros_gasolina);
        pergunta.close();
    }
}