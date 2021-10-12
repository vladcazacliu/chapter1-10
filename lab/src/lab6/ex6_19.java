package lab6;
import java.util.Scanner;
public class ex6_19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Enter side of square (-1 to exit): ");
            int x = sc.nextInt();

            if(x == -1)
                break;

            System.out.print("Enter fill char: ");
            char fill = sc.next().charAt(0);

            squareOfChar(x, fill);
        }
    }
    public static void squareOfChar(int x, char fillCharacter){
        for(int i=0; i<x; i++){
            System.out.println();
            for(int j=0; j<x; j++){
                System.out.print(fillCharacter);
            }
        }
        System.out.printf("\n\n");
    }
}

