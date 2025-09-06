import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int x = sc.nextInt();

            if (x > 0) {
                lista.add(x);
            } else {
                lista.add(1);
            }
        }
        sc.close();

        byte i = 0;
        for (int elemento : lista)  {
            System.out.println("X[" + i + "] = " + elemento);
            i++;
        }
    }
}
