package org.lab5;

import java.util.Comparator;
import org.lab3.Student;

public class ByName implements Comparator<Student> {

    public int compare(Student v, Student w) {
        return v.fullName.compareTo(w.fullName);
    }

}
