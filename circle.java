import java.util.Scanner;
public class circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: " );
        Double r = sc.nextDouble();
        Double area = Math.PI*r*r;
        Double circumference = 2*Math.PI*r;
        System.out.println("Area of circle is: " + area);
        System.out.println("Circumference of Circle is: " + circumference);
        sc.close();

    }
}
