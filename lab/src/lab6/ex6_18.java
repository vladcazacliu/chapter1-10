package lab6;
import java.util.Scanner;


public class ex6_18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Enter side of square (-1 to exit): ");
            int x = sc.nextInt();

            if(x == -1)
                break;

            squareOfAsterisks(x);
        }
    }
    public static void squareOfAsterisks(int x){
        for(int i=0; i<x; i++){
            System.out.println();
            for(int j=0; j<x; j++){
                System.out.print('*');
            }
        }
        System.out.println();
    }}

