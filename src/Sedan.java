public class Sedan implements Vehicle{

    private String SedanNumber;

    public Sedan(String sedanNumber) {
        SedanNumber = sedanNumber;
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "SedanNumber='" + SedanNumber + '\'' +
                '}';
    }


    @Override
    public VehicleType getType() {
        return VehicleType.SEDAN;
    }
}
