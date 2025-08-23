import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Time gremio = new Time();
        gremio.nome = "Gremio";
        Time inter = new Time();
        inter.nome = "Inter";
        Scanner sc = new Scanner(System.in);
        gremio.jogar(sc, inter, gremio);
        sc.close();
    }
}

class Time {
    String nome;
    int vitorias;
    int empates;

    void jogar(Scanner sc, Time time_a, Time time_b) {
        int grenais = 0;

        while (true) {
            grenais++;

            String[] grenal = sc.nextLine().split(" ");
            int gols_a = Integer.parseInt(grenal[0]);
            int gols_b = Integer.parseInt(grenal[1]);

            if (gols_a > gols_b) {
                time_a.vitorias++;
            } else if (gols_b > gols_a) {
                time_b.vitorias++;
            }
            else if (gols_a == gols_b) {
                time_a.empates++;
                time_b.empates++;
            }

            System.out.println("Novo grenal (1-sim 2-nao)");
            int continuar = sc.nextInt();
            sc.nextLine();

            if (continuar == 1) {
                continue;
            } else {
                System.out.println(grenais+" grenais");
                System.out.println(time_a.nome+":"+time_a.vitorias);
                System.out.println(time_b.nome+":"+time_b.vitorias);
                System.out.println("Empates:"+time_a.empates);

                if (time_a.vitorias > time_b.vitorias) {
                    System.out.println(time_a.nome+" venceu mais");
                } else if (time_b.vitorias > time_a.vitorias) {
                    System.out.println(time_b.nome+" venceu mais");
                } else {
                    System.out.println("Nao houve vencedor");
                }
                break;
            }
        }
    }
}
