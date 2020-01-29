package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Avg obj=new Avg();
        int i=0;
        System.out.println("enter your marks if finished enter #");
        for ( i=0;i<100;i++)
        {
            Scanner input=new Scanner(System.in);
            String str =input.nextLine();
            if(str=="#")
                break;
            double mark=Double.parseDouble(str);
            obj.marks[i]=mark;

        }
        obj.end=i;
        obj.setMarks();
        System.out.println("your average: "+obj.avg);
        if (obj.avg<=12)
            System.out.println("mashroot shodi!!!!!");
        else
            System.out.println("ghabool shoooooodi!!!!!!");
    }
}
