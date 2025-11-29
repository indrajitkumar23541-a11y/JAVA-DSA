package Basics;
import java.util.Scanner;

public class Divisible_by5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        if(n%5==0){
            System.out.println(n + " is Divisible by 5");
        }
        else{
            System.out.println(n + " is not Divisible by 5");
        }
    }
    
}
