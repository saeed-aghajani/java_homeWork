package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        User user=new User();
        System.out.println("Enter your userName");
        user.setUserName(scanner.next());
        System.out.println("Enter your name:");
        user.setRealName(scanner.next());
        System.out.println("Enter yor  pass:");
        user.setPass(scanner.next());
        System.out.println("Enter your Address");
        user.setAddress(scanner.next());
        System.out.println("Enter your telephon");
        user.setTelephon(scanner.next());
        System.out.println("Enter your education ");
        user.setEducation(scanner.next());
        System.out.println("Enter your age:");
        user.setAge(scanner.nextInt());
        System.out.println("your user name is"+user.getUserName());
        System.out.println("Your realname is"+user.getRealName());
        System.out.println("your pass is"+user.getPass());
        System.out.println("your Address is "+user.getAddress());
        System.out.println("your telephon is "+user.getTelephon());
        System.out.println("your education is"+user.getEducation());
        System.out.println("your ag is "+user.getAge());
    }
}
