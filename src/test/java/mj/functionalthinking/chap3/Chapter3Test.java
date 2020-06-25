package mj.functionalthinking.chap3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.internal.util.collections.ListUtil.filter;

class Chapter3Test {

    @Test
    void appleTest() {
        List<Apple> apples = new ArrayList<>();;
        Apple ap1 = new Apple(300);
        Apple ap2 = new Apple(200);
        Apple ap3 = new Apple(100);
        apples.add(ap1);
        apples.add(ap2);
        apples.add(ap3);
        System.out.println(apples);
        apples.sort(Comparator.comparing(Apple::getPrice));
        System.out.println(apples);
    }

    @Test
    void functionTest() {
        Function<String, Integer> stringToInteger =
                (String s) -> Integer.parseInt(s);
    }
}