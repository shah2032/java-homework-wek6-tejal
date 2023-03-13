package javahomework;

/**
 * call instance ans static methods into the main method
 */
public class  InstanceStatic {

    int a = 20;
    static int b = 40;

    public static void main(String[] args) {
        InstanceStatic obj = new InstanceStatic();
        obj. myMethod1();
        myMethod();


    }

    public static void myMethod() {
        System.out.println(b);
    }

    public void myMethod1() {
        System.out.println(a);
    }


}