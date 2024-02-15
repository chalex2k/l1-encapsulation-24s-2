package example;

public class Main {
    public static void main(String[] args) {
        Camera c = new Camera();
        System.out.println(c.getBatteryPercent());
        c.charging(25);
        System.out.println(c.getBatteryPercent());

        c.takePhoto();
        System.out.println(c.getBatteryPercent());
        c.takePhoto();
        c.takePhoto();
        System.out.println(c.getBatteryPercent());
        System.out.println("-------------");
        c.charging(120);
        System.out.println(c.getBatteryPercent());
        c.takePhoto();

        c.charging(-1);
    }
}
