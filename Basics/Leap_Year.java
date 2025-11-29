package Basics;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year : ");
        int Y = sc.nextInt();
        if(Y%4==0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not Leap Year");
        }
    }
    
}
