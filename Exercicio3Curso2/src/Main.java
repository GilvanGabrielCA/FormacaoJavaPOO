import animal.Animal;
import animal.Cachorro;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();

        lista.add("Joao");
        lista.add("Bruno");
        lista.add("Julia");
        lista.add("Leo");
        lista.add("Ana");
        lista.add("Jose");
        lista.add("Paulo");
        lista.add("Pedro");
        lista.add("Maria");

        for (String itens: lista){
            System.out.println(lista);
        }

        Animal animal = new Cachorro();

        if (animal instanceof Cachorro){
            Cachorro cachorro = (Cachorro) animal;
        } else {
            System.out.println("O objeto não é um cachorro.");
        }
    }
}