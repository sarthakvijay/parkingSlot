public class ParkingSlot {

    private String slotNo;
    private String slotId;
    private ParkingStatus status;
    private Vehicle vehicle;
    private SlotSize slotSize;

    public ParkingSlot(String slotNo, String slotId, ParkingStatus status, SlotSize slotSize) {
        this.slotNo = slotNo;
        this.slotId = slotId;
        this.status = status;
        this.slotSize = slotSize;
    }

    public void ParkVehicle(Vehicle v) throws Exception {
        if(this.slotSize.canVehicleBeParked(v)){
            this.vehicle = v;
            this.status = ParkingStatus.OCCUPIED;
        } else {
            throw new IllegalArgumentException("no slot available");
        }
    }

    public void EmptySlot(){
        this.status = ParkingStatus.EMPTY;
    }
}
