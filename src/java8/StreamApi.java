package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * Stream api => it is sequence of object and that have many methods
 *              we are combining that methods and producing desire result
 *  types-> sequential and parallel(multithreading)
 *
 *  operations -> terminal and intermediate
 *
 *  terminal -> forEach(Consumer),reduce(),collect()
 *  intermediate -> map(Function),filter(Predicate),sorted()
 */
public class StreamApi {

    public static void main(String[] args) {

        Function<String,Integer> length = s->s.length();

        System.out.println(length.apply("Welcome"));

        Function<Integer,Integer> add = s->s+10;
//        System.out.println(add.apply(10));

        Function<Integer,Integer> multi = s->s*2;
//        System.out.println(multi.apply(10));

        Function<Integer,Integer> res = add.andThen(multi);
        System.out.println(res.apply(10));

        Function<Integer,Integer> res1 = add.compose(multi);
        System.out.println(res1.apply(10));

        Function<Integer,Integer> ide = Function.identity();
        System.out.println(ide.apply(9));

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);

        Function<Integer,Integer> function = f->f*2;

        list.stream().map(function).collect(Collectors.toSet());

        Predicate<Integer> predicate = p->p>5000;

        System.out.println(predicate.test(1000));

        Predicate<Integer> even = p->p%2==0;
        System.out.println(even.test(4));

        Predicate<Integer> greaterThan5 = p->p>5;

        list.stream().filter(greaterThan5).forEach(System.out::println);

        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        List<Integer> list1 = Arrays.asList(1,23,4,5,5,5);

        Optional<Integer> t =  list1.stream().reduce((Integer integer, Integer integer2)-> {
                return integer+integer2;
        });

        System.out.println(t.get());

        List<String> strings = Arrays.asList("India","Pakistan","ShriLanka","Americaiooo");

        Optional<String> s = strings.stream().reduce((w1,w2)->w1.length()>w2.length()?w1:w2);
        System.out.println(s.get());

    }
}
