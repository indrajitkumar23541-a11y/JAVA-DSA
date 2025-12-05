package Basics;
import java.util.Scanner;

public class HighestFactor_Of_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt();
        int HF = 1;
        for(int i=n-1; i>=1; i--){
            if(n%i==0){
                HF=i;
                break;
            }
        }
        System.out.println(HF);
        sc.close();
    }
    
}
