package Lesson1;

public class RadiusCount {
    public static void main(String[] args) {
        try {
            new Radius(1);
            new Radius(5);
            new Radius(4);
            new Radius(-1);
            new Radius(9);
        } catch (ExceptionRadius e) {
            System.out.println("Ошибка радиуса, не может быть отрицательный " + e.getRadius());
        }
        System.out.println("Количество положительных радиусов " + Radius.getCount());
    }

}

