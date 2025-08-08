import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        String[] valores = pergunta.nextLine().split(" ");
        pergunta.close();

        int hora1 = Integer.parseInt(valores[0]);
        int minuto1 = Integer.parseInt(valores[1]);
        int hora2 = Integer.parseInt(valores[2]);
        int minuto2 = Integer.parseInt(valores[3]);

        int horas = hora2 - hora1;
        int minutos = minuto2 - minuto1;
        if(horas < 0) {
            horas = 24 + horas;
        }
        if(horas == 0 && minutos > 0) {
            horas = 0;
        } else if(horas == 0) {
            horas = 24;
        }
        if(minutos < 0){
                minutos = 60 + minutos;
                horas--;
        } 
        System.out.println("O JOGO DUROU "+horas+" HORA(S) E "+minutos+" MINUTO(S)");
    }
}
