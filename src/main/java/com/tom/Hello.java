package com.tom;

import java.sql.SQLOutput;

public class Hello {
    public static void main(String[] args) {
        //System.out.println("Hello");
     Person p=new Person( "tom",66.5f, 1.7f);
     p.hello();
     p.weight=66.5f;
     p.height=1.7f;
     System.out.println(p.bmi());
     int score =88;
     System.out.println(score<60||score>90);
     char c='A';
      System.out.println(c> 'a');
     /*int age=19;
     char c='x';
     Character c2='A';
     byte b=120;
     float weight =66.5f;
     double heighrt=1.7;
     boolean adult=true;
     String name="tom";*/

    }
}
