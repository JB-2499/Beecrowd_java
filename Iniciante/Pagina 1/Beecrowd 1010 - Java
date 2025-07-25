import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        String input1 = pergunta.nextLine();
        String[] entrada_1 = input1.split(" ");
        String input2 = pergunta.nextLine();
        String[] entrada_2 = input2.split(" ");

        int codigo_1 = Integer.parseInt(entrada_1[0]);
        int quantidade_1 = Integer.parseInt(entrada_1[1]);
        double preco_1 = Double.parseDouble(entrada_1[2]);
        int codigo_2 = Integer.parseInt(entrada_2[0]);
        int quantidade_2 = Integer.parseInt(entrada_2[1]);
        double preco_2 = Double.parseDouble(entrada_2[2]);

        double valor_1 = preco_1*quantidade_1;
        double valor_2 = preco_2*quantidade_2;
        double valor_total = valor_1+valor_2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valor_total);

        pergunta.close();
    }
}
