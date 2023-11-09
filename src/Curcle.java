public class Curcle {
    public static final float PI = 3.14159F;
    private float radius;
    private float area;

    public Curcle() {
    }

    public Curcle(float radius) {
        this.radius = radius;
        this.area = calculateArea();
    }
    private float calculateArea() {
        return PI * radius * radius;
    }
    public static float calculateCircumference(float radius) {
        return 2 * PI * radius;
    }
    public float getRadius() {
        return radius;
    }
    public float getArea() {
        return area;
    }
}