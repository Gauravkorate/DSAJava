import java.util.Scanner;
public class fivesubject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of 5 subjects: ");
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int sub4 = sc.nextInt();
        int sub5 = sc.nextInt();
        int total = sub1 + sub2 + sub3 + sub4 + sub5;
        System.out.println("Total marks of 5 subjects is: " + total);
        int average = total / 5;
        System.out.println("Average marks of 5 subjects is: " + average);
        sc.close();
    }
}
