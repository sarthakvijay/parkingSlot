import java.util.List;

public class Floor {
    private String floorId;
    private String floorNo;
    private String floorName;
    private List<ParkingSlot> parkingSlots;

    public Floor(String floorId, String floorNo, String floorName, List<ParkingSlot> parkingSlots) {
        this.floorId = floorId;
        this.floorNo = floorNo;
        this.floorName = floorName;
        this.parkingSlots = parkingSlots;
    }

    public String getFloorId() {
        return floorId;
    }

    public String getFloorNo() {
        return floorNo;
    }

    public String getFloorName() {
        return floorName;
    }

    public List<ParkingSlot> getParkingSlots() {
        return parkingSlots;
    }

    public void emptyFloor(){
        this.parkingSlots.stream().forEach(e -> {
            e.EmptySlot();
        });
    }
}
