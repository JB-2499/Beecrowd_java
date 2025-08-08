import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        String[] valores = pergunta.nextLine().split(" ");
        pergunta.close();

        int A = Integer.parseInt(valores[0]);
        int B = Integer.parseInt(valores[1]);
        int C = Integer.parseInt(valores[2]);

        int maior = Math.max(A, Math.max(B, C));
        int menor = Math.min(A, Math.min(B, C));
        int medio = (A+B+C) - (menor + maior);
        
        int[] ordenados = {menor, medio, maior};

        for(int i = 0; i < 3; i++) {
            System.out.println(ordenados[i]);
        }
        System.out.println();
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }
}
