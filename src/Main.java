import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args)  throws IOException {
        Scanner sc = new Scanner(System.in);

        Map<String, String> listaAnimais = new HashMap<String, String>();
        listaAnimais.put("vertebrado.ave.carnivoro", "aguia");
        listaAnimais.put("vertebrado.ave.onivoro", "pomba");
        listaAnimais.put("vertebrado.mamifero.onivoro", "homem");
        listaAnimais.put("vertebrado.mamifero.herbivoro", "vaca");
        listaAnimais.put("invertebrado.inseto.hematofago", "pulga");
        listaAnimais.put("invertebrado.inseto.herbivoro", "lagarta");
        listaAnimais.put("invertebrado.anelideo.hematofago", "sanguessuga");
        listaAnimais.put("invertebrado.anelideo.onivoro", "minhoca");


        String classificacao, grupo, dieta;

        classificacao = sc.nextLine();
        grupo = sc.nextLine();
        dieta = sc.nextLine();

        String key = classificacao.toLowerCase() + '.' + grupo.toLowerCase() + '.' + dieta.toLowerCase();
        System.out.println(listaAnimais.get(key));


    }
}