package beecrowd;
import java.util.Scanner;

public class Bee1001 {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        System.out.print("Qual o nome do aniversáriante? ");
        String nome = pergunta.nextLine();
        if(nome.equalsIgnoreCase("Lohanne Byanck")) {
            System.out.println("parabéns Lorrany Beanki😻😻❤️❤️❤️🏳️‍🌈!!!");
        } else {
            System.out.println("foda-se essa pessoa👍");
        }
        pergunta.close();
    }
}