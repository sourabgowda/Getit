package com.example.chandan.getit;

/**
 * Created by Chandan on 24-03-2017.
 */

public class Student {
    String studentID;
    String studentName;
    String studentUSN;
    String studentPhone;
    String studentEmail;
    String studentDepartment;
    String studentSemester;

    public Student(){


    }

    public Student(String studentID, String studentName, String studentUSN, String studentPhone, String studentEmail, String studentDepartment, String studentSemester) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentUSN = studentUSN;
        this.studentPhone = studentPhone;
        this.studentEmail = studentEmail;
        this.studentDepartment = studentDepartment;
        this.studentSemester = studentSemester;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentUSN() {
        return studentUSN;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public String getStudentDepartment() {
        return studentDepartment;
    }

    public String getStudentSemester() {
        return studentSemester;
    }
}
