import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        int num_1 = pergunta.nextInt();
        int num_2 = pergunta.nextInt();
        pergunta.close();

        int a = Math.min(num_1, num_2);
        int b = Math.max(num_1, num_2);

        for(int i = a+1; i < b; i++) {
            if(i%5 == 2 || i%5 == 3) {
                System.out.println(i);
            }
        }
    }
}
