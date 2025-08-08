import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Integer> valores = new ArrayList<>();
        Scanner pergunta = new Scanner(System.in);
        int n = pergunta.nextInt();
        for(int i = 0; i < n; i++) {
            valores.add(pergunta.nextInt());
        }
        pergunta.close();

        int dentro = 0;
        int fora = 0;
        for(int valor : valores) {
            if(valor >= 10 && valor <= 20) {
                dentro++;
            } else {
                fora++;
            }
        }

        if(dentro > 0) {
            System.out.println(dentro+" in");
        }
        if(fora > 0) {
            System.out.println(fora+" out");
        }
    }
}
