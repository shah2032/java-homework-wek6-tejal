package javahomework;
/**
 * take number as input and prints its multiplication table up to 10
 */

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int out = in.nextInt();
        for(int i=1; i<= 10; i++){
            System.out.println(out+" x "  +i+ " = "+out*i);
        }
    }
}
