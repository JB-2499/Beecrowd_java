import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Double> valores = new ArrayList<>();
        Scanner pergunta = new Scanner(System.in);
        for(int i = 0; i < 6; i++) {
            valores.add(pergunta.nextDouble());
        }
        pergunta.close();

        double media = 0;
        int positivos = 0;
        for(double valor : valores) {
            if(valor > 0) {
                positivos++;
                media += valor;
            }
        }

        System.out.println(positivos+" valores positivos");
        System.out.printf("%.1f\n", media/positivos);
    }
}
