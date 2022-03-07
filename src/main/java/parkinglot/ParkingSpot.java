package parkinglot;

/**
 * @author jamesoladimeji
 * @created 16/01/2022 - 8:13 AM
 * @project IntelliJ IDEA
 */
public class ParkingSpot {

    private ParkingSpotType parkingSpotType;
    private Vehicle vehicle;
    private boolean free;


    public ParkingSpot(ParkingSpotType parkingSpotType) {
        this.parkingSpotType = parkingSpotType;
    }

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }

    public void setParkingSpotType(ParkingSpotType parkingSpotType) {
        this.parkingSpotType = parkingSpotType;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }
}
