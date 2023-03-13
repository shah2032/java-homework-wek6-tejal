package javahomework;

import java.util.Scanner;

public class ConvertOfLowercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a String: ");
        String line = scanner.nextLine();
        line = line.toLowerCase();
        System.out.println(line);
        scanner.close();
    }
}
