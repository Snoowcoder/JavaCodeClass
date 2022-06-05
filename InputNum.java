
import java.util.Scanner;

public class InputNum {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First number");
        int a  = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Second number");
        int b = sc.nextInt();

        int result = a * b;
        System.out.println("The product of the inputs is "+ result);

    }



}
