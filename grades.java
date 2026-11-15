import java.util.Scanner;
public class grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks: ");
        int marks = sc.nextInt();
        if(marks < 0 || marks > 100) {
            System.out.println("Marks are invalid ");
        } else if(marks >= 0 && marks <= 19) {
            System.out.println("Fail ");
        }else if(marks > 19 && marks <= 30) {
            System.out.println("D");
        } else if(marks > 30 && marks <= 45) {
            System.out.println("C");
        } else if(marks > 45 && marks <= 65) {
            System.out.println("B");
        }else if(marks > 65 && marks <= 80) {
            System.out.println("A");
        } else {
            System.out.println("O");
        }
        sc.close();
    }
}
