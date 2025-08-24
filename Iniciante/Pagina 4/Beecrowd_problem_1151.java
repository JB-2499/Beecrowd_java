import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();


        List<Integer> sequencia = new ArrayList<>();
        sequencia.add(0);
        sequencia.add(1);
        for (int i = 2; i < n; i++) {
            sequencia.add(sequencia.get(sequencia.size()-1) + sequencia.get(sequencia.size()-2));
        }

        for (int j = 0; j < sequencia.size()-1; j++) {
            System.out.print(sequencia.get(j)+" ");
        }
        System.out.println(sequencia.get(sequencia.size()-1));
    }
}
