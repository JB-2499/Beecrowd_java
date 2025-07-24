import java.util.Locale;
//Aqui a biblioteca "Locale" foi utilizada para evitar problemas em relação ao padrão nacional de separar decimais com "," no Brasil.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in).useLocale(Locale.US);

        String[] notas = pergunta.nextLine().split(" ");
        double nota1 = Double.parseDouble(notas[0])*2;
        double nota2 = Double.parseDouble(notas[1])*3;
        double nota3 = Double.parseDouble(notas[2])*4;
        double nota4 = Double.parseDouble(notas[3]);
        double media = (nota1+nota2+nota3+nota4)/10;

        double media1 = Math.floor(media*100)/100;
        //Essa parte remove os centésimos da média para que não sejam arredondados no print.
        
        System.out.printf(Locale.US, "Media: %.1f\n", media1);

        if(media1 >= 7) {
            System.out.println("Aluno aprovado.");
        } else if(media1 < 5) {
            System.out.println("Aluno reprovado.");
        } else if(media1 >= 5 && media1 < 7) {
           System.out.println("Aluno em exame.");
           double exame = pergunta.nextDouble();
           double media2 = (exame+media1)/2.0;
           media2 = Math.floor(media2*100)/100;
           
            System.out.printf(Locale.US, "Nota do exame: %.1f\n", exame);
            if(media2 >= 5) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf(Locale.US, "Media final: %.1f\n", media2);
        }
        pergunta.close();
    }
}
