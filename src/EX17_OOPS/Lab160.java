package EX17_OOPS;

public class Lab160 {
    public static void main(String[] args) {
        Student s1 = new Student();
        //1. Student - Class Loading
        //2. s1 - Object Ref.
        //3. new Student() -> Object creation
        s1.name="sai";
        System.out.println(s1.name);

    }
}

class Student {
    String name;
    int roll;

}