package example;

public class Main {
    public static void main(String[] args) {
        Camera c = new Camera();
        System.out.println(c.getBatteryPercent());

        c.takePhoto();
        c.takePhoto();
        c.takePhoto();
        c.takePhoto();

        System.out.println(c.getBatteryPercent());

        c.charging(20);

        System.out.println(c.getBatteryPercent());

        c.takePhoto();
        c.takePhoto();

        System.out.println(c.getBatteryPercent());

        c.charging(200);

        System.out.println(c.getBatteryPercent());
        c.charging(-20);

    }
}
