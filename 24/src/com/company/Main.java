package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number1,
                number2,
                number3,
                number4,
                number5,
                largest,
                smallest;

        System.out.print("Dati primul numar: ");
        number1 = input.nextInt();

        System.out.print("Dati al doilea numar: ");
        number2 = input.nextInt();

        System.out.print("Dati al treilea numar: ");
        number3 = input.nextInt();

        System.out.print("Dati al patrulea numar: ");
        number4 = input.nextInt();

        System.out.print("Dati al cincilea numar: ");
        number5 = input.nextInt();

        largest = number1;
        smallest = number1;

        if (number2 > largest)
            largest = number2;
        if (number3 > largest)
            largest = number3;
        if (number4 > largest)
            largest = number4;
        if (number5 > largest)
            largest = number5;
        if (number2 < smallest)
            smallest = number2;
        if (number3 < smallest)
            smallest = number3;
        if (number4 < smallest)
            smallest = number4;
        if (number5 < smallest)
            smallest = number5;

        System.out.printf("Cel mai mare din 5 numere este %d,si cel mai mic este %d%n", largest, smallest);
    }
}
