import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class QAQ {

    public static ArrayList<String> alist = new ArrayList<>();
    public static void main(String[] args) {


        JSONObject jsonObject=new JSONObject();

        JSONArray jsonArr=new JSONArray();

        jsonObject.put("name", "85596");//依次一個
        jsonObject.put("koy", "85596");
        jsonObject.put("金色狂風", "暗魔陰帝");
        jsonObject.put("yok", "xxxxx");
        jsonObject.put("yko", "85596");
        alist.add(jsonObject.toString());
        alist.add("OOO" );
        System.out.println(jsonObject);
        System.out.println(jsonObject.get("金色狂風"));
        System.out.println(YAY.getJSON("210.63.221.235").get("city"));
        System.out.println(alist);



    }
}
