import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by benaissa on 8/24/17.
 */
public class Main {
    public static void main(String [] args)
    {
        Map<String,String> map = new HashMap<>();
//        List<String> str =new ArrayList<>();
        map.put("California","Sacramento");
        map.put("Oregon","Salem");
        map.put("Washington","Olympia");
        System.out.println(map);

        map.put("Alaska","Juneau");
        System.out.println(map);

        String cap = map.get("Oregon");
        System.out.println("The capital of Oregon is: "+cap);

        map.remove("California");
        System.out.println(map);
    }
}
