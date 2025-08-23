import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] valores = sc.nextLine().split(" ");
        sc.close();

        int a = 0;
        int valor = Integer.parseInt(valores[0]);
        int b = Integer.parseInt(valores[1]);
        int taxa = 0;

        while (a < b) {
            a++;
            taxa++;
            
            if (taxa - valor != 0) {
                System.out.print(a+" ");
            } else if (taxa - valor == 0) {
                System.out.println(a);
                taxa = 0;
            }
        }
    }
}
