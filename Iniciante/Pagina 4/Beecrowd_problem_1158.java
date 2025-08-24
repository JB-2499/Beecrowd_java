import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int x =  sc.nextInt();
            int y =  sc.nextInt();

            int soma = 0;
            int j = x;

            if (j%2 == 0) {
                j++;
            }
            for (int cont = 0; cont < y; cont++) {
                soma += j;
                j+=2;
            }

            System.out.println(soma);
        }
        sc.close();
    }
}
