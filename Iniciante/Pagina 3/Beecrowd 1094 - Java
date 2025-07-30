import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        int n = pergunta.nextInt();
        
        int total_cobaias = 0;
        int coelhos = 0;
        int ratos = 0;
        int sapos = 0;
        
        pergunta.nextLine();
        for(int i = 0; i < n; i++) {
            String[] valores = pergunta.nextLine().split(" ");
            int cobaias = Integer.parseInt(valores[0]);
            String tipo_cobaia = valores[1].toUpperCase();
            total_cobaias += cobaias;
            if(tipo_cobaia.equalsIgnoreCase("C")) {
                coelhos += cobaias;
            } else if(tipo_cobaia.equalsIgnoreCase("R")) {
                ratos += cobaias;
            } else if(tipo_cobaia.equalsIgnoreCase("S")) {
                sapos += cobaias;
            }
        }
        pergunta.close();

        double percentual_coelhos = (coelhos/(double)total_cobaias)*100;
        double percentual_ratos = (ratos/(double)total_cobaias)*100;
        double percentual_sapos = (sapos/(double)total_cobaias)*100;

        System.out.println("Total: "+total_cobaias+" cobaias");
        if(coelhos > 0) {
            System.out.println("Total de coelhos: "+coelhos);
        }
        if(ratos > 0) {
            System.out.println("Total de ratos: "+ratos);
        }
        if(sapos > 0) {
            System.out.println("Total de sapos: "+sapos);
        }
        if(coelhos > 0) {
            System.out.printf("Percentual de coelhos: %.2f", percentual_coelhos);
            System.out.println(" %");
        }
        if(ratos > 0) {
            System.out.printf("Percentual de ratos: %.2f", percentual_ratos);
            System.out.println(" %");
        }
        if(sapos > 0) {
            System.out.printf("Percentual de sapos: %.2f", percentual_sapos);
            System.out.println(" %");
        }
    }
}
