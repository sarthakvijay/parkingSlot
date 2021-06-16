import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class FareController {
    private Map<Vehicle, ParkingDetails> vehicleParkingDetails = new HashMap<>();

    void onEntryDetails(Vehicle v, Parking p) {
        vehicleParkingDetails.put(v, new ParkingDetails(v, p, new Date(), null));
    }

    void onExit(Vehicle v){
        ParkingDetails pd = vehicleParkingDetails.get(v);
        pd.exitTime = new Date();
    }

    long getFare(Vehicle v){
        ParkingDetails pd = vehicleParkingDetails.get(v);
        return getFare(pd, pd.entryTime, pd.exitTime);
    }

    long getFare(ParkingDetails pd, Date entryTime, Date exitTime){
        long totalFare = 0;
        totalFare += 1.1*(exitTime.getTime()) - entryTime.getTime();
        totalFare += totalFare/pd.parking.getFloor().size();
        VehicleType vt = pd.vehicle.getType();
        if(vt == VehicleType.BIKE || vt == VehicleType.COMPACT){
            totalFare *= 2;
        } else if(vt == VehicleType.SEDAN){
            totalFare *= 4;
        } else {
            totalFare *= 6;
        }
        System.out.println(totalFare);
        return totalFare;
    }
}
