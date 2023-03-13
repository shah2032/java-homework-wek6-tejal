package javahomework;

/**
 * write program to swap two variables
 */
public class SwapTwoVariables {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        System.out.println("Before swapping : " +  num1  +   "  and  "   +  num2);
        myMethod(num1 ,num2);


    }
    public static void  myMethod(int num1, int num2){
          int  a = num1;
           num1 = num2;
           num2 = a;
        System.out.println("After swapping :" +  num1  + "  and   "      +  num2  );



    }
}
