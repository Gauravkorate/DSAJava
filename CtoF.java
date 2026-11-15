import java.util.Scanner;
public class CtoF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value in celsius: ");
        Double celsius = sc.nextDouble();
        Double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Value of farenheit is: " + fahrenheit);
        sc.close();
    }
}
