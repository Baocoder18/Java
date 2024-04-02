package Object;

public class Student2{
    int id;
    String name;
    String city;
    public Student2(int id, String name, String city){
        this.id = id;
        this.name = name;
        this.city = city;
    }
    public String toString(){
        return id + " " + name + " " + city;
    }
    public static void main(String[] args) {
        Student2 s1 = new Student2(123, "Bao", "Hanoi");
        Student2 s2 = new Student2(234, "Coder", "Hanoi");
        Student2 s3 = new Student2(456, "Trung", "Hanoi");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
