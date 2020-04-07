package com.nextwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Tester {
    public static void main(String[] args) {
        try {
            URL url=new URL("");
            HttpURLConnection connection=(HttpURLConnection)url.openConnection();
            InputStream is=connection.getInputStream();
            BufferedReader in=new BufferedReader(new InputStreamReader(is));
            String line=in.readLine();
            StringBuffer json=new StringBuffer();
            while (line !=null){
              //  System.out.println(line);
                json.append(line);
                line=in.readLine();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
