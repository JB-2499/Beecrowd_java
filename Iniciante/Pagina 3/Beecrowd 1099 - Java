import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        int n = pergunta.nextInt();
        pergunta.nextLine();

        for(int i = 0; i < n; i++) {
            String[] valores = pergunta.nextLine().split(" ");
            int valor1 = Integer.parseInt(valores[0]);
            int valor2 = Integer.parseInt(valores[1]);

            int maior = Math.max(valor1, valor2);
            int menor = Math.min(valor1, valor2);

            int soma = 0;
            for(int j = menor+1; j < maior; j++) {
                if(j%2 != 0) {
                    soma += j;
                }
            }

            System.out.println(soma);
        }
        pergunta.close();


    }
}
