import animal.Cachorro;
import animal.Gato;
import banco.ContaBancaria;
import banco.ContaCorrente;
import carro.ModeloCarro;
import numero.primo.GeradorPrimo;
import numero.primo.NumerosPrimos;
import numero.primo.VerificadorPrimo;

public class Main {
    public static void main(String[] args) {
        ModeloCarro meuCarro = new ModeloCarro();

        meuCarro.setModelo("Sedan");
        meuCarro.setPrecoAno1(3000);
        meuCarro.setPrecoAno2(4000);
        meuCarro.setPrecoAno3(5000);
        meuCarro.exibirInfo();

        System.out.println();

        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();

        System.out.println();

        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();

        System.out.println();

        ContaBancaria conta = new ContaBancaria();
        conta.depositar(1000);
        conta.consultarSaldo();

        System.out.println();

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(200);
        contaCorrente.cobrarTarifa();
        contaCorrente.consultarSaldo();
        contaCorrente.sacar(150);
        contaCorrente.consultarSaldo();

        System.out.println();

        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificarSeEhPrimo(17);

        System.out.println();

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.gerarProximoPrimo(17);
        System.out.println("O próximo primo após 17 é: " + proximoPrimo);

        System.out.println();

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(30);
    }
}