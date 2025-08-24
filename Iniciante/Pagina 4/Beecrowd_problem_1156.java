public class Main {
    public static void main(String[] args) {
        double s = 1;

        double n = 2;
        for (double i = 3; i <= 39; i += 2) {
            s += i/n;
            n = n*2;
        }

        System.out.printf("%.2f\n", s);
    }
}
