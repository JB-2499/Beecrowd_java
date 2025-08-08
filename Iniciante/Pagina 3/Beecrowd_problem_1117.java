import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);

        double nota1 = 0;
        double nota2 = 0;

        while(true) {
            nota1 = pergunta.nextDouble();
            if(nota1 < 0 || nota1 > 10) {
                System.out.println("nota invalida");
                continue;
            } else {
                break;
            }
        }

        while(true) {
            nota2 = pergunta.nextDouble();
            if(nota2 < 0 || nota2 > 10) {
                System.out.println("nota invalida");
                continue;
            } else {
                break;
            }
        }
        pergunta.close();

        double media = (nota1+nota2)/2;
        System.out.printf("media = %.2f\n", media);
    }
}
