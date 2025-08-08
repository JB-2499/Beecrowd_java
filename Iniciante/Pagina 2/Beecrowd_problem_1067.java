import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        int n = pergunta.nextInt();
        pergunta.close();

        for(int i = 0; i <= n; i++) {
            if(i%2 != 0) {
                System.out.println(i);
            }
        }
    }
}
