
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        HashMap<String, String> peopleHashMap = new HashMap<>();
        peopleHashMap.put("matthew", "matt");
        peopleHashMap.put("michael", "mix");
        peopleHashMap.put("arthur", "artie");
        System.out.println(peopleHashMap.get("matthew"));
    }

}
