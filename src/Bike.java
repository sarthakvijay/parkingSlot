import java.util.Objects;

public class Bike implements Vehicle{
    private String bikeNumber;

    public Bike(String bikeNumber) {
        this.bikeNumber = bikeNumber;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "bikeNumber='" + bikeNumber + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bike bike = (Bike) o;
        return Objects.equals(bikeNumber, bike.bikeNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bikeNumber);
    }

    @Override
    public VehicleType getType() {
        return VehicleType.BIKE;
    }
}
