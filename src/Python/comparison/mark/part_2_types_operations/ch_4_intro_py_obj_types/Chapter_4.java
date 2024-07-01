package python.comparison.mark.part_2_types_operations.ch_4_intro_py_obj_types;

import com.google.common.collect.Lists;

import java.util.*;
import java.util.stream.IntStream;

import static helpers.Helpers.*;
import static java.util.AbstractMap.SimpleEntry;

public class Chapter_4 {
    public static void main(String[] args) {
//        delimiter.join()
//        program_1();
//        Unicode code points
//        program_2();
//        program_3();
//        substring
//        program_4();
//        collection occurrence counting
//        program_5();
//        generator
//        program_6();
//        zip()
//        program_7();
//        program_8();
//        program_9();
    }

    private static void program_1() {
        printSection("Program_1. join()");

        System.out.println(String.join("___", new String[]{"maxim", "pavel", "dynai"}));

        printSectionEnding();
    }

    private static void program_2() {
        printSection("Program_2. Unicode, code points");

        System.out.println("\u00A3");


        printSectionEnding();
    }

    private static void program_3() {
        printSection("Program_3. List comprehension");

        List<Integer> nums = List.of(10, 11, 3, 5);
        var result = nums.stream()
                .filter(num -> num % 2 == 1)
                .map(num -> {
                    List<Integer> list = new ArrayList<>(List.of(num, (int) Math.pow(num, 2)));
                    return list;
                })
                .toList();

        System.out.println("nums = " + nums);
        System.out.println("result = " + result);


        printSectionEnding();
    }

    private static void program_4() {
        printSection("Program_4. substring");

        String value = "March";

        Lists.charactersOf(value);
        String asd = STR."asd/{}";

        printSectionEnding();
    }

    private static void program_5() {
        printSection("Program_5. list counting");

//        Collections.frequency();

        printSectionEnding();
    }

    private static void program_6() {
        printSection("Program_6. generator from IntStream range");

        printSubSection("Генератор через стримы");
        {
            int[] ints = IntStream.range(0, 4)
                    .toArray();
            for (int i : ints) {
                System.out.println(i);
            }
        }

        printSubSection("Генератор через Iterable<Integer>");
        {
            Iterator<Integer> generated = new IntegerGenerator(5).iterator();

            generated.forEachRemaining(System.out::println);
            new IntegerGenerator(5).iterator().forEachRemaining(System.out::println);
        }

        printSectionEnding();
    }

    private static class IntegerGenerator implements Iterable<Integer> {
        private final int max;

        public IntegerGenerator(int max) {
            this.max = max;
        }

        Iterator<Integer> iterator = new Iterator<Integer>() {
            private int current = 0;

            @Override
            public boolean hasNext() {
                return current < max;
            }

            @Override
            public Integer next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }

                return current++ * 2;
            }
        };

        @Override
        public Iterator<Integer> iterator() {
            return iterator;
        }
    }

    private static void program_7() {
        printSection("Program_7. zip()");

        List<Integer> ints = List.of(1, 2, 3);
        List<String> strs = List.of("fast", "empty", "dropped");
        List<Boolean> booleans = List.of(true, false, true, false);

        var zip = zip(ints, strs);
        System.out.println("zip = " + zip);

        List<List<?>> zipped1 = multiZip(ints, strs, booleans);
        List<List<?>> zipped2 = zipper(strs, booleans, ints);

        System.out.println("zipped1 = " + zipped1);
        System.out.println("zipped2 = " + zipped2);

        System.out.println(zipped1.get(0).getClass());
        System.out.println(zipped1.get(0).get(0).getClass());
        System.out.println(zipped1.get(0).get(1).getClass());
        System.out.println(zipped1.get(0).get(2).getClass());

        printSectionEnding();
    }

    private static <T, U> List<Map.Entry<T, U>> zip(List<T> list1, List<U> list2) {
        List<Map.Entry<T, U>> zipped = new ArrayList<>();
        int minSize = Math.min(list1.size(), list2.size());

        for (int i = 0; i < minSize; i++) {
            zipped.add(new SimpleEntry<>(list1.get(i), list2.get(i)));
        }

        return zipped;
    }

    private static <T> List<List<?>> multiZip(List<? extends T>... lists) {
        List<List<?>> zippedList = new ArrayList<>();

        if (lists.length == 0)
            return zippedList;

        int minLength = Arrays.stream(lists)
                .mapToInt(List::size)
                .min()
                .orElseThrow(UnknownError::new);

        for (int i = 0; i < minLength; i++) {
            List<Object> row = new ArrayList<>();

            for (List<?> list : lists) {
                row.add(list.get(i));
            }

            zippedList.add(row);
        }

        return zippedList;
    }

    public static <T> List<List<?>> zipper(List<? extends T>... lists) {
        List<List<?>> zippedList = new ArrayList<>();
        if (lists.length == 0) {
            return zippedList;
        }

        // Находим размер самого короткого списка
        int minLength = Arrays.stream(lists)
                .mapToInt(List::size)
                .min()
                .orElse(0);

        for (int i = 0; i < minLength; i++) {
            List<Object> row = new ArrayList<>();
            for (List<? extends T> list : lists) {
                row.add(list.get(i));
            }
            zippedList.add(row);
        }

        return zippedList;
    }

    public static <T> List<List<T>> zipper1(List<? extends T>... lists) {
        List<List<T>> zippedList = new ArrayList<>();
        if (lists.length == 0) {
            return zippedList;
        }

        // Находим размер самого короткого списка
        int minLength = Arrays.stream(lists)
                .mapToInt(List::size)
                .min()
                .orElse(0);

        for (int i = 0; i < minLength; i++) {
            List<T> row = new ArrayList<>();
            for (List<? extends T> list : lists) {
                row.add(list.get(i));
            }
            zippedList.add(row);
        }

        return zippedList;
    }

    private static void program_8() {
        printSection("Program_8. types");

        System.out.println("" instanceof String);
//        System.out.println("" instanceof String);

        printSectionEnding();
    }
}
