import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);

        while(true) {
            String[] valores = pergunta.nextLine().split(" ");
            int valor1 = Integer.parseInt(valores[0]);
            int valor2 = Integer.parseInt(valores[1]);

            if(valor1 == valor2) {
                break;
            }

            if(valor1 < valor2) {
                System.out.println("Crescente");
            } else if(valor1 > valor2) {
                System.out.println("Decrescente");
            }
        }
        pergunta.close();
    }
}
