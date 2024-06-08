public class LiteracyRecord {
    private String name;
    private String ageGroup;
    private String gender;
    private String country;
    private String year;
    private double literacyRate;

    public LiteracyRecord(String name, String ageGroup, String gender, String country, String year,
            double literacyRate) {
        this.name = name;
        this.ageGroup = ageGroup;
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.literacyRate = literacyRate;
    }

    public String getName() {
        return name;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public String getGender() {
        return gender;
    }

    public String getCountry() {
        return country;
    }

    public String getYear() {
        return year;
    }

    public double getLiteracyRate() {
        return literacyRate;
    }

    @Override
    public String toString() {
        return getCountry() + " (" + getYear() + "), " + getGender() + ", " + getLiteracyRate();
    }
}
