import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        int n = pergunta.nextInt();
        pergunta.close();

        List<Integer> pares = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            if(i%2 == 0) {
                pares.add(i);
            }
        }

        for(int par : pares) {
            System.out.println(par+"^2"+" = "+(par*par));
        }
    }
}
