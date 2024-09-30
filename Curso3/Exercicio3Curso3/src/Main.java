import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
//        try{
//            int x = scanner.nextInt();
//            int y = scanner.nextInt();
//
//            int div = x / y;
//        } catch (ArithmeticException e){
//            System.out.println("Erro: Divisão por zero não permitida");
//        }
//
//        System.out.println();
//
//        System.out.print("Digite sua senha: ");
//        String senha = scanner.nextLine();
//
//        try{
//            validarSenha(senha);
//        } catch (SenhaInvalidaException e){
//            System.out.println("Erro: " + e.getMessage());
//        }
//    }
//
//    private static void validarSenha(String senha) {
//        if (senha.length() < 8) {
//            throw new SenhaInvalidaException("A senha deve ter pelo menos 8 caracteres.");
//        }

        System.out.print("Digite o nome de usuário do GitHub para consultar informações: ");
        String username = scanner.nextLine();

        String endereco = "https://api.github.com/users/" + username;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .header("Accept", "application/vnd.gihub.v3+json")
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 404){
                throw new ErroConsultaGitHubException("Usuário não encontrado no GITHUB");
            }

            String json = response.body();
            System.out.println(json);
        } catch (IOException | InterruptedException e){
            System.out.println("Opss... Houve um erro durante a consulta à API do GitHub");
            e.printStackTrace();
        } catch (ErroConsultaGitHubException e) {
            System.out.println(e.getMessage());
        }
    }
}