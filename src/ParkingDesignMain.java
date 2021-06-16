import java.util.*;

public class ParkingDesignMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the parking inputs: ");
        String parkingName = sc.nextLine();
        int t = sc.nextInt();
        sc.nextLine();
        List<Floor> floorList = new ArrayList<>();
        String parkingId = sc.nextLine();
        String parkingAdd = sc.nextLine();
        while(t-- > 0) {
            System.out.println("Enter the floor inputs: ");
            String fid = sc.nextLine();
            String fno = String.valueOf(t);
            String fnm = sc.nextLine();
            List<ParkingSlot> list = new ArrayList<>();
            int s = sc.nextInt();
            sc.nextLine();
            while (s-- > 0) {
                System.out.println("Enter the Slots inputs: ");
                String id = sc.nextLine();
                String no = sc.nextLine();
                SlotSize ss;
                String tt = sc.nextLine();
                if (tt.equals("small")) {
                    ss = SlotSize.SMALL;
                } else if (tt.equals("medium")) {
                    ss = SlotSize.MEDIUM;
                } else {
                    ss = SlotSize.LARGE;
                }
                ParkingSlot p = new ParkingSlot(id, no, ParkingStatus.EMPTY, ss);
                list.add(p);
            }
            floorList.add(new Floor(fid, fno, fnm, list));
        }
        Parking prk = new Parking(parkingName, floorList, parkingId, parkingAdd);

        Vehicle v1 = new Bike("0001");
        FareController fc = new FareController();
        fc.onEntryDetails(v1, prk);
        fc.onExit(v1);
        fc.getFare(v1);
    }
}
