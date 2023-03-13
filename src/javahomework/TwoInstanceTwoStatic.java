package javahomework;

/**
 * two instance and two static
 */
public class TwoInstanceTwoStatic {
    int a = 10;
    int b = 5;
    static  int d = 14;
    static int e = 12;

    public static void main(String[] args) {
        TwoInstanceTwoStatic obj = new TwoInstanceTwoStatic();
        obj . MyMethod();
        MyMethod1();
    }


    public void MyMethod(){

        System.out.println(a);
        System.out.println(b);

    }
    public static void  MyMethod1(){
        System.out.println(d);
        System.out.println(e);
    }



}
