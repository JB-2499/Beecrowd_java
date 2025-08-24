import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int n = sc.nextInt();

        if (n <= 0) {
            while (n <= 0) {
                n = sc.nextInt();
            }
        }
        sc.close();

        int soma = 0;
        for (int i = 0; i < n; i++) {
            soma += (a+i);
        }

        System.out.println(soma);
    }
}
