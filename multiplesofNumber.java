import java.util.Scanner;
public class multiplesofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nummber of m: ");
        int m =sc.nextInt();
        System.out.println("Enter The Number of n: ");
        int n = sc.nextInt();
        for(int i =1; i <= n; i++) {
            System.out.println(m*i);
        }
        sc.close();
    }
}
