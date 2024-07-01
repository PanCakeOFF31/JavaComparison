package free;

import lombok.AllArgsConstructor;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.function.Supplier;

import static helpers.Helpers.printSection;
import static helpers.Helpers.printSectionEnding;

public class FreePractice {
    public static void main(String[] args) {
//        program_1();
//        program_2();
        program_3();
    }

    @AllArgsConstructor
    private class Table {
        private String name;

        String getDescriptionInstance() {
            return "Стол обычный, белый, компактный - " + this.name;
        }

        static String getDescription() {
            return "Стол обычный, белый, компактный";
        }
    }

    private static void program_1() {
        printSection("Program_1. ");

        Map<Integer, Supplier<String>> fns = new HashMap<>();

        Supplier<String> supplier1 = () -> "Generated string associated with key - 1";
        Supplier<String> supplier2 = () -> "Generated string associated with key - 2";
        Supplier<String> supplier3 = () -> "Generated string associated with key - 3";

        Table table1 = new FreePractice().new Table("Фригат");
        Supplier<String> supplier4 = Table::getDescription;
        Supplier<String> supplier5 = table1::getDescriptionInstance;

        fns.put(1, supplier1);
        fns.put(2, supplier2);
        fns.put(3, supplier3);
        fns.put(4, supplier4);
        fns.put(5, supplier5);

        for (Integer key : fns.keySet()) {
//            System.out.println(STR."Отработал метод \{key}");
            System.out.println("Отработал метод " + key);
            System.out.println(fns.get(key).get());
        }

        printSectionEnding();
    }

    private static void program_2() {
        printSection("Program_2. BinaryTree");

        TreeSet<Integer> tree1 = new TreeSet<>() {{
            add(3);
            add(2);
            add(1);
        }};

        TreeSet<Integer> tree2 = new TreeSet<>() {{
            add(3);
            add(1);
            add(2);
        }};

        System.out.println("tree1 = " + tree1);
        System.out.println("tree2 = " + tree2);
        System.out.println(tree1.equals(tree2));

        tree1.iterator().forEachRemaining(System.out::println);
        tree2.iterator().forEachRemaining(System.out::println);

        System.out.println(tree1.descendingSet());
        System.out.println(tree2.descendingSet());


        printSectionEnding();
    }

    private static void program_3() {
        printSection("Program_3. Task");

        var a1 = FreePractice.getInstance(); // A<Object>
        var a2 = FreePractice.<String>getInstance(); // A<String>

        printSectionEnding();
    }

    private static <T> A<T> getInstance() {
        return new A<>();
    }

    private static class A<T> {
        private final T field;

        public A() {
            this.field = null;
        }
    }
}
