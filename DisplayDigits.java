import java.util.Scanner;
public class DisplayDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        n = Math.abs(n);
        if(n == 0) {
            System.out.println(0);
        } else{
            while (n > 0) {
                int digit = n % 10;
                System.out.println(digit);
                n = n / 10;
            }
        }
        sc.close();
    }
}
