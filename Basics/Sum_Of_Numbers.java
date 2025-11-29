package Basics;

import java.util.Scanner;

public class Sum_Of_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int x = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int y = sc.nextInt();
        int sum = x+y;
        System.out.println("The sum is : "+sum);
    }
    
}
