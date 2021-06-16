public class Compact implements Vehicle{

    private String CompactNumber;

    public Compact(String compactNumber) {
        CompactNumber = compactNumber;
    }

    @Override
    public String toString() {
        return "Compact{" +
                "CompactNumber='" + CompactNumber + '\'' +
                '}';
    }


    @Override
    public VehicleType getType() {
        return VehicleType.COMPACT;
    }
}
