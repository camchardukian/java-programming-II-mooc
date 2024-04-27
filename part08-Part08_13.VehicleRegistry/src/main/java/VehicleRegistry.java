import java.util.HashMap;
import java.util.HashSet;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> vehicles;

    public VehicleRegistry() {
        vehicles = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (vehicles.get(licensePlate) != null) {
            return false;
        }
        vehicles.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        return vehicles.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (get(licensePlate) != null) {
            vehicles.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate licencePlate : vehicles.keySet()) {
            System.out.println(licencePlate);
        }
    }

    public void printOwners() {
        HashSet<String> uniqueOwners = new HashSet<>(vehicles.values());
        for (String owner : uniqueOwners) {
            System.out.println(owner);
        }
    }
}
