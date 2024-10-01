public class Titulo implements Comparable<Titulo>{
    private String nome;

    Titulo (String nome){
        this.nome = nome;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.nome.compareTo(outroTitulo.nome);
    }

    @Override
    public String toString() {
        return this.nome;
    }
}