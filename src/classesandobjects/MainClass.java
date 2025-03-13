package classesandobjects;


public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello everyone, welcome to Spring1 class");

        // creating object of class student
        Student student1 = new Student();
        System.out.println("student1 is : "+student1);

        // assigning values
        student1.id=101;
        student1.name="Ajay Kumar";
        student1.age=13;
        student1.grade="7th class";
        student1.email="ajay123@gmail.com";

        System.out.println("student1 after assigning the values : "+student1);

        int abc=100;
        final int pqr=300;

        System.out.println("abc is : "+abc);
        System.out.println("pqr is : "+pqr);

        abc=30000;

        // pqr=90000; - cannot change as it is final variable

        student1.demo();
        System.out.println("xyz is : "+student1.xyz);

        Student.demo2();
        System.out.println("mno is : "+Student.mno);



    }
}
