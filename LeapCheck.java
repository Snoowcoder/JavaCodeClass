import java.util.Scanner;

public class LeapCheck {
    public static void main(String[] args) {
        System.out.println("Enter the Year You want to check Whether it is a leap year or not!!!");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            System.out.println("It is a leap year!!!!");
        else System.out.println("It is not a leap year!!!!");
    }
}