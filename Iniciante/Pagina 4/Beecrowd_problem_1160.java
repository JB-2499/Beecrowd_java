import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short n =  sc.nextShort();
        sc.nextLine();

        for (short i = 0; i < n; i++){
            String[] valores =  sc.nextLine().split(" ");
            int population_a = Integer.parseInt(valores[0]);
            int population_b = Integer.parseInt(valores[1]);

            float grow_rate_a = Float.parseFloat(valores[2]);
            float grow_rate_b = Float.parseFloat(valores[3]);

            short anos = 0;
            while(population_a <= population_b){
                anos++;
                population_a += (int) (population_a * (grow_rate_a)/100);
                population_b += (int) (population_b * (grow_rate_b)/100);
            }

            if (anos > 100) {
                System.out.println("Mais de 1 seculo.");
            } else {
                System.out.println(anos + " anos.");
            }
        }
        sc.close();
    }
}
