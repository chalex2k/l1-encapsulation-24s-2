package example;

public class Camera {
    private final int ONE_PHOTO_POWER = 10;
    private int batteryPercent;

    public int getBatteryPercent(){
        return this.batteryPercent;
    }

    public void charging(int addingPercent) {
        if (addingPercent < 0) {
            throw new RuntimeException();
        }
        if (this.batteryPercent + addingPercent > 100) {
            this.batteryPercent = 100;
        } else {
            this.batteryPercent += addingPercent;
        }
    }
    public void takePhoto() {
        if (this.batteryPercent > ONE_PHOTO_POWER) {
            System.out.println("NEW PHOTO!");
            this.batteryPercent -= ONE_PHOTO_POWER;
        } else {
            System.out.println("low battery!!!");
        }
    }
}
