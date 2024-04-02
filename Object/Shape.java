package Object;

public class Shape {
    public static void main(String[] args) {
        Shape sh = new Shape();
        System.out.println("Thong tin doi tuong: " + sh.getClass());
        System.out.println("Thong tin doi tuong: " + sh.getClass().getName());
        System.out.println("Thong tin doi tuong: " + sh.getClass().getSimpleName());
    }
}
