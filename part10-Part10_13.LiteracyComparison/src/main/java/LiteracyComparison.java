
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LiteracyComparison {

    public static void main(String[] args) {
        List<LiteracyRecord> records = new ArrayList<>();
        try {
            records = Files.lines(Paths.get("literacy.csv")).map(line -> {
                String[] parts = line.split(",");
                String name = parts[0];
                String ageGroup = parts[1];
                String gender = parts[2].replaceAll("\\([^\\)]+\\)", "").trim();
                String country = parts[3];
                String year = parts[4];
                double literacyRate = Double.valueOf(parts[5]);
                return new LiteracyRecord(name, ageGroup, gender, country, year, literacyRate);
            }).collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        records.sort((r1, r2) -> Double.compare(r1.getLiteracyRate(), r2.getLiteracyRate()));
        records.forEach(System.out::println);
    }

}
