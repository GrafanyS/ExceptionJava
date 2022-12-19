package Lesson1;

public class ExceptionRadius extends Exception {
    int radius;
    public ExceptionRadius(){

    }
    public ExceptionRadius(int radius){
        this.radius = radius;

    }

    public ExceptionRadius(String s){
        System.out.println("Ошибка радиуса, не может быть отрицательный");

    }

    public int getRadius() {
        return radius;
    }
}
