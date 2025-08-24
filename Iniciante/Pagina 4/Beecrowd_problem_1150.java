import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int z  = sc.nextInt();

        while(z <= x){
            z = sc.nextInt();
        }
        sc.close();

        int soma = 0;
        int contador = 0;

        while (soma <= z){
            soma += x;
            x++;
            contador++;
        }

        System.out.println(contador);
    }
}
