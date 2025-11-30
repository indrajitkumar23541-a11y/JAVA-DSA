package Basics;

import java.util.Scanner;

public class DoWhile_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter numbers (stop with -1): ");
        
        int num;
        int sum = 0;

        do {
            num = sc.nextInt();  
            if(num != -1) {     
                sum += num;
            }
        } while(num != -1);

        System.out.println("Sum = " + sum);

        sc.close();
    }
}
