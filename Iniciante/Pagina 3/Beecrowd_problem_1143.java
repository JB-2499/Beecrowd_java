import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int a = 1;

        while (a <= n) {
            System.out.println(a+" "+(a*a)+" "+(a*a*a));
            a++;
        }
    }
}
