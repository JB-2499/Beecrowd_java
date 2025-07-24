import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        double[] menu = {4.0, 4.5, 5.0, 2.0, 1.5};
        String[] n = pergunta.nextLine().split(" ");
        pergunta.close();
        int codigo = Integer.parseInt(n[0])-1;
        int quantidade = Integer.parseInt(n[1]);
        double valor = menu[codigo]*quantidade;
        System.out.printf("Total: R$ %.2f\n",valor);
    }
}
