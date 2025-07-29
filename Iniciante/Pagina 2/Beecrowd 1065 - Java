import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Integer> valores = new ArrayList<>();
        Scanner pergunta = new Scanner(System.in);
        for(int i = 0; i < 5; i++) {
            valores.add(pergunta.nextInt());
        }
        pergunta.close();

        int pares = 0;
        for(int valor : valores) {
            if(valor%2 == 0) {
                pares++;
            }
        }

        System.out.println(pares+" valores pares");
    }
}
