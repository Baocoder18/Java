package KeThua;
public class Test {
    public static void main(String[] args) {    
        Human human = new Human("Rick", 20, 60);
        Human human2 = new Human("Bob", 25, 55);
        System.out.println(human.name);
        System.out.println(human2.name);
        human.eat();
    }
}
