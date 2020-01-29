package com.company;
import java.util.Collections;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
         Student std = new Student();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name:");
        std.setName( scanner.nextLine());
        System.out.println("Enter your family:");
        std.setFamily( scanner.nextLine());
        System.out.println("Enter your studentNumber:");
        std.setStudentNumber(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter your age:");
        std.setAge(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter your field:");
        std.setField( scanner.nextLine());
        System.out.println("Enter your AcademicOrientation :");
        std.setAcademicOrientation(scanner.nextLine());

        System.out.println(" your name is:");
        System.out.println(std.getName());
        System.out.println(" your family is:");
        System.out.println(std.getFamily());
        System.out.println("your studentNumber is:");
        System.out.println(std.getStudentNumber());
        System.out.println(" your age is:");
        System.out.println(std.getAge());
        System.out.println(" your field is:");
        System.out.println(std.getField());
        System.out.println(" your AcademicOrientation is :");
        System.out.println(std.getAcademicOrientation());
    }
}



