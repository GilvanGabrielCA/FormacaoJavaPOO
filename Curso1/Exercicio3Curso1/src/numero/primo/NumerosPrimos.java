package numero.primo;

public class NumerosPrimos {
    public boolean verificarPrimalidade(int numero){
        if (numero <= 1){
            return false;
        }

        for (int i = 2; i * i <= numero; i++){
            if (numero % i == 0){
                return false;
            }
        }
        return true;
    }

    public void listarPrimos(int limiteSuperiro){
        System.out.println("Números primos até " + limiteSuperiro + ": ");
        for (int i = 2; i <= limiteSuperiro; i++){
            if (verificarPrimalidade(i)){
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }
}
