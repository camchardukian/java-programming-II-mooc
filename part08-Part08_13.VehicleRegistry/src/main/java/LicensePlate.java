
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    public int hashCode() {
        int result = 11;
        int primeMultiplier = 17;
        return result * primeMultiplier * this.liNumber.hashCode();
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        } else if (object instanceof LicensePlate == false) {
            return false;
        }
        LicensePlate otherLicensePlate = (LicensePlate) object;
        if (this.country == otherLicensePlate.country && this.liNumber == otherLicensePlate.liNumber) {
            return true;
        }
        return false;
    }

}
