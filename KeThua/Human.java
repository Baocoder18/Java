package KeThua;
public class Human {
    String name;
    int age;
    double weight;

    Human(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;    
    }
    void eat(){
        System.out.println(this.name + " is eating");
    }
}
