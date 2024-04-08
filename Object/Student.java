package Object;

public class Student {
    private String id;
    String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;   
    }
    public Student(String id) {
        this.id = id;
    }
    public boolean equals(Object obj){
        if(obj instanceof Student){
            Student another = (Student) obj;
            if(this.id.equals(another.id)){
                return true;
            }
        }   
        return false;
    }
    public static void main(String[] args) {
        Student student1 = new Student("123");
        Student student2 = new Student("234");
        Student student3 = new Student("456");

        System.out.println("student1 == student2: " + (student1 == student2));
        System.out.println("student2.equals(student3): " + (student2.equals(student3)));
    }
}
