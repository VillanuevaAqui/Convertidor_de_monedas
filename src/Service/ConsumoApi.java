package Service;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoApi {

    private String url;

    public ConsumoApi(String url) {
        this.url = url;
    }

    public String obtenerDatosMonedas(String monedaBase, String monedaObjetivo, String monto) {

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(this.url + monedaBase + "/" + monedaObjetivo + "/" + monto))
                .build();

        try {
            HttpResponse<String> respuesta = client.send(request, HttpResponse.BodyHandlers.ofString());
            JsonObject json = JsonParser.parseString(respuesta.body()).getAsJsonObject();

            return (monto + " " + monedaBase + " Equivalen a " + json.get("conversion_result").getAsString() + " " + monedaObjetivo);

        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}