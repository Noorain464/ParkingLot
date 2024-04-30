package models;

import java.util.List;

public class ParkingFloor extends BaseModel {
    private int Floornumber;
    private List<ParkingSpot> parkingSpots;
    private ParkingFloorStatus parkingFloorStatus;

    public int getFloornumber() {
        return Floornumber;
    }

    public void setFloornumber(int floornumber) {
        Floornumber = floornumber;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public ParkingFloorStatus getParkingFloorStatus() {
        return parkingFloorStatus;
    }

    public void setParkingFloorStatus(ParkingFloorStatus parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }
}
