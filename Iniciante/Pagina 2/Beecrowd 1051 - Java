import java.util.Scanner;

public class Bee1051 {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        double salario = pergunta.nextDouble();
        pergunta.close();

        double impostos = 0;
        if(salario > 0 && salario <= 2000) {
            System.out.println("Isento");
        } else {
            if(salario > 2000 && salario <= 3000) {
                impostos = (salario - 2000)*0.08;
            } else if(salario > 3000 && salario <= 4500) {
                impostos = (1000*0.08) + (salario - 3000)*0.18;
            } else if(salario > 4500) {
                impostos = (1000*0.08) + (1500*0.18) + (salario - 4500)*0.28;
            }
            
            System.out.printf("R$ %.2f\n", impostos);
        }
    }
}
