import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        String[] coordenada = pergunta.nextLine().split(" ");
        double X = Double.parseDouble(coordenada[0]);
        double Y = Double.parseDouble(coordenada[1]);
        if(X == 0 && Y == 0) {
            System.out.println("Origem");
        } else if(Y == 0) {
            System.out.println("Eixo X");
        } else if(X == 0) {
            System.out.println("Eixo Y");
        } else if(X > 0 && Y > 0) {
            System.out.println("Q1");
        } else if(X > 0 && Y < 0) {
            System.out.println("Q4");
        } else if(X < 0 && Y < 0) {
            System.out.println("Q3");
        } else if(X < 0 && Y > 0) {
            System.out.println("Q2");
        }
        pergunta.close();
    }
}
