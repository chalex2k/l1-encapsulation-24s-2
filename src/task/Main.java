package task;

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();

        System.out.println(warrior.getHp()); // 100
        warrior.damage(20);
        System.out.println(warrior.getHp()); // == 80;
        warrior.fix(5);
        System.out.println( warrior.getHp()); // == 85;
        System.out.println( warrior.isAlive()); // true
        warrior.damage(150);
        System.out.println( warrior.isAlive()); // false
        System.out.println(warrior.getHp()) // 0;
    }
}
