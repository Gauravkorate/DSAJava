import java.util.Scanner;

public class productNnaturalno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N Number: ");
        int n = sc.nextInt();
        long fact = 1;
        for(int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Product of N number is: " + fact);
        sc.close();
    }
}
