package edu.mum.cs.cs425.demos.studentrecordsmgmtapp;

import edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model.Student;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class MyStudentRecordsMgmtApp {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("110001","Dave", LocalDate.of(1951,11,18)),
                new Student("110002","Anna", LocalDate.of(1990,12,7)),
                new Student("110003","Erica", LocalDate.of(1974,1,31)),
                new Student("110004","Carlos", LocalDate.of(2009,8,22)),
                new Student("110005","Bob", LocalDate.of(1990,3,5)),
        };
        System.out.println("List of student: ");
        printListOfStudents(students);
        System.out.println("List of Platinum Alumni Students: ");
        getListOfPlatinumAlumniStudents(students);
    }
    static void printListOfStudents(Student[] students){
        Arrays.sort(students, Comparator.comparing(Student::getName));
        for(Student student : students){
            System.out.println(student.toString());
        }
    }
    static void getListOfPlatinumAlumniStudents(Student[] students){
        Arrays.stream(students).filter(student -> (LocalDate.now().getYear()-student.getDateOfAdmission().getYear())>30)
                .sorted(Comparator.comparing(Student::getDateOfAdmission)
                .reversed()).forEach(System.out::println);
    }
}
