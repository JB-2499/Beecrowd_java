import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        double pessoas = 0;

        while (true) {
            int n = sc.nextInt();
            if (n < 0) {
                break;
            } else {
                soma += n;
                pessoas++;
            }
        }
        sc.close();

        double media = soma / pessoas;
        System.out.printf("%.2f\n", media);
    }
}
