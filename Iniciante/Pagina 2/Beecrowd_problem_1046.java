import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        String[] valores = pergunta.nextLine().split(" ");
        pergunta.close();

        int inicio = Integer.parseInt(valores[0]);
        int fim = Integer.parseInt(valores[1]);

        int duracao = fim - inicio;
        if(duracao < 0) {
            duracao = 24 + duracao;
        } else if(duracao == 0) {
            duracao = 24;
        }

        System.out.println("O JOGO DUROU "+duracao+" HORA(S)");
    }
}
