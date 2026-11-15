import java.util.Scanner;
public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length: ");
        Double L = sc.nextDouble();
        System.out.println("Enter breath: ");
        Double B = sc.nextDouble();
        Double area = L * B;
        Double perimeter = 2 * (L + B);
        System.out.println("Area of Rectangle is: " + area);
        System.out.println("perimeter of Rectangle is: " + perimeter);
        sc.close();
    }
}
