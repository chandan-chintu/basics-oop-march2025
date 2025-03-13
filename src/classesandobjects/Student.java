package classesandobjects;

public class Student {

    public int id;
    public String name;
    public int age;
    public String email;
    public String grade;

    int xyz=800; // non-static varibale
    static int mno=900; // static variable

    public void demo(){
        System.out.println("non static demo method");
        demo2();
        mno=1000; // we can use static methods or variables inside non-static block
    }

    public static  void demo2(){
        System.out.println(" static demo method");
        //xyz=700;
        //demo();  we cannot use non-static variables or methods inside static block
    }


    // toString - converts the object into string

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name=" + name +
                ", age=" + age +
                ", email=" + email +
                ", grade=" + grade  +
                '}';
    }
}
