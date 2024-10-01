package banco;

public class ContaCorrente  extends ContaBancaria {
    private double tarifaMensal;

    public void cobrarTarifa(){
        saldo -= tarifaMensal;
        System.out.println("Tarifa mensal de " + tarifaMensal + " cobrada. Saldo atual: " + saldo);
    }
}
