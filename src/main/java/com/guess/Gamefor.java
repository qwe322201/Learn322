package com.guess;

import java.util.Random;
import java.util.Scanner;

public class Gamefor {
    public static void main(String[] args) {
        int secret= new Random().nextInt(10)+1;
        System.out.println(secret);
       /* for(int i=1; i<=4; i++){
            System.out.println(i);
        }*/
        Scanner scanner=new Scanner(System.in);
        for (int i=1; i<=5; i++){
            System.out.print("Please number");
            int number=scanner.nextInt();
            System.out.println("test:"+i+"\t"+number);
            if(number>secret) {
                System.out.println("low");
            }
             if(number<secret) {
                System.out.println("high");
            }
            else{
                System.out.println("great");

                break;
            }
        }System.out.println("over");
    }
}
