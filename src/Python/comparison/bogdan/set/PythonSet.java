package python.comparison.bogdan.set;

import com.google.common.collect.Lists;

import java.util.*;

import static helpers.Helpers.*;
import static helpers.coloredString.Logger.printMessage;

public class PythonSet {
    public static void main(String[] args) {
//        Множество из mutable элементов
//        program_1();
//                Пересечение/Разница/Объединение
//        Объединение, пересечение, разница, симм. разница
//        program_2();
//
        program_3();
        //        program_4();
        //        program_5();
        //        program_6();
        //        program_7();
        //        program_8();
        //        program_9();
    }

    private static void program_1() {
        printSection("Program_1. Прочее...");

        List<String> strs = new ArrayList<>(List.of("max", "min", "wind"));

        List<Integer> lengths = Lists.transform(strs, String::length);
        System.out.println("lengths = " + lengths);

        Set<Integer> ints = new HashSet<>(Set.of(10, 20, 30));

        printSubSection("Добавление immutable элементов в список");
        {
            Set<List<Integer>> imms = new HashSet<>();
            List<Integer> list1 = new ArrayList<>(List.of(10, 20, 30));
            List<Integer> list2 = new ArrayList<>(List.of(10, 15, 20));

            imms.add(list1);
            imms.add(list2);

            System.out.println("list1 = " + list1);
            System.out.println("list2 = " + list2);
            System.out.println("imms = " + imms);

            list1.add(40);
            imms.add(list1);

            System.out.println("list1 = " + list1);
            System.out.println("list2 = " + list2);
            System.out.println("imms = " + imms);
        }

        printSectionEnding();
    }

    private static void program_2() {
        printSection("Program_2. Объединение, пересечение, разница, симм. разница");

        printMessage("Исходные множества:");
        Set<Integer> set1 = new HashSet<>(Set.of(10, 15, 20));
        Set<Integer> set2 = new HashSet<>(Set.of(15, 20, 40));
        System.out.println("set1 = " + set1);
        System.out.println("set2 = " + set2);

        printSection("Объединение множеств - union()");
        {
            Set<Integer> total = new HashSet<>(set1);
            total.addAll(set2);
            System.out.println("total = " + total);
        }

        printSection("Разница между множествами - difference()");
        {
            Set<Integer> total = new HashSet<>(set1);
            total.removeAll(set2);
            System.out.println("total = " + total);
        }

        printSection("Пересечение множеств - intersection()");
        {
            Set<Integer> total = new HashSet<>(set1);
            total.retainAll(set2);
            System.out.println("total = " + total);
        }

        printSection("Симметричная разница - symmetric_difference");
        {
            Set<Integer> union = new HashSet<>(set1);
            union.addAll(set2);

            Set<Integer> intersection = new HashSet<>(set1);
            intersection.retainAll(set2);

            Set<Integer> difference = new HashSet<>(union);
            difference.removeAll(intersection);

            System.out.println("difference = " + difference);
        }

        printSection("");
        {
            Set<Integer> total = new HashSet<>(set1);
        }

        printSectionEnding();
    }

    private static void program_3() {
        printSection("Program_3. ");

        Set<String> strs = new LinkedHashSet<>();

        strs.add("Main");
        strs.add("Difficult");

        System.out.println("strs = " + strs);

        System.out.println("Set.copyOf(strs) = " + Set.copyOf(strs));

        printSectionEnding();
    }
}
