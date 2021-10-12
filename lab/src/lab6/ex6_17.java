package lab6;
import java.util.Scanner;

public class ex6_17 {
    public static void main(String[] args) {
        // write your code here
        int inputNumber;

        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Enter input number: ");
        inputNumber = myScanner.nextInt();
        System.out.println("Is even: " + isEven(inputNumber));
    }

    public static boolean isEven(int inputNumber) {
        return (inputNumber % 2 == 0);
    }
}


