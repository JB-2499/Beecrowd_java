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
        int impares = 0;
        int positivos = 0;
        int negativos = 0;

        for(int valor : valores) {
            if(valor%2 == 0) {
                pares++;
            } else if(valor%2 != 0) {
                impares++;
            }
            if(valor > 0) {
                positivos++;
            } else if(valor < 0) {
                negativos++;
            }
        }

        System.out.println(pares+" valor(es) par(es)");
        System.out.println(impares+" valor(es) impar(es)");
        System.out.println(positivos+" valor(es) positivo(s)");
        System.out.println(negativos+" valor(es) negativo(s)");
    }
}
