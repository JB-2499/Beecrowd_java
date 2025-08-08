import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);

        while(true) {
            String[] valores = pergunta.nextLine().split(" ");
            int x = Integer.parseInt(valores[0]);
            int y = Integer.parseInt(valores[1]);

            if(x == 0 || y == 0) {
                break;
            }

            if(x > 0) {
                if(y > 0) {
                    System.out.println("primeiro");
                } else if(y < 0) {
                    System.out.println("quarto");
                }
            } else if(x < 0) {
                if(y > 0) {
                    System.out.println("segundo");
                } else if(y < 0) {
                    System.out.println("terceiro");
                }
            }
        }

        pergunta.close();
    }
}
