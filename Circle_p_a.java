
import java.util.Scanner;

public class Circle_p_a {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of circle of which you want AREA & PERIMETER");
        float r = sc.nextInt();
        float area = (3.14f) * (r*r);
        float perimeter = 2 * (3.14f) * r;

        System.out.println("Your AREA of circle is "+ area);
        System.out.println("Your PERIMETER of circle is "+ perimeter);
    }


}
