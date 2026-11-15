import java.util.Scanner;
public class time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time in Seconds: ");
        int seconds = sc.nextInt();
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;
        System.out.println("time in hours: " + hours + " minutes: " + minutes + " seconds: " + remainingSeconds);
        sc.close();
    }
}
