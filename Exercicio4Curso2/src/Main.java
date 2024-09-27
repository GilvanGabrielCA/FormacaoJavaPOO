import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<Integer>();
        numbers.add(5);
        numbers.add(4);
        numbers.add(9);
        numbers.add(8);
        numbers.add(54);
        numbers.add(21);
        numbers.add(24);
        numbers.add(34);
        numbers.add(7);
        numbers.add(2);
        numbers.add(3);

        Collections.sort(numbers);
        System.out.println(numbers);

        System.out.println();

        Titulo titulo1 = new Titulo("Percy Jakson e os Olimpianos");
        Titulo titulo2 = new Titulo("WandaVision");
        Titulo titulo3 = new Titulo("Loki");
        Titulo titulo4 = new Titulo("Kaos");
        Titulo titulo5 = new Titulo("The Flash");
        Titulo titulo6 = new Titulo("Arrow");
        Titulo titulo7 = new Titulo("DC Legends of Tomorrow");

        List<Titulo> listaTitulos = new LinkedList<>();
        listaTitulos.add(titulo1);
        listaTitulos.add(titulo2);
        listaTitulos.add(titulo3);
        listaTitulos.add(titulo4);
        listaTitulos.add(titulo5);
        listaTitulos.add(titulo6);
        listaTitulos.add(titulo7);

        Collections.sort(listaTitulos);

        System.out.println(listaTitulos);
    }
}