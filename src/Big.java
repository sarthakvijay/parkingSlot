public class Big implements Vehicle{

    private String BigNumber;

    public Big(String bigNumber) {
        BigNumber = bigNumber;
    }

    @Override
    public String toString() {
        return "Big{" +
                "BigNumber='" + BigNumber + '\'' +
                '}';
    }


    @Override
    public VehicleType getType() {
        return VehicleType.BIG;
    }
}
