import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);

        while(true) {
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
            
            double media = (nota1+nota2)/2;
            System.out.printf("media = %.2f\n", media);

            int continuar = 0;
            while(true) {
                System.out.print("novo calculo (1-sim 2-nao)");
                continuar = pergunta.nextInt();
                System.out.println();
                if(continuar == 1 || continuar == 2) {
                    break;
                } else {
                    continue;
                }
            }

            if(continuar == 1) {
                continue;
            } else if(continuar == 2) {
                break;
            }
        }
        pergunta.close();
    }
}
