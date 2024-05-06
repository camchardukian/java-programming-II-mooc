import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> translations;

    public DictionaryOfManyTranslations() {
        translations = new HashMap<>();
    }

    public void add(String word, String translation) {
        if (translations.get(word) == null) {
            translations.put(word, new ArrayList<>());
        }
        translations.get(word).add(translation);
    }

    public ArrayList<String> translate(String word) {
        if (translations.get(word) == null) {
            return new ArrayList<>();
        }
        return translations.get(word);
    }

    public void remove(String word) {
        translations.remove(word);
    }
}
