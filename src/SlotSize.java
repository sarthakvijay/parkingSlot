
import static java.util.Arrays.asList;

import java.util.Arrays;
import java.util.List;

public enum SlotSize {

    SMALL(Arrays.asList(VehicleType.BIKE, VehicleType.COMPACT)),
    MEDIUM(Arrays.asList(VehicleType.BIKE, VehicleType.COMPACT, VehicleType.SEDAN)),
    LARGE(Arrays.asList(VehicleType.BIKE, VehicleType.COMPACT, VehicleType.SEDAN, VehicleType.BIG));

    private final List<VehicleType> vehicleTypeList;

    SlotSize(List<VehicleType> vehicleTypeList) {
        this.vehicleTypeList = vehicleTypeList;
    }

    public boolean canVehicleBeParked(Vehicle v){
        if(this.vehicleTypeList.contains(v.getType())){
            return true;
        }
        return false;
    }
}
