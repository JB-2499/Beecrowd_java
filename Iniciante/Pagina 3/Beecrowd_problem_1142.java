import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int i = 0;
        int a = 1;

        while (i < n) {
            System.out.println(a+" "+(a+1)+" "+(a+2)+" PUM");
            a += 4;
            i++;
        }
    }
}
