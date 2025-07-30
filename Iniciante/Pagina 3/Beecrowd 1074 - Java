import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        int n = pergunta.nextInt();
        for(int i = 0; i < n; i++) {
            String tipagem = "";
            int x = pergunta.nextInt();

            if(x == 0) {
                tipagem = "NULL";
            } else {
                if(x%2 == 0) {
                    tipagem += "EVEN";
                } else if(x%2 != 0) {
                    tipagem += "ODD";
                }

                if(x > 0) {
                    tipagem += " POSITIVE";
                } else if(x < 0) {
                    tipagem += " NEGATIVE";
                }
            }
            System.out.println(tipagem);
        }
        pergunta.close();
    }
}
