package Basics;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println(n + " Is Even Number ");
        }
        else{
            System.out.println(n + " Is Odd");
        }
    }
    
}
