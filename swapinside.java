import java.util.Scanner;
public class swapinside {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Enter b number: ");
        int b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping a number is: " + a);
        System.out.println("After swapping b number is: " + b);
        sc.close();

    }
}
