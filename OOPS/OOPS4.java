//types of constructors
public class OOPS4 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("shradha");
        Student s3 = new Student(123);
    }
}

class Student {
    String name;
    int roll;
//Non-parameterized constructor:
    Student(){
        System.out.println("constructor is called");
    }
//parameterized constructor:
    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }
}