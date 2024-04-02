package KeThua;
public class Animal {
    void eat(){
        System.out.println("eating");
    }
    void drink(){
        System.out.println("drinking");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("eating bones");
    }
}
class BabyDog extends Animal{
    void drink(){
        System.out.println("drinking milk");
    }
    public static void main(String[] args) {
        Animal a1, a2, a3;
        a1 = new Animal();
        a1.eat();
        a2 = new Dog();
        a2.eat();
        a3 = new BabyDog();
        a3.drink();
    }
}
