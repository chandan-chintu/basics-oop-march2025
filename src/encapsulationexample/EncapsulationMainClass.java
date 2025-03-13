package encapsulationexample;



public class EncapsulationMainClass {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();

        // assign the value to teacher object
        teacher.setId(123);
        teacher.setName("Vinod");
        teacher.setEmail("vinod123@gmail.com");
        teacher.setMobile("+919888765432");
        teacher.setGender("male");
        teacher.setQualification("Msc");

        System.out.println("teacher is : "+teacher);

        // gets/reads the data
        System.out.println("teacher name is : "+teacher.getName());
        System.out.println("teacher email is : "+teacher.getEmail());
        System.out.println("teacher mobile is : "+teacher.getMobile());

//        Demo demo = new Demo();
//        demo.setAbc(222);
//        demo.setXyz("demo");
//
//        System.out.println("demo abc is : "+demo.getAbc());
//        System.out.println("demo xyz is : "+demo.getXyz());

        Sample sample = new Sample();
        sample.setAbc(666);
        sample.setXyz("sample");

        System.out.println("sample abc is:"+sample.getAbc());
        System.out.println("sample xyz is : "+sample.getXyz());

        Demo demo1 = new Demo();


    }
}
