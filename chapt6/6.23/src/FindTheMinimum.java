import java.util.Scanner;

public class FindTheMinimum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 space separated numbers: ");
        System.out.printf("Minimum value is: %.2f\n",
                minumum3(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
    }
    public static double minumum3(double x, double y, double z){
        return Math.min(x, Math.min(y, z));
    }
}