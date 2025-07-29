import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        int m = pergunta.nextInt();
        int n = pergunta.nextInt();
        pergunta.close();

        int x = Math.min(m, n);
        int y = Math.max(m, n);

        List<Integer> impares = new ArrayList<>();

        int norma = x+1;
        while(norma < y) {
            if(norma%2 != 0) {
                impares.add(norma);
            }
            norma++;
        }

        int soma = 0;
        for(int valor : impares) {
            soma += valor;
        }

        System.out.println(soma);
    }
}
