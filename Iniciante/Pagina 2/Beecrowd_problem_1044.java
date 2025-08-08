import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        String[] valores = pergunta.nextLine().split(" ");
        pergunta.close();

        int A = Integer.parseInt(valores[0]);
        int B = Integer.parseInt(valores[1]);
        int maior = Math.max(A, B);
        int menor = Math.min(A, B);

        if(maior % menor == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
}
