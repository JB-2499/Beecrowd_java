import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        int num_1 = pergunta.nextInt();
        int num_2 = pergunta.nextInt();
        pergunta.close();

        int a = Math.min(num_1, num_2);
        int b = Math.max(num_1, num_2);

        int i = a;
        int soma = 0;
        while (i < b+1) {
            if(i % 13 != 0) {
                soma += i;
            }
            i++;
        }
        System.out.println(soma);
    }
}
