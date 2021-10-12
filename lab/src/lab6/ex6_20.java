package lab6;
import java.util.Scanner;
public class ex6_20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle get its area: ");
        System.out.printf("Area: %.2f\n", circleArea(sc.nextDouble()));
    }
    // area = pi * radius^2
    public static double circleArea(double r){
        return Math.PI * Math.pow(r, 2);
    }
}

