package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int firstNum=0;
        int secondNum=0;

        //accept inputs from users
        System.out.println("Dati primul numar:");
        firstNum=input.nextInt();

        System.out.println("Dati al doilea numar:");
        secondNum=input.nextInt();

        if(number(firstNum, secondNum)){
            System.out.println(firstNum + " este multiplul lui " + secondNum);
        }
        else{
            System.out.println(firstNum + " nu este multiplul lui " + secondNum);
        }

    }
    public static boolean number(int num1, int num2){
        if((num1%num2)==0)
            return true;
        else
            return false;

    }
}





