package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int number;

        //accept input from user
        System.out.println("Dati un numar:");
        number=input.nextInt();

        if(number(number)){
            System.out.println(number + " este par");

        }
        else{
            System.out.println(number + " este impar");
        }
    }
    public static boolean number(int num){
        if((num%2)==0)
            return true;
        else
            return false;
    }
}

