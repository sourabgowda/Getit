package com.example.chandan.getit;

/**
 * Created by Chandan on 24-03-2017.
 */

public class Faculty {
    String facultyID;
    String facultyName;
    String facultyPhone;
    String facultyEmail;
    String facultyDept;
    String facultyDesignation;

    public Faculty(){


    }

    public Faculty(String facultyID, String facultyName, String facultyPhone, String facultyEmail, String facultyDept, String facultyDesignation) {
        this.facultyID = facultyID;
        this.facultyName = facultyName;
        this.facultyPhone = facultyPhone;
        this.facultyEmail = facultyEmail;
        this.facultyDept = facultyDept;
        this.facultyDesignation = facultyDesignation;
    }

    public String getFacultyID() {
        return facultyID;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public String getFacultyPhone() {
        return facultyPhone;
    }

    public String getFacultyEmail() {
        return facultyEmail;
    }

    public String getFacultyDept() {
        return facultyDept;
    }

    public String getFacultyDesignation() {
        return facultyDesignation;
    }
}
