import java.util.Scanner;
public class circle {
    public static void main(String[]args){
        //Scanner class
        Scanner input=new Scanner(System.in);
        //declare variables
        int radius=0;
        double pie=Math.PI;

        //accept radius from the user
        System.out.println("Enter radius:");
        radius=input.nextInt();

        //Diameter of the circle
        System.out.printf("Diameter =  %.1f\n", 2*(double)radius);
        // Circumference of the circle
        System.out.printf("Circumference =  %.1f\n", 2*pie*(double)radius);
        // Area of the circle
        System.out.printf("Area =  %.1f", pie*(double)(radius*radius));




    }
}
