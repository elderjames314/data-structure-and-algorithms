package parkinglot;

/**
 * @author jamesoladimeji
 * @created 16/01/2022 - 8:13 AM
 * @project IntelliJ IDEA
 */
public class Vehicle {
    private int vehicleNumber;
    private String vehicleColor;
    private VehicleType vehicleType;
    private ParkingSpot parkingSpot;


    public Vehicle(int vehicleNumber, String vehicleColor, VehicleType vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleColor = vehicleColor;
        this.vehicleType = vehicleType;
    }

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }
}
