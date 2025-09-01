import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int x = sc.nextInt();
            sc.nextLine();
            
            if (x == 0) {
                break;
            } else {
                if (x%2 != 0) {
                    x++;
                }
                
                int soma = 0;
                int cont = 0;
                while (cont < 5) {
                    soma += x;
                    x += 2;
                    cont++;
                }
                
                System.out.println(soma);
            }
        }
        sc.close();
    }
}
