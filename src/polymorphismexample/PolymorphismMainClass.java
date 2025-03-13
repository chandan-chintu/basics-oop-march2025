package polymorphismexample;

import encapsulationexample.Sample;

public class PolymorphismMainClass {
    public static void main(String[] args) {

        SampleClass sampleClass = new SampleClass();
        sampleClass.sum(12,23);
        sampleClass.sum(3,4,23);
        sampleClass.sum(3.45,87.99);
        sampleClass.sum(45.33,23);
        sampleClass.sum(5.88f,7.77f);
    }
}
