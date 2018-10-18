package model;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Localizacao {

    private static String key_api = "IT6wvRkFQDpBWHlBYtTrdueOabnAH2W7";
    private String rua;
    private String numero;
    private String cidade;
    private String estado;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    private String enderecoFormatado() {
        return this.rua + "," + this.numero + "," + this.cidade + "," + this.estado + ",BR";
    }

    public CoordenadaGeo obterCordenadaEndereco() {
        CoordenadaGeo wCordenada = null;
        String end = enderecoFormatado().replaceAll(" ", "%20");
        String endereco = "http://www.mapquestapi.com/geocoding/v1/address?key=" + this.key_api + "&inFormat=kvp&outFormat=json&location=" + end + "&thumbMaps=false&maxResults=1";

        try {
            URL url = new URL(endereco);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();

            String r = content.toString();

            JsonParser jsonParser = new JsonParser();
            JsonObject objectFromString = jsonParser.parse(r).getAsJsonObject();
            JsonElement results = objectFromString.get("results");

            JsonArray JA = results.getAsJsonArray();
            results = JA.get(0);

            objectFromString = jsonParser.parse(results.toString()).getAsJsonObject();
            results = objectFromString.get("locations");
            JA = results.getAsJsonArray();
            results = JA.get(0);

            objectFromString = jsonParser.parse(results.toString()).getAsJsonObject();
            results = objectFromString.get("latLng");

            objectFromString = jsonParser.parse(results.toString()).getAsJsonObject();
            
            wCordenada = new CoordenadaGeo(objectFromString.get("lat").toString(), objectFromString.get("lng").toString());
        } catch (Exception e) {
            Logger.getLogger(CoordenadaGeo.class.getName()).log(Level.SEVERE, null, e);
        }

        return wCordenada;
    }
}
