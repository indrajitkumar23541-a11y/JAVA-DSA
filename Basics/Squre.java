package Basics;

import java.util.Scanner;

public class Squre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numbers : ");
        int n = sc.nextInt();
        int square = n*n;
        System.out.println("The square is : "+square);
    }
    
}
