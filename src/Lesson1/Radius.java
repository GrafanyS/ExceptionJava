package Lesson1;

public class Radius {
    int r;
    static int count = 0;

    public Radius(int r) throws ExceptionRadius {
        if (r < 0) throw new ExceptionRadius(r);
        this.r = r;
        count++;
    }

    public static int getCount() {
        return count;
    }
}
