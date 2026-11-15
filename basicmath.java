import java.util.Scanner;

public class basicmath {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int a = sc.nextInt();
        System.out.println("Enter Number: ");
        int b = sc.nextInt();

        int sum = a + b;
        int sub = a - b;
        int mull = a * b;
        int quot = a / b;

        System.out.println("Sum of the Numbers is: " + sum);
        System.out.println("substraction of two number is: " + sub);
        System.out.println("Multiplication of two number is: " + mull);
        System.out.println("Devision of two number is: " + quot);
        sc.close();
    }
    
}
