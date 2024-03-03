package com.viktoria.cs.lesson6;

import java.util.List;
import java.util.Objects;

public class Student {
    private final String name;
    private final String surname;
    private final Integer courseNumber;

    private final List<Integer> grades;

    public Student(String name, String surname, Integer courseNumber, List<Integer> grades) {
        this.name = name;
        this.surname = surname;
        this.courseNumber = courseNumber;
        this.grades = grades;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFullName() {
        return getName() + " " + getSurname();
    }

    public Integer getCourseNumber() {
        return courseNumber;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", courseNumber=" + courseNumber +
                ", grades=" + grades +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(courseNumber, student.courseNumber) && Objects.equals(grades, student.grades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, courseNumber, grades);
    }
}

