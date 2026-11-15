import java.util.Scanner;
public class charcheck {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter value: ");
        char ch = sc.next().charAt(0);
        if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ) {
            System.out.println("The char is Alphabet");
        } else if (ch >= '0' && ch <= '9' ) {
            System.out.println("The char is Digit: ");
        } else{
            System.out.println("The char is special char: " );
        }
        sc.close();
    }
}
