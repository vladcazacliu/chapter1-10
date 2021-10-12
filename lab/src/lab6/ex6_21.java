package lab6;
import java.util.Scanner;

public class ex6_21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer between 0-99999: ");
        displayDigits(sc.nextInt());
    }
    // A - calculate the integer part of the quotient when a is divided by b
    private static int getQuotient(int a, int b){
        return a % b;
    }
    // B - calculate the integer remainder when a is divided by b
    private static int getRemainder(int a, int b){
        return a / b;
    }
    // C
    public static void displayDigits(int x){
        int[] numVal = new int[String.valueOf(x).length()];

        // add separated digits to list
        for(int i=numVal.length-1; i>=0; i--){
            numVal[i] = getQuotient(x, 10);
            x = getRemainder(x, 10);
        }

        for(int i=0; i<numVal.length; i++){
            System.out.printf("%d  ", numVal[i]);
        }

        System.out.println();
    }
}

