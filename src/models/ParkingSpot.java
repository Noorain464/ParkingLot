package models;

import java.util.List;

public class ParkingSpot extends BaseModel{
    private int spotnumber;
    private List<VehicleType> vehicleTypes;
    private ParkingFloor parkingFloor;

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    public List<VehicleType> getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(List<VehicleType> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }

    public int getSpotnumber() {
        return spotnumber;
    }

    public void setSpotnumber(int spotnumber) {
        this.spotnumber = spotnumber;
    }

    private ParkingSpotStatus parkingSpotStatus;
}
