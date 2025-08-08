import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        double salario = pergunta.nextDouble();
        pergunta.close();

        double taxa_reajuste = 0.0;
        if(salario > 0 && salario <= 400) {
            taxa_reajuste = 0.15;
        } else if(salario > 400 && salario <= 800) {
            taxa_reajuste = 0.12;
        } else if(salario > 800 && salario <= 1200) {
            taxa_reajuste = 0.10;
        } else if(salario > 1200 && salario <= 2000) {
            taxa_reajuste = 0.07;
        } else if(salario > 2000) {
            taxa_reajuste = 0.04;
        }

        double reajuste = salario*taxa_reajuste;
        double novo_salario = salario+reajuste;

        System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\n", novo_salario, reajuste);
        System.out.println("Em percentual: "+(int) (taxa_reajuste*100)+" %");
    }
}
