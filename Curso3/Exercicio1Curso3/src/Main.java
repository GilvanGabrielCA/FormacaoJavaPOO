import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        /*
         Crie um programa em Java que utilize as classes HttpClient, HttpRequest e HttpResponse para fazer uma consulta
         à API do Google Books. Solicite ao usuário que insira o título de um livro, e exiba as informações disponíveis
         sobre o livro retornado pela API.
         */

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Digite o título do livro para a busca: ");
//        var busca = scanner.nextLine();
//        String chave = "AIzaSyCYKSOqOSas-0ii0Wpx_YNJiMCHJ5JrS0o";
//        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + busca + chave;

//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
//        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//        System.out.println(response.body());

        System.out.println();

//        System.out.println("Digite o nome da criptomoeda para a cotação (por exemplo, bitcoin): ");
//        var criptoNome = scanner.nextLine();
//
//        String endereco = "https://api.coingecko.com/api/v3/simple/price?ids=" + criptoNome + "&vs_currencies=usd";
//
//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
//        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//
//        System.out.println(response.body());

        System.out.println("Digite o nome da receita para a busca: ");
        var nomeReceita = scanner.nextLine();

        String endereco = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + nomeReceita;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
        scanner.close();
    }
}