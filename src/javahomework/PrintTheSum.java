package javahomework;

/**
 * java program to print the sum,multiply,subtract,divide and reminder of two numbers

 */
public class PrintTheSum {
    public static void main(String[] args) {
        int a = 125;
        int b = 24;
        int sum = a+b;
        int subtract = a-b;
        int multiply = a*b;
        int divide = a/b;
        int reminder = a/b;

        System.out.println(a + "+" + b +  "=" +  sum);
        System.out.println(a + "_" + b +  "=" +  subtract);
        System.out.println(a + "x" + b +  "=" +  multiply);
        System.out.println(a + "/" + b +  "=" +  divide);
        System.out.println(a +  "mod"  + b + "=" + reminder);
    }
}
