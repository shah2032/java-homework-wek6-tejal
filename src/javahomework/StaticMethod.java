package javahomework;

/**
 * Static Method
 */
public class StaticMethod {
    static int a = 12;
    static int b = 10;

    public static void main(String[] args) {
        myMethod();
    }
    public static void myMethod(){
        System.out.println(a);
        System.out.println(b);
    }
}
