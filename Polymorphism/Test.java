package Polymorphism;

class Bank{
    int getRateOfInterest(){
        return 0;
    }
}
class SBI extends Bank{
    int getRateOfInterest(){
        return 8;
    }
}
class ICIC extends Bank{
    int getRateOfInterest(){
        return 7;
    }
}
class AXIS extends Bank{
    int getRateOfInterest(){
        return 9;
    }
}
public class Test {
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println("SBI Rate Of Interest: " + b.getRateOfInterest());
        b = new ICIC();
        System.out.println("ICIC Rate Of Interest: " + b.getRateOfInterest());
        b = new AXIS();
        System.out.println("AXIS Rate Of Interest: " + b.getRateOfInterest());
    }
}
