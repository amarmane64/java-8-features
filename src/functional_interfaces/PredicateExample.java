package functional_interfaces;

import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Integer> predicate1 = (number) -> number % 2 == 0;
    static Predicate<Integer> predicate2 = (number) -> number % 5 == 0;

    public static void predicateAND() {
        System.out.println("Predicate AND result for 10: " + predicate1.and(predicate2).test(10));
        System.out.println("Predicate AND result for 8: " + predicate1.and(predicate2).test(8));

    }
    public static void predicateNegate() {
        System.out.println("Predicate AND result for 10: " + predicate1.and(predicate2).negate().test(10));

    }
    public static void predicateOR() {
        System.out.println("Predicate OR result for 10: " + predicate1.or(predicate2).test(10));
        System.out.println("Predicate OR result for 8: " + predicate1.or(predicate2).test(8));
        System.out.println("Predicate OR result for 7: " + predicate1.or(predicate2).test(7));

    }

    public static void main(String[] args) {

        System.out.println(predicate1.test(41));
        predicateAND();
        predicateOR();
        predicateNegate();
    }
}
