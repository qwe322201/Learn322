package com.box;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Box3 box3=new Box3();
        Box5 box5=new Box5();
        Scanner scanner=new Scanner(System.in);
        System.out.println(" Please enter object's length:");
        float length=scanner.nextFloat();
        System.out.println(" Please enter object's width:");
        float width=scanner.nextFloat();
        System.out.println(" Please enter object's height:");
        int height=scanner.nextInt();


        if(box3.validate( length, width,  height)){
            System.out.println("choose Box3");
        }
        else if(box5.validate(length,width,height)){
            System.out.println("choose Box5");
        }else
            System.out.println("no choose");
    }
}
