package com.tom.student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args)
    {
        System.out.print("Please enter name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.print("Please enter english");
        int english = scanner.nextInt();
        System.out.print("Please enter math");
        int math = scanner.nextInt();
        StudentSu stu=new StudentSu(name,english,math);
        stu.print();
    }
}
