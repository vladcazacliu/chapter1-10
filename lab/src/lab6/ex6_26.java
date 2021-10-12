package lab6;
import java.util.Scanner;

public class ex6_26 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer to see it reversed: ");
        System.out.printf("%d\n", reverseInt(sc.nextInt()));
    }
    // reverse, concatenate to string, return string converted to int
    public static int reverseInt(int x){
        String reversed = "";

        while(x != 0){
            reversed += x % 10;
            x /= 10;
        }

        return Integer.parseInt(reversed);
    }
}

