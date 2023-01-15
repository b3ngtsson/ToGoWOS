package testSelfApi;

import com.example.togowos.MainActivity;
import com.example.togowos.Utils.Utility;
import com.example.togowos.model.Departure;
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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DepartueBoardsApi {

    // the code

    private String uriString = "https://api.vasttrafik.se/bin/rest.exe/v2/departureBoard?";

    private LocalDateTime localdatetime;
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd:HH:MM");

    public DepartueBoardsApi() throws MalformedURLException {
        // add error handler, log ;)
    }


    public ArrayList<ArrayList<Departure>>  getDepartureBoards(LocationList locationlistinc) throws IOException, JSONException {

        ArrayList<ArrayList<Departure>> departureList = new ArrayList<ArrayList<Departure>> ();

        // Loop through all of the items in locationList
        localdatetime = LocalDateTime.now();
        String dftdate = dtf.format(localdatetime);
        String[] date = dftdate.replace("/", "-").split(":");

        String auth = MainActivity.token.getAccessToken();


        List<StopLocation> locationList = locationlistinc.getStopLocation();
        for (StopLocation stoplocation : locationList) {

            uriString = uriString + "id=" + stoplocation.getId() + "&date=" + String.valueOf(date[0]) + "&time="+String.valueOf(date[1]+":"+date[2]);
            URL uri = new URL(uriString);
            HttpURLConnection con = (HttpURLConnection) uri.openConnection();

            // get authorization:
            // compose request parameters
            con.setRequestProperty("Authorization", "Bearer " + auth);
            con.setRequestProperty("Accept", "*/*");
            con.setRequestProperty("User-Agent", "b3ngtsson");
            con.setRequestProperty("Connection", "keep-alive");
            con.setRequestProperty("Accept", "gzip,deflate,br");
            con.setRequestProperty("useVas", "0");
            con.setRequestProperty("useLDTrain", "0");
            con.setRequestProperty("useRegTrain", "0");

            con.setRequestMethod("GET");
            con.connect();


            if (con.getResponseCode() != 200) {
                //log this
                con.getErrorStream();
                return null;
            } else {
                BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
                StringBuilder sb = new StringBuilder();
                String output;
                while ((output = br.readLine()) != null) {
                    sb.append(output);
                }


                try {

                    JSONObject json = XML.toJSONObject(sb.toString());

                    String jsonString = json.toString(4);
                    System.out.println(jsonString);

                    Map<String, Object> test = new HashMap<>(Utility.jsonToMap(json));

                    Object p = test.get("DepartureBoard");
                    Object c = ((HashMap) p).get("Departure");

                    ArrayList<Departure> alist = new ArrayList<>();
                    ((ArrayList) c).forEach((Object last) ->{
                        Departure departure = new Departure();
                        departure.fgColor(((HashMap)last).get("fgColor").toString());
                        departure.bgColor(((HashMap)last).get("bgColor").toString());
                        departure.direction(((HashMap)last).get("direction").toString());
                        departure.name(((HashMap)last).get("name").toString());
                        departure.sname(((HashMap)last).get("sname").toString());
                        departure.time(((HashMap)last).get("time").toString());
                        departure.stop(((HashMap)last).get("stop").toString());
                        alist.add(departure);

                    } );
                    if(alist.size() >0){
                        departureList.add(alist);
                    }

                } catch (Exception e) {
                    System.out.print("dawg");
                }


            }

        }
        return departureList;

    }
}
