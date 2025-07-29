import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        int n = pergunta.nextInt();
        pergunta.close();

        int impares = 0;
        int numero = n;
        if(n%2 != 0) {
            impares = 1;
            System.out.println(n);
        } else {
            numero--;
        }
        while(impares < 6) {
            numero += 2;
            System.out.println(numero);
            if(numero%2 != 0) {
                impares++;
            }
        }
    }
}
