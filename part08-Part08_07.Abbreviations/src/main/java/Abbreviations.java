import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbreviationHashMap;

    public Abbreviations() {
        abbreviationHashMap = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviationHashMap.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        if (abbreviationHashMap.get(abbreviation) != null) {
            return true;
        }
        return false;
    }

    public String findExplanationFor(String abbreviation) {
        return abbreviationHashMap.get(abbreviation);
    }
}
