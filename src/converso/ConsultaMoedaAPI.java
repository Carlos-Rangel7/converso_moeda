package converso;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoedaAPI {

    public Moeda buscarMoeda(String baseCode, String targetCode) {
        URI urlConvero = URI.create("https://v6.exchangerate-api.com/v6/SUA CHAVE/pair/" + baseCode + "/" + targetCode);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(urlConvero).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moeda.class);
        }catch (Exception e) {
            throw new RuntimeException("Não conseguimos converte a moeda");
        }
    }

    public static void exibirMenu(){
        System.out.println("*****************************************************");
        System.out.println("  Seja bem-vindo ao Conversor de Moeda!");
        System.out.println("*****************************************************");
        System.out.println();
        System.out.println("Escolha uma das opções abaixo para fazer a conversão:");
        System.out.println("-----------------------------------------------------");
        System.out.println("1) Dólar (USD) para Peso Argentino (ARS)");
        System.out.println("2) Peso Argentino (ARS) para Dólar (USD)");
        System.out.println("3) Dólar (USD) para Real Brasileiro (BRL)");
        System.out.println("4) Real Brasileiro (BRL) para Dólar (USD)");
        System.out.println("5) Dólar (USD) para Peso Colombiano (COP)");
        System.out.println("6) Peso Colombiano (COP) para Dólar (USD)");
        System.out.println("7) Consultar Histórico de Conversões");
        System.out.println("8) Sair");
        System.out.println("-----------------------------------------------------");
    }


}
