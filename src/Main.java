/*
Question : Write a java program to find the greatest Common Divisor of a given set of numbers is the highest
           number which divides exactly every number of the given set.
___________________________________________________________________________________________________________________
Test case :
Enter First Number:24
Enter Second Number:16
Greatest Common Divisor:8
*/
import static java.lang.StrictMath.min;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int FirstDigit,SecondDigit,Multiple = 1,i;
        System.out.println("Enter the FirstDigit :");
        FirstDigit = sc.nextInt();
        System.out.println("Enter the SecondDigit :");
        SecondDigit = sc.nextInt();
        int n = min(FirstDigit,SecondDigit);
        for (i = 2; i < n; i++){
            while (FirstDigit % i == 0 && SecondDigit % i == 0){
                FirstDigit = FirstDigit / 2;
                SecondDigit = SecondDigit / 2;
                Multiple = Multiple * i;
            }
        }
        System.out.println("Printing the result : " + Multiple);
    }
}