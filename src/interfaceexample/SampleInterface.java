package interfaceexample;

public interface SampleInterface {

        // in interface all the varibales are public static final
        public int abc = 100; // internally it converts to public final int abc=100;
        public static final int xyz = 200; // both are final here - by default all the variables are final in interface

        public void demo();
        public abstract void demo2(); // all the methods inside interface are abstract by default
        public void demo4();
}
