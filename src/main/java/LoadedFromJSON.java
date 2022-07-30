import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class LoadedFromJSON<E> {
    private String fileName;
    private Class myClass;

    public LoadedFromJSON(String fileName, Class type) {
        this.fileName = fileName;
        this.myClass = type;
    }

    private E listFromJSON(String jsonString) {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        return (E) gson.fromJson(jsonString, myClass);
    }

    public List<E> loadFromJSON() {
        try {
            List<E> objectList = new ArrayList<>();
            FileReader fr = new FileReader(fileName);
            JSONParser parser = new JSONParser();
            JSONArray objects = (JSONArray) parser.parse(fr);
            for (Object obj : objects) {
                E element = listFromJSON(obj.toString());
                objectList.add(element);
            }
            return objectList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}
