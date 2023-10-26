package functional_interfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void printStudentNameAndActivitiesUsingBiConsumer() {

        BiConsumer<String, List<String>> biConsumer = (name, activities)->{
            System.out.println(name + " : "+ activities);
        };
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> biConsumer.accept(student.getName(), student.getActivities()));

    }

    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (a, b) ->{
            System.out.println("a: "+ a + ", b: "+b);
        };
        biConsumer.accept("Java7", "Java8");


        BiConsumer<Integer, Integer> biConsumerMultiply = (a, b) ->{
            System.out.println("Multiplication is: " + a*b);
        };

        BiConsumer<Integer, Integer> biConsumerDivision = (a, b) ->{
            System.out.println("Division is: " + a/b);
        };
        biConsumerMultiply.andThen(biConsumerDivision).accept(16, 4);

        System.out.println("----------------------------------------");
        printStudentNameAndActivitiesUsingBiConsumer();
    }
}
