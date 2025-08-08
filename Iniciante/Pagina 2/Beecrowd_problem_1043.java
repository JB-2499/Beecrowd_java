import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        String[] valores = pergunta.nextLine().split(" ");
        pergunta.close();

        double A = Double.parseDouble(valores[0]);
        double B = Double.parseDouble(valores[1]);
        double C = Double.parseDouble(valores[2]);

        if(Math.abs(B - C) < A && A < B + C) {
            double triangulo = A+B+C;
            System.out.printf("Perimetro = %.1f\n",triangulo);
        } else {
            double trapezio = (A + B)*C/2;
            System.out.printf("Area = %.1f\n", trapezio);
        }
    }
}
