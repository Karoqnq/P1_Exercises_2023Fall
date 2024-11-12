package week_4;

import java.util.Scanner;

public class MethodsToolsProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int first = input.nextInt();
        
        System.out.print("Enter the second integer: ");
        int second = input.nextInt();
        
        System.out.print("Enter the third integer: ");
        int third = input.nextInt();

        int minimumValue = MethodsTools.minimum(first, second, third);

        System.out.println("The minimum value is: " + minimumValue);
        
        input.close();
    }
}