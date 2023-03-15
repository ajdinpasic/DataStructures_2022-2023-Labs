package org.lab3;

public class Student implements  Comparable<Student> {
    public String fullName;
    public String department;
    public double gpa;

    public Student(String fullName, String department, double gpa) {
        this.fullName = fullName;
        this.department = department;
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Student that) {
        if(this.gpa > that.gpa) return 1;
        else if (this.gpa < that.gpa) return -1;
        else return 0;
        //return this.gpa > that.gpa ? -1 : (this.gpa < that.gpa ? -1 : 0);
    }
}
