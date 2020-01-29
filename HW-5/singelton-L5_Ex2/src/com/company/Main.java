package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name,family,age,education;
        Form.getInstance().CreatForm();
        System.out.println("Enter your name");
        name=scanner.nextLine();
        System.out.println("Enter your family:");
        family=scanner.nextLine();
        System.out.println("Enter your age:");
        age=scanner.nextLine();
        System.out.println("Enter your education:");
        education=scanner.nextLine();
        Form.getInstance().job();
        System.out.println("suggesting your job");
        System.out.println("1-Engineering");
        System.out.println("2-medical");
        System.out.println("3-programmering");
        System.out.println("your name is "+name);
        System.out.println("your family is "+family);
        System.out.println("your age is "+age);
        System.out.println("your education is "+education);
    }
}
