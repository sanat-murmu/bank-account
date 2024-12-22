import java.util.*;
import java.time.*;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the date in mm dd yyyy Format: ");

        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();

        try {
            LocalDate DoB = LocalDate.of(year, month, day);

            System.out.println("Valid Date: " + DoB);
            System.out.println("Day number of the year: " + DoB.getDayOfYear());
        }
        catch (Exception e) {
            System.out.println("Invalid Date.");
        }
    }
}