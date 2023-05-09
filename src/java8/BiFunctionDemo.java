package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionDemo {

    public static void main(String[] args) {

        BiFunction<List<Integer>, Predicate<Integer>, List<Integer>> biFunction = ( integers, integerPredicate) -> {
            List<Integer> list1 = new ArrayList<>();
            for (Integer i : integers) {
                if (integerPredicate.test(i)) {
                    list1.add(i);
                }
            }
            return list1;
        };

        System.out.println(biFunction.apply(Arrays.asList(1, 2, 3, 4, 5),p->p%2==0));
    }
}
