
import java.util.Scanner;
public class Inches2M {
    public static void main (String [] args){
        System.out.println("Please Enter the in Inches ; I will help you convert it to Meters!!");
        Scanner sc = new Scanner(System.in);
        float inches = sc.nextFloat();
        float convert = inches * (0.0254f);
        System.out.println("Your Converted parameter in Meters is "+ convert );
    }

}
