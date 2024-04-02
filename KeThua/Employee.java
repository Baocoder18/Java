package KeThua;
public class Employee extends Person {
    private double luong;
    public Employee(){
        super();
    }    
    public Employee(String ten, String diaChi, int tuoi, double luong) {
        super();
        this.luong = luong;
    }
    public void input(){    
        super.input();
        sc.nextLine();
        System.out.println("Nhap luong: ");
        this.luong = sc.nextDouble();
    }
    public void output(){
        super.output();
        System.out.println("Luong: " + this.luong);
    }
    public static void main(String[] args) {
        Employee e = new Employee();
        e.input();
        e.output();
    }
}
