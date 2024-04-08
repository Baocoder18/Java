abstract class Shape {
    abstract void draw();
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Ve hinh chu nhat");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Ve hinh tron");
    }
}
class TestAbstraction{
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}
