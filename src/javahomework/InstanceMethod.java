package javahomework;
/**
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */


public class InstanceMethod {
    int a = 10;
    int b = 6;

    public static void main(String[] args) {
      InstanceMethod a = new InstanceMethod();
      a.myMethod();

    }
    public void myMethod(){
        System.out.println(a);
        System.out.println(b);
    }
}