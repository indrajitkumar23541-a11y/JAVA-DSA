package Basics;

import java.util.Scanner;

public class Sumofnum_forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Emter n : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int num=1; num<=n; num++){
            sum = sum+num;
        }
        System.out.println(sum);
        sc.close();
    }
    
}
