import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        String[] w = pergunta.nextLine().split(" ");
        String[] x = pergunta.nextLine().split(" : ");
        String[] y = pergunta.nextLine().split(" ");
        String[] z = pergunta.nextLine().split(" : ");
        pergunta.close();

        int dia1 = Integer.parseInt(w[1]);
        int hora1 = Integer.parseInt(x[0]);
        int minuto1 = Integer.parseInt(x[1]);
        int segundo1 = Integer.parseInt(x[2]);
        int dia2 = Integer.parseInt(y[1]);
        int hora2 = Integer.parseInt(z[0]);
        int minuto2 = Integer.parseInt(z[1]);
        int segundo2 = Integer.parseInt(z[2]);

        int dias = dia2 - dia1;
        int segundos = segundo2 - segundo1;
        int minutos = minuto2 - minuto1;
        int horas = hora2 - hora1;

        if(segundos < 0) {
            segundos = 60 + segundos;
            minutos--;
        }
        if(minutos < 0) {
            minutos = 60 + minutos;
            horas--;
        }
        if(horas < 0) {
            horas = 24 + horas;
            dias--;
        }

        System.out.println(dias+" dia(s)");
        System.out.println(horas+" hora(s)");
        System.out.println(minutos+" minuto(s)");
        System.out.println(segundos+" segundo(s)");
    }
}
