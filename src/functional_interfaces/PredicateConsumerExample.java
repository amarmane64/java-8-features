package functional_interfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateConsumerExample {

    Predicate<Student> studentPredicate1 = (student) -> student.getGradeLevel() >= 3;
    Predicate<Student> studentPredicate2 = (student) -> student.getGpa() >= 3.9;
    BiConsumer<String, List<String>> biConsumerStudent = (name, activities) ->
            System.out.println(name + " : " + activities);

    Consumer<Student> studentConsumer = (student -> {
        if (studentPredicate1.and(studentPredicate2).test(student)) {
            biConsumerStudent.accept(student.getName(), student.getActivities());
        }
    });

    public void printNameAndActivities(List<Student> studentList) {
        studentList.forEach(studentConsumer);
    }

    public static void main(String[] args) {

        List<Student> studentList = StudentDataBase.getAllStudents();
        new PredicateConsumerExample().printNameAndActivities(studentList);

    }
}
