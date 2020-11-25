import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;

public class YAY {

    public static JSONObject getJSON(String ip){
        try {
            URL url = new URL(String.valueOf("http://ip-api.com/json/" + ip.toString() + "?fields=status,continent,country,regionName,city,org,mobile,proxy"));
            return readJsonFromUrl(url.toString());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }


    public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            JSONObject json = new JSONObject(jsonText);
            return json;
        } finally {
            is.close();
        }
    }
}
