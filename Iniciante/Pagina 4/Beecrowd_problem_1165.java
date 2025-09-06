import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte n =  sc.nextByte();
        sc.nextLine();

        for (byte i = 1; i <= n; i++) {
            byte divisores = 0;
            int x  = sc.nextInt();

            for  (int j = 1; j < x; j++) {
                if (x % j == 0) {
                    divisores++;
                }
            }

            if  (divisores == 1) {
                System.out.println(x + " eh primo");
            } else  {
                System.out.println(x + " nao eh primo");
            }
        }
        sc.close();
    }
}
