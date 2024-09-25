import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Willian");
        pessoa1.setIdade(25);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Gilvan");
        pessoa2.setIdade(22);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Jamile");
        pessoa3.setIdade(19);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);
        System.out.println(listaDePessoas.size());
        System.out.println(listaDePessoas.get(0).toString());
        System.out.println("\n" + listaDePessoas.toString());
    }
}