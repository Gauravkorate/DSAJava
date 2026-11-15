


//Write a program to count the number of digits in a number n.

import java.util.Scanner;
public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        n = Math.abs(n);
        int count = 0;
        if(n == 0) {
            count = 1;
        } else {
            while(n > 0) {
                n = n / 10;
                count++;
            }
        }
        System.out.println("Count will be: " + count);
        sc.close();
    }
}
