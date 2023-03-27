/*
Question : Write a java program to find the greatest Common Divisor of a given set of numbers is the highest
           number which divides exactly every number of the given set.
___________________________________________________________________________________________________________________
Test case :
Enter First Number:24
Enter Second Number:16
Greatest Common Divisor:8
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int FirstDigit,SecondDigit,Multiple = 1,temp = 2;
        System.out.println("Enter the FirstDigit :");
        FirstDigit = sc.nextInt();
        System.out.println("Enter the SecondDigit :");
        SecondDigit = sc.nextInt();
        while (FirstDigit % 2 == 0 && SecondDigit % 2 == 0){
            FirstDigit = FirstDigit / 2;
            SecondDigit = SecondDigit / 2;
            Multiple = Multiple * temp;
        }
        System.out.println("Printing the result : " + Multiple);
    }
}