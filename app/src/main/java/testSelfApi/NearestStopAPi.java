package testSelfApi;

import com.example.togowos.MainActivity;
import com.example.togowos.Utils.Utility;
import com.example.togowos.model.LocationList;
import com.example.togowos.model.StopLocation;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NearestStopAPi {
    private String uriString = "https://api.vasttrafik.se/bin/rest.exe/v2/location.nearbystops?";

    private Double lat,lon;
    private int maxNo;
    public NearestStopAPi() throws MalformedURLException {
        // add error handler, log ;)
    }


    public LocationList getNearbyStopsID(Double lat, Double lon, int MaxNo, Void MaxDist, Void format, Void jsonCallback) throws IOException, JSONException {

        LocationList lList = new LocationList();
        uriString = uriString+"originCoordLat="+String.valueOf(lat)+"&originCoordLong="+String.valueOf(lon)+"&maxNo="+MaxNo;
        URL uri = new URL(uriString);
        HttpURLConnection con = (HttpURLConnection) uri.openConnection();

        // get authorization:
        String auth =  MainActivity.token.getAccessToken();
        // compose request parameters
        con.setRequestProperty("Authorization","Bearer "+auth);
        con.setRequestProperty("Accept", "*/*");
        con.setRequestProperty("User-Agent", "b3ngtsson");
        con.setRequestProperty("Connection", "keep-alive");
        con.setRequestProperty("Accept", "gzip,deflate,br");


        con.setRequestProperty("originCoordLat", String.valueOf(lat));
        con.setRequestProperty("originCoordLong", String.valueOf(lon));



        con.setRequestMethod("GET");
        con.connect();


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


            try {

                JSONObject json = XML.toJSONObject(sb.toString());

                String jsonString = json.toString(4);
                System.out.println(jsonString);

                Map<String, Object> test = new HashMap<>(Utility.jsonToMap(json)) ;

                Object p =  test.get("LocationList");
                Object c = ((HashMap) p).get("StopLocation");

                ((ArrayList) c).forEach((Object last) ->{
                    StopLocation stoplocation = new StopLocation();
                    stoplocation.id(((HashMap)last).get("id").toString());
                    stoplocation.name(((HashMap)last).get("name").toString());
                    lList.addStopLocationItem(stoplocation);
                } );


            } catch (Exception e) {
                System.out.print("dawg");
            }

            return lList;
        }
    }
}


