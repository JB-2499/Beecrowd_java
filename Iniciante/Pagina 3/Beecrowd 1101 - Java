import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);

        while(true) {
            String[] valores = pergunta.nextLine().split(" ");
            int valor1 = Integer.parseInt(valores[0]);
            int valor2 = Integer.parseInt(valores[1]);

            if(valor1 == 0 || valor2 == 0 || valor1 < 0 || valor2 < 0) {
                break;
            }

            int maior = Math.max(valor1, valor2);
            int menor = Math.min(valor1, valor2);

            int soma = 0;
            String numeros = "";
            for(int j = menor; j < maior+1; j++) {
                soma += j;
                if(soma == j) {
                    numeros += (""+j);
                } else {
                    numeros += (" "+j);
                }
            }

            System.out.println(numeros+" Sum="+soma);
        }
        pergunta.close();
    }
}
