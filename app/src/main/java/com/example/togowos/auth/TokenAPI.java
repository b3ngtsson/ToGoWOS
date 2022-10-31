package com.example.togowos.auth;

import com.example.togowos.Utils.Utility;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

public class TokenAPI {
    private final URL uri = new URL("https://api.vasttrafik.se/token");

    private vtAuthenticter vtA = new vtAuthenticter();

    public TokenAPI() throws MalformedURLException {
        //add error handler, log ;)
    }

    public String getAccessToken(String scope) throws IOException {
        // Open up a connection
        try{
            HttpURLConnection con = (HttpURLConnection) uri.openConnection();

            // get auutorization:
            String auth = vtA.getUser() + ":" + vtA.getSecret();
            byte[] encodedAuth = Base64.getEncoder().encode(auth.getBytes(StandardCharsets.UTF_8));

            // compose request parameters
            Map<String, String> parameters = new HashMap<>();
            parameters.put("grant_type", "client_credentials");
            parameters.put("Content-Type", "application/json");

            String authHeaderValue = "Basic " + new String(encodedAuth);
            con.setRequestProperty("Authorization", authHeaderValue);

            con.setDoOutput(true);

            DataOutputStream out = new DataOutputStream(con.getOutputStream());
            out.writeBytes(ParameterStringBuilder.getParamsString(parameters));

            out.flush();
            out.close();

            int status = con.getResponseCode();

            if(con.getResponseCode() != 200){
                //log this
                con.getErrorStream();
                return null;
            }
            else{
                BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
                StringBuilder sb = new StringBuilder();
                String output;
                while((output = br.readLine()) != null){
                    sb.append(output);
                }
                JSONObject jsonObj = new JSONObject(sb.toString());
                HashMap<String, Object> test = new HashMap<>(Utility.jsonToMap(jsonObj)) ;
                return test.get("access_token").toString();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return "hello";
    }



}

