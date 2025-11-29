package Basics;

import java.util.Scanner;

public class Area_Of_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius : ");
        int radius;
        radius=sc.nextInt();
        double pi = 3.1415;
        double area = pi*radius*radius;
        System.out.println("The Area Of Circle is : "+area);
    }
    
}
