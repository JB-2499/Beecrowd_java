import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        String[] valores = pergunta.nextLine().split(" ");
        pergunta.close();

        double a = Double.parseDouble(valores[0]);
        double b = Double.parseDouble(valores[1]);
        double c = Double.parseDouble(valores[2]);

        double A = Math.max(a, Math.max(b, c));
        double C = Math.min(a, Math.min(b, c));
        double B = (a+b+c) - (A + C);

        double eps = 1e-9;
        double abc = Math.abs((A*A) - (B*B+C*C));

        if(A >= B+C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if(abc < eps) {
                System.out.println("TRIANGULO RETANGULO");
            } else if(A*A > B*B + C*C) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else if(A*A < B*B + C*C) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if((A-B) < eps && (B-C) < eps) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if((A-B) < eps || (B-C) < eps || (A-C) < eps) {
                System.out.println("TRIANGULO ISOSCELES");
            } 
        }
    }
}
