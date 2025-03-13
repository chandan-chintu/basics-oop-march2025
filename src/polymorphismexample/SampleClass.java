package polymorphismexample;

public class SampleClass {

    public void sum(int a, int b){
        System.out.println("sum of two integer number is : "+(a+b));
    }

    public void sum(int a, int b, int c){
        System.out.println("sum of three integer number is : "+(a+b+c));
    }

    public void sum(float a, float b){
        System.out.println("sum of two float number is : "+(a+b));
    }

    public void sum(double a, double b){
        System.out.println("sum of two double number is : "+(a+b));
    }

    public void sum(double a, int b){
        System.out.println("sum of one integer and one double number is : "+(a+b));
    }
}
