import java.util.List;

public class Parking {
    private String parkingName;
    private List<Floor> floor;
    private String parkingId;
    private String parkingAddress;

    public String getParkingName() {
        return parkingName;
    }

    public List<Floor> getFloor() {
        return floor;
    }

    public String getParkingId() {
        return parkingId;
    }

    public String getParkingAddress() {
        return parkingAddress;
    }

    public Parking(String parkingName, List<Floor> floor, String parkingId, String parkingAddress) {
        this.parkingName = parkingName;
        this.floor = floor;
        this.parkingId = parkingId;
        this.parkingAddress = parkingAddress;
    }

    public void emptyParking(){
        this.floor.stream().forEach(e -> {
            e.emptyFloor();
        });
    }
}
