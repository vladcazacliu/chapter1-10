package lab2;

import java.util.Scanner;
public class ex2_17 {
    public static void main(String[] args)
    {
        // create Scanner penntru a obtine input
        Scanner input = new Scanner(System.in);

        // variabile initializam
        int num1;
        int num2;
        int num3;
        int sum;
        int average;
        int product;
        int smallest;
        int largest;

        System.out.print("Dati primul numar: ");   // prompt
        num1 = input.nextInt(); // citim first integer from user

        System.out.print("Dati al doilea numar: ");    // prompt
        num2 = input.nextInt();    // citim a 2 integer from user

        System.out.print("Dati al treilea numar: ");   // prompt
        num3 = input.nextInt();    // citim a 3 integer from user

        sum = num1 + num2 + num3;  // adunam numerele
        average = (sum) / 3;   // media of the numbers
        product = num1 * num2 * num3;  // product of the numbers

        // comparam valoarea pentru a obtine valorea cea mai mica
        smallest = num1;
        if (num2 <= smallest)
            smallest = num2;

        if (num3 <= smallest)
            smallest = num3;

        // comparam iarasi
        largest = num1;
        if (num2 >= largest)
            largest = num2;

        if (num3 >= largest)
            largest = num3;

        System.out.printf("Sum is %d\n", sum);
        System.out.printf("Average is %d\n", average);
        System.out.printf("Product is %d\n", product);
        System.out.printf("Smallest is %d\n", smallest);
        System.out.printf("Largest is %d\n", largest);

    }
}


