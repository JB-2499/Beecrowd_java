import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        int n = pergunta.nextInt();
        pergunta.close();

        Map<Integer, String> codigos = new HashMap<>();
        codigos.put(61, "Brasilia");
        codigos.put(71, "Salvador");
        codigos.put(11, "Sao Paulo");
        codigos.put(21, "Rio de Janeiro");
        codigos.put(32, "Juiz de Fora");
        codigos.put(19, "Campinas");
        codigos.put(27, "Vitoria");
        codigos.put(31, "Belo Horizonte");

        if(codigos.containsKey(n)) {
            System.out.println(codigos.get(n));
        } else {
            System.out.println("DDD nao cadastrado");
        }
    }
}
