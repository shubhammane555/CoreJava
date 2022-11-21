package com.collection;




import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;

class Student {
    private String name;
    private int id;
    private String subject;

    double percentage;

    public Student(String name, int id, String subject, double percentage) {
        this.name = name;
        this.id = id;
        this.subject = subject;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }

    public double getPercentage() {
        return percentage;
    }

    @Override
    public String toString() {
        return name + "-" + id + "-" + subject + "-" + percentage;
    }

}
class StudentDriver {
    public static void main(String[] args) {
        Student student1 = new Student("Dinesh", 1, "Algorithms", 75);
        Student student2 = new Student("Arnav", 2, "Automata", 55);
        Student student3 = new Student("Anamika", 3, "Databases", 80);
        Student student4 = new Student("Vishal", 4, "Networking", 40);
        List<Student> studentList = Arrays.asList(student1, student2, student3, student4);

        Map<Boolean, List<Student>> map = studentList.stream()
                .collect(Collectors.partitioningBy(stu -> stu.getPercentage() > 60));
        System.out.println(map);

        List<Student> topPerformer = studentList.stream()
                .sorted(Comparator.comparing(Student::getPercentage, Comparator.reverseOrder())).limit(3)
                .collect(Collectors.toList());

        System.out.println(topPerformer);

        Map<String, Double> map2 = studentList.stream()
                .collect(Collectors.toMap(Student::getName, Student::getPercentage));
        System.out.println(map2);

        Set<String> subjectSet = studentList.stream().map(Student::getSubject).collect(Collectors.toSet());
        System.out.println(subjectSet);

        Optional<Double> highest = studentList.stream().mapToDouble(Student::getPercentage).max();
        System.out.println("Highest Percentage :" + highest.getAsDouble());

        OptionalDouble lowest = studentList.stream().mapToDouble(Student::getPercentage).min();
        System.out.println("Lowest Percentage :" + lowest.getAsDouble());

        OptionalDouble average = studentList.stream().mapToDouble(Student::getPercentage).average();

        System.out.println("Average Percentage :" + average.getAsDouble());
        System.out.println("Total students: " + studentList.size());

        Map<String, List<Student>> groupBySubject = studentList.stream()
                .collect(Collectors.groupingBy(Student::getSubject));
        System.out.println(groupBySubject);
    }
}}