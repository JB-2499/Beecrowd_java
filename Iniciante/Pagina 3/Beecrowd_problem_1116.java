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

            if(valor2 ==0) {
                System.out.println("divisao impossivel");
            } else {
                double division = valor1/(double) valor2;
                System.out.println(division);
            }
        }
        pergunta.close();

    }
}
