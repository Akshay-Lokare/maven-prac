
package com.example;

public class App {

    public static String calculateGrade(int marks) {

        if (marks < 0 || marks > 100) {
            return "Invalid";
        } else if (marks >= 75) {
            return "A";
        } else if (marks > 60) {
            return "B";
        } else if (marks >= 40) {
            return "C";
        } else {
            return "D";
        }
    }

    public static void main(String[] args) {
        int marks = 85;

        System.out.println("Student marks: " + marks);
        System.out.println("Grade: " + calculateGrade(marks));
    }
}
