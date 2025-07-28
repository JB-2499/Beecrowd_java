import java.util.Scanner;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        String vertebra = pergunta.nextLine();
        String forma = pergunta.nextLine();
        String dieta = pergunta.nextLine();
        pergunta.close();

        Map<String, Integer> chaves_master = new HashMap<>();
        chaves_master.put("vertebrado", 0);
        chaves_master.put("invertebrado", 1);
        chaves_master.put("ave", 0);
        chaves_master.put("mamifero", 1);
        chaves_master.put("inseto", 0);
        chaves_master.put("anelideo", 1);

        Map<String, Integer> chaves_sub = new HashMap<>();
        chaves_sub.put("hematofago", 0);
        chaves_sub.put("herbivoro", 1);
        if(forma.equalsIgnoreCase("anelideo") || forma.equalsIgnoreCase("ave")) {
            chaves_sub.put("onivoro", 1);
        } else {
           chaves_sub.put("onivoro", 0); 
        }
        chaves_sub.put("carnivoro", 0);

        int indice_1 = chaves_master.get(vertebra);
        int indice_2 = chaves_master.get(forma);
        int indice_3 = chaves_sub.get(dieta);

        List<List<List<String>>> lista_final = new ArrayList<>();
        List<List<String>> vertebrado = new ArrayList<>();
        List<List<String>> invertebrado = new ArrayList<>();
        List<String> ave = new ArrayList<>();
        List<String> mamifero = new ArrayList<>();
        List<String> inseto = new ArrayList<>();
        List<String> anelideo = new ArrayList<>();

        ave.add("aguia");
        ave.add("pomba");
        mamifero.add("homem");
        mamifero.add("vaca");
        inseto.add("pulga");
        inseto.add("lagarta");
        anelideo.add("sanguessuga");
        anelideo.add("minhoca");

        vertebrado.add(ave);
        vertebrado.add(mamifero);
        invertebrado.add(inseto);
        invertebrado.add(anelideo);

        lista_final.add(vertebrado);
        lista_final.add(invertebrado);

        System.out.println(lista_final.get(indice_1).get(indice_2).get(indice_3));
    }
}
