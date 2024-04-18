package GiaoDien;
interface Printable{
    void print();   
}
interface Showable extends Printable{
    void show();
}
public class TestInterface implements Showable{
    public void print(){
        System.out.println("Hello friend");
    }
    public void show(){
        System.out.println("Welcome to my program");
    }
    public static void main(String[] args) {
        TestInterface obj = new TestInterface();
        obj.print();
        obj.show();
    }
}
