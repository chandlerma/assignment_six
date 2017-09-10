import java.util.Scanner;
public class assignment_six {
    public static void main(String[] strings) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number of sides: ");
        int n = scan.nextInt();
        System.out.println("enter the side: ");
        double side = scan.nextDouble();

        System.out.println("the area of the polygon is " + area(n,side));

    }

    public static double area(int n, double side) {

        return  (n * Math.pow(side,2)) / (4 * Math.tan(Math.PI/n));
    }
}