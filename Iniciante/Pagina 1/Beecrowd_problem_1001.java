import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        int numero1 = pergunta.nextInt();
        int numero2 = pergunta.nextInt();
        int X = numero1 + numero2;
        System.out.println("X = "+X);
        pergunta.close();
    }
}

