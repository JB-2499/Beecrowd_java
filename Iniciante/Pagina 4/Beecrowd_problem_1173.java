import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v =  sc.nextInt();

        for (byte i = 1; i <= 10; i++) {
            System.out.println("N[" + (i-1) + "] = " + v);
            v = v*2;
        }
        sc.close();
    }
}
