import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        String[] numeros = pergunta.nextLine().split(" ");
        double A = Double.parseDouble(numeros[0]);
        double B = Double.parseDouble(numeros[1]);
        double C = Double.parseDouble(numeros[2]);
        pergunta.close();
        if(A == 0) {
            System.out.println("Impossivel calcular");
        } else {
            double delta = B*B - 4*A*C;
            if(delta >= 0) {
            double x1 = ((-1*B) + Math.sqrt(delta))/(2*A);
            double x2 = ((-1*B) - Math.sqrt(delta))/(2*A);
            System.out.printf("R1 = %.5f\n", x1);
            System.out.printf("R2 = %.5f\n", x2);
            } else {
            System.out.println("Impossivel calcular");
            }
        }
    }
}
