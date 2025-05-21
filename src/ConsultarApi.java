import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

public class ConsultarApi {
    public static String ObtenerDatos(){
        String URL = "https://v6.exchangerate-api.com/v6/5d6cf01f4544e6775ba167cf/latest/USD";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(URL)).build();

        CompletableFuture <String> listExchannge = client.sendAsync(request, HttpResponse.BodyHandlers.ofString()).thenApply(HttpResponse::body);

        String listaMonedas = listExchannge.join();

        return listaMonedas;
    }

}
