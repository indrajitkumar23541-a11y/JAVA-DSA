package Basics;

import java.util.Scanner;

public class PrimeNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        boolean flag = false;
        for(int i=2; i<n; i++){
            if(n%i==0){
                flag=true;
                break;

            }
        }
        if(flag==false){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Composite Number");
        }


    }
    
}
