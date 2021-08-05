package main.java.lesson6;

import com.sun.deploy.net.BasicHttpRequest;
import com.sun.deploy.net.HttpRequest;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://dataservice.accuweather.com/forecasts/v1/daily/5day/295212?apikey=Wa7nWgbZceLLb5MA4UoeZTErPtyk6tgA&language=ru-ru%20HTTP/1.1");
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod("GET");
        try(BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(httpURLConnection.getInputStream()))){
            String temp  = bufferedReader.readLine();
            System.out.println(temp);
        }
    }
}
