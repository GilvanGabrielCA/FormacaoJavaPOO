public class Main {
    public static void main(String[] args) {
        ModeloCarro meuCarro = new ModeloCarro();

        meuCarro.setModelo("Sedan");
        meuCarro.setPrecoAno1(3000);
        meuCarro.setPrecoAno2(4000);
        meuCarro.setPrecoAno3(5000);
        meuCarro.exibirInfo();
    }
}