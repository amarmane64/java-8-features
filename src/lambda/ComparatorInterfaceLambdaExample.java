package lambda;

import java.util.Comparator;

public class ComparatorInterfaceLambdaExample {
    public static void main(String[] args) {

        // without lambda function
        Comparator<Integer> comparator1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println("Result of 1 and 3 is: "+ comparator1.compare(3, 1));

        // with lambda function

        Comparator<Integer> comparator2 = (a, b) -> a.compareTo(b);
        System.out.println("Result of 1 and 3 is: "+ comparator1.compare(3, 1));

    }
}
