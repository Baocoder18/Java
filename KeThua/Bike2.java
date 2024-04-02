package KeThua;
abstract class Bike2 {
    abstract void run();
}
class Honda2 extends Bike2{
    void run(){
        System.out.println("running safely...");
    }
    public static void main(String[] args) {
        Bike2 obj = new Honda2();
        obj.run();
    }
}
