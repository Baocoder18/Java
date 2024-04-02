package KeThua;
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
class ICICI extends Bank{
    int getRateOfInterest(){
        return 7;
    }
}
class AXIS extends Bank{
    int getRateOfInterest(){
        return 9;
    }
}
public class Test3 {
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println(b.getRateOfInterest());
        b = new ICICI();
        System.out.println(b.getRateOfInterest());
        b = new AXIS();
        System.out.println(b.getRateOfInterest());
    }
}
