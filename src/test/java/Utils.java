import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;


public class Utils {
    public static JSONObject readJSONList(String file, int index) throws IOException, ParseException {
        JSONParser parser=new JSONParser();
        JSONArray jsonArray= (JSONArray) parser.parse(new FileReader(file));
        JSONObject jsonObject= (JSONObject) jsonArray.get(index);
        return jsonObject;
    }


}
