package com.tabachenko.task6;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.*;

public class Inet {
    public static void main(String[] args) throws IOException {

        URL url = new URL("http://www.google.com");
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        System.out.println(httpURLConnection.getRequestMethod());
        System.out.println(httpURLConnection.getURL());
        System.out.println(httpURLConnection.getResponseMessage());
        System.out.println(httpURLConnection.getResponseCode());




    }
}
