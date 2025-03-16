package interfaceexample;

public class SampleClass implements  SampleInterface2, SampleInterface{
    @Override
    public void demo() {
        System.out.println("demo abstarct interface method implemented in SampleClass");
        System.out.println("abc interface value is : "+SampleInterface.abc);
    }

    @Override
    public void demo2() {
        //SampleInterface.abc=400; final cannot be changed
        System.out.println("demo2 abstarct interface method implemented in SampleClass");
        System.out.println("abc interface value is : "+SampleInterface.xyz);
    }



    @Override
    public void demo3() {
        System.out.println("demo3 abstarct interface method implemented in SampleClass");
    }

    @Override
    public void demo4() {

    }
}
