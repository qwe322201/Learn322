package com.tom.student;

public class StudentSu {
    String id;
    String name;
    int english;
    int math;

    public StudentSu(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }
    public void print(){
        System.out.println(name+"\t"+english+"\t"+math
                +"\t"+(english+math)/2);
    }
}

