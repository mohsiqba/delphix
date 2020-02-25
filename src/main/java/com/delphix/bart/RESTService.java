package com.delphix.bart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class RESTService {

    public static String execute() {
        StringBuilder builder = null;
        HttpURLConnection conn = null;
        try {
            String queryParams = Utils.buildQuery();
            URL url = new URL(Properties.BASE_URL + queryParams);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod(Properties.HTTP_METHOD_GET);
            if (conn.getResponseCode() != 200) {
                throw new RESTException(conn.getResponseMessage(), conn.getResponseCode(), "Failed : HTTP error code : " + conn.getResponseCode());
            }
            builder = new StringBuilder();
            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
            String output;
            while ((output = br.readLine()) != null) {
                builder.append(output);
            }
        } catch (ProtocolException e) {
            e.printStackTrace();
            throw e;
        } catch (MalformedURLException e) {
            e.printStackTrace();
            throw e;
        } catch (RESTException e) {
            e.printStackTrace();
            throw e;
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (conn != null) {
                conn.disconnect();
            }
            return builder != null ? builder.toString() : null;
        }
    }
}
