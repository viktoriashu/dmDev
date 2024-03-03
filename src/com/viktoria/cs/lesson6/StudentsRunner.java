package com.viktoria.cs.lesson6;

import java.util.*;
import java.util.stream.Collectors;

public class StudentsRunner {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Геннадий", "Бобров", 1, Arrays.asList(4, 5)),
                new Student("Александр", "Котов", 3, Arrays.asList(5, 5, 4, 5)),
                new Student("Сергей", "Жуков", 1, Arrays.asList(3, 4)),
                new Student("Артемий", "Лебедев", 4, Arrays.asList(4, 5, 5, 5)),
                new Student("Александр", "Овечкин", 2, Arrays.asList(5, 5, 5, 5)),
                new Student("Виктория", "Караськова", 5, Arrays.asList(5, 5, 5, 5)),
                new Student("Евгений", "Чижевский", 3, Arrays.asList(4, 5, 4, 5)),
                new Student("Андрей", "Богомолов", 4, Arrays.asList(4, 5, 4, 5)),
                new Student("Дмитрий", "Сазонов", 5, Arrays.asList(4, 3, 4)),
                new Student("Борис", "Козлов", 1, Arrays.asList(3, 5, 4, 5)));


        Map<Integer, Double> averageGrades = students.stream()
                .filter(student -> student.getGrades().size() > 3)
                .collect(Collectors.groupingBy(Student::getCourseNumber,
                        Collectors.averagingDouble(x -> x.getGrades().
                                stream().mapToDouble(Integer::doubleValue).average().orElseGet(() -> 0.0))));
        System.out.println(averageGrades);


        Map<Integer, List<String>> studentsFullNameList = students.stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.groupingBy(Student::getCourseNumber,
                        Collectors.mapping(Student::getFullName, Collectors.toList())));
        System.out.println(studentsFullNameList);


//Метод для условия 3 нерабочий

//        Map<Integer, Map<List<String>, Double>> studentsListAndAverageGrades = students.stream()
//                .sorted(Comparator.comparing(Student::getName))
//                .collect(Collectors.groupingBy(Student::getCourseNumber,
//                        groupingBy(mapping(Student::getFullName, Collectors.toList(),
//                                Collectors.averagingDouble(x -> x.getGrades().
//                                stream().mapToDouble(Integer::doubleValue).average().orElseGet(() -> 0.0))))));
//
//        System.out.println(studentsListAndAverageGrades);
//
    }
}


