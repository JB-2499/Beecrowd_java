package beecrowd;
import java.util.Scanner;

public class Bee1013 {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);

        String input = pergunta.nextLine();
        String[] numeros = input.split(" ");

        int A = Integer.parseInt(numeros[0]);
        int B = Integer.parseInt(numeros[1]);
        int C = Integer.parseInt(numeros[2]);

        int maior_AB = (A+B+Math.abs(A - B))/2;
        int maior_geral = (maior_AB+C+Math.abs(maior_AB - C))/2;

        System.out.println(maior_geral+" eh o maior");

        pergunta.close();
    }
}