import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        int n = pergunta.nextInt();
        pergunta.nextLine();

        for(int i = 0; i < n; i++) {
            String[] valores = pergunta.nextLine().split(" ");
            
            double valor1 = Double.parseDouble(valores[0]) * 2;
            double valor2 = Double.parseDouble(valores[1]) * 3;
            double valor3 = Double.parseDouble(valores[2]) * 5;

            double media = (valor1 + valor2 + valor3) / 10.0;

            System.out.printf("%.1f\n", media);
        }
        pergunta.close();
    }
}
