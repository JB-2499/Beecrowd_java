public class Main {
    public static void main(String[] args) {
        double i = 0;

        while (i <= 2.001) {
            if(Math.abs(i - Math.round(i)) < 1e-9) {
                System.out.printf("I=%.0f J=%.0f\n", i, i+1);
                System.out.printf("I=%.0f J=%.0f\n", i, i+2);
                System.out.printf("I=%.0f J=%.0f\n", i, i+3);
            } else {
                System.out.printf("I=%.1f J=%.1f\n", i, i+1);
                System.out.printf("I=%.1f J=%.1f\n", i, i+2);
                System.out.printf("I=%.1f J=%.1f\n", i, i+3);
            }
            i += 0.2;
        }
    }
}
