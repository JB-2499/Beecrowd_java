import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List <Integer> lista = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        for (byte i = 0; i < 20; i++) {
            lista.add(sc.nextInt());
        }
        sc.close();

        for (byte i = 19; i >= 0; i--) {
            System.out.println("N[" + (19-i) + "] = " + lista.get(i));
        }
    }
}
