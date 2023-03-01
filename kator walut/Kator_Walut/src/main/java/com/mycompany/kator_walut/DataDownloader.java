package com.mycompany.kator_walut;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

public class DataDownloader {
    private HttpClient client = HttpClient.newHttpClient();
    
    public double getSellOf(String currencyShortName) {
        CurrencyValue currencyValue = downloadCurrencyData(currencyShortName);
    }
    
    public double getBuyOf(String currencyShortName) {
        CurrencyValue currencyValue = downloadCurrencyData(currencyShortName);
        
    }
    
    private CurrencyValue downloadCurrencyData(String currencyShortName) {
        HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create("https://api.nbp.pl/api/exchangerates/rates/c/" + currencyShortName + "/today/?format=json"))
        .build();
        
        double sell = 0, buy = 0;
        CurrencyValue currencyValue = new CurrencyValue("", "", 0, 0);
        try {
            HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
            JSONObject jsonObject = new JSONObject(response.body().toString());
            
            JSONArray rates = jsonObject.getJSONArray("rates");
            buy = rates.getDouble(2);
            sell = rates.getDouble(3);
            currencyValue = new CurrencyValue(jsonObject.getString("currency"), currencyShortName, sell, buy);
        } catch (IOException ex) {
            System.out.println(ex);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        
        return currencyValue;
    }
}
