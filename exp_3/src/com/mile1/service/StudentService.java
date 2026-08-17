package com.mile1.service;

import com.mile1.bean.Student;

public class StudentService {

    public int findNumberOfNullMarksArray(Student s[]) {

        int count = 0;

        // Check whether array itself is null
        if (s == null) {
            return count;
        }

        // Check every student object
        for (int i = 0; i < s.length; i++) {

            // First check student object
            if (s[i] != null) {

                // Then check marks
                if (s[i].getMarks() == null) {
                    count++;
                }
            }
        }

        return count;
    }

    public int findNumberOfNullName(Student s[]) {

        int count = 0;

        if (s == null) {
            return count;
        }

        for (int i = 0; i < s.length; i++) {

            if (s[i] != null) {

                if (s[i].getName() == null) {
                    count++;
                }
            }
        }

        return count;
    }

    public int findNumberOfNullObjects(Student s[]) {

        int count = 0;

        if (s == null) {
            return count;
        }

        for (int i = 0; i < s.length; i++) {

            if (s[i] == null) {
                count++;
            }
        }

        return count;
    }
}