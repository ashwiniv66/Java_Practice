package org.java.Functionalnterface.Function;

import java.util.function.Function;

//update grade based on marks of each student
// marks >= 80 = A[Distinction]
// marks >= 60 = B[First Class]
// marks >= 50 = C[second Class]
// marks >= 35 = D[Third Class]
// otherwise => F[Failed]
public class Student {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}
class Test {
    public static void main(String[] args) {
        Function<Student,String> f = s-> {
            int marks = s.marks;
            String grade ="";
            if(marks >= 80) grade = "A[Distinction]";
            else if (marks >= 60) grade= "B[First Class]";
            else if (marks >= 50) grade= "C[second Class]";
            else if (marks >= 35) grade= "D[Third Class]";
            else grade="F[Failed]";
            return grade;
        };
        Student[] s ={
                new Student("Ashwini",100),
                new Student("Bhumi",60),
                new Student("Abhi",50),
                new Student("Bharat",40),
                new Student("Aksha",23)
        };
        for(Student s1:s){
            System.out.println("Student name : " + s1.name +", Marks:" + s1.marks + ", grade:" + f.apply(s1));
        }
    }
}
