package KeThua;
class Bike {
    int speedLimit = 90;
}
class Honda extends Bike{
    int speedLimit = 150;
    public static void main(String[] args) {
        Honda obj = new Honda();
        System.out.println(obj.speedLimit);
        Bike obj2 = new Honda();
        System.out.println(obj2.speedLimit);
    }
}

