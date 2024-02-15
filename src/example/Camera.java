package example;

import java.util.ArrayList;

public class Camera {
    private final int ONE_PHOTO_POWER = 30;
    private int batteryPercent;
    private ArrayList<String> photos;

    public Camera() {
        this.photos = new ArrayList<>();
        this.batteryPercent = 100;
    }

    public int getBatteryPercent() {
        return batteryPercent;
    }

    public void charging(int percent) {
        if (percent < 0){
            throw new RuntimeException();
        }
        if (this.batteryPercent + percent > 100){
            this.batteryPercent = 100;
        } else {
            this.batteryPercent += percent;
        }
    }

    public void takePhoto(){
        if (this.batteryPercent >= ONE_PHOTO_POWER) {
            System.out.println("NEW PHOTO!");
            this.batteryPercent -= ONE_PHOTO_POWER;
        } else {
            System.out.println("low battery power!");
        }
    }

}
