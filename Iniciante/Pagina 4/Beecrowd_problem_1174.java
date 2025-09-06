import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (byte i = 0; i < 100; i++) {
            double valor = sc.nextDouble();

            if (valor <= 10) {
                System.out.print("A[" + (i) + "] = ");
                System.out.printf("%.1f\n", valor);
            }
        }
        sc.close();
    }
}
