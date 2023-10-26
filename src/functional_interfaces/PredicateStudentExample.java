package functional_interfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {
    static Predicate<Student> predicate1 = (student) -> student.getGradeLevel() >= 3;
    static Predicate<Student> predicate2 = (student) -> student.getGpa() >= 3.9;


    public static void filterStudentsByGradeLevel(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(predicate1.test(student)){
                System.out.println(student);
            }
        });
    }

    public static void filterStudentsByGPA(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(predicate2.test(student)){
                System.out.println(student);
            }
        });
    }
    public static void filterStudentsByGPAAndGrade(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(predicate1.and(predicate2).test(student)){
                System.out.println(student);
            }
        });
    }

    public static void main(String[] args) {
        filterStudentsByGradeLevel();
        System.out.println("-----------------------------------------------------");
        filterStudentsByGPA();
        System.out.println("-----------------------------------------------------");
filterStudentsByGPAAndGrade();
    }
}
