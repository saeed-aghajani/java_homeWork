package com.company;

public class Student {
    public String name;
    public String family;
    public int StudentNumber;
    public int age;
    public String field;
    public String AcademicOrientation;
     public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getStudentNumber() {
        return StudentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        StudentNumber = studentNumber;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getAcademicOrientation() {
        return AcademicOrientation;
    }

    public void setAcademicOrientation(String academicOrientation) {
       this.AcademicOrientation = academicOrientation;
    }
}
