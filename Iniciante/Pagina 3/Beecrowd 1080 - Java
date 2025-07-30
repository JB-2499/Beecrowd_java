import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Integer> valores = new ArrayList<>();

        int maior = 0;
        int indice = 0;
        Scanner pergunta = new Scanner(System.in);
        for(int i = 0; i < 100; i++) {
            int valor = pergunta.nextInt();
            valores.add(valor);
            if(i > 0) {
                if(valor > maior) {
                    maior = valor;
                    indice = i+1;
                }
            } else {
                maior = valor;
                indice = 0;
            }
        }
        pergunta.close();

        System.out.println(maior+"\n"+indice);
    }
}
