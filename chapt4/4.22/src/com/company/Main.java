package com.company;

public class Main {

    public static void main( String[] args )
    {

        int i;
        System.out.print("\nN\t10*N\t100*N\t1000*N\n\n");
        for(i=1;i<=5;i++)
        {
            System.out.print("\n"+ i + "\t"+ (i*10) +"\t" + (i*100) +"\t"+ (i*1000));
        }
    }
}