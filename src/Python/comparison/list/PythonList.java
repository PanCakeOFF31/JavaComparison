package Python.comparison.list;

import com.google.common.collect.Lists;
import helpers.coloredString.Logger;

import java.util.*;

import static helpers.Helpers.*;

public class PythonList {
    public static void main(String[] args) {
//        Списки
//        program_1();
//        List String to List<Character>
//        program_2();
        program_3();
    }

    private static void program_1() {
        printSection("Program_10. List methods");

        List<String> origin = new ArrayList<>() {{
            add("Ветер");
            add("144");
            add("Аргумент");
            add("аргумент");
            add("аргумент");
            add("night-007");
        }};

        System.out.println("origin = " + origin);

        printSubSection("append()/insert()");
//        append() and insert()
        {
            List<String> copy = new ArrayList<>(origin);
            System.out.println("copy = " + copy);

            copy.add("Последний");
            copy.add(2, "в середине где-то");

            System.out.println("copy после add() = " + copy);
        }

        printSubSection("index()");
//        index()
        {
            List<String> copy = new ArrayList<>(origin);
            System.out.println("copy = " + copy);

            int headIndex = copy.indexOf("аргумент");
            int tailIndex = copy.lastIndexOf("аргумент");

            System.out.println("headIndex = " + headIndex);
            System.out.println("tailIndex = " + tailIndex);
        }

        printSubSection("count()");
//        count() - подсчет количества вхождений
        {
            List<String> copy = new ArrayList<>(origin);
            System.out.println("copy = " + copy);

            int count = Collections.frequency(copy, "аргумент");
            System.out.printf("Количество вхождений \'аругмент\' в списке = %d\n", count);
        }

        printSubSection("remove()/pop()");
//          remove(), pop()
        {
            List<String> copy = new ArrayList<>(origin);
            System.out.println("copy = " + copy);

            Logger.printMarkMessage("Удаление последнего элемента");
            copy.removeLast();
            System.out.println("copy = " + copy);

            Logger.printMarkMessage("Удаление 3 элемента с конца");
            copy.remove(copy.size() - 4);
            System.out.println("copy = " + copy);

            Logger.printMarkMessage("Удаление всех элементов по значению");
            copy.removeAll(Collections.singleton("аргумент"));
            System.out.println("copy = " + copy);

            Logger.printMarkMessage("Удаление элемента по значению");
            copy.remove("Ветер");
            System.out.println("copy = " + copy);
        }

        printSubSection("reverse()");
//
        {
            List<String> copy = new ArrayList<>(origin);
            System.out.println("copy = " + copy);

            Collections.reverse(copy);
            System.out.println("copy = " + copy);
        }

        printSubSection("");
//
        {
            List<String> copy = new ArrayList<>(origin);
            System.out.println("copy = " + copy);
        }

        printSubSection("Подсчет суммы списка");
//
        {
            List<String> copy = new ArrayList<>(origin);
            System.out.println("copy = " + copy);

            Optional<Integer> length = copy.stream()
                    .map(String::length)
                    .reduce(Integer::sum);

            System.out.println(length.orElse(0));

        }

        printSubSection("copy()/list()/[:]");
//
        {
            List<String> copy = new ArrayList<>(origin);
            System.out.println("copy = " + copy);

        }

        printSubSection("");
//
        {
            List<String> copy = new ArrayList<>(origin);
            System.out.println("copy = " + copy);

        }
        printSectionEnding();
    }

    private static void program_2() {
        printSection("Program_2. List String to List<Character>");

        String text = "some text";

//        1)
        List<Character> chars = new ArrayList<>();

        for (char c : text.toCharArray()) {
            chars.add(c);
        }

//        2)
        List<Character> chars_other = text.chars()
                .mapToObj(c -> (char) c)
                .toList();


//        3)
        List<String> chars_other_list = Arrays.asList(text.split(""));

        List<Character> chs = Lists.charactersOf(text);

        System.out.println("chars = " + chars);
        System.out.println("chars_other = " + chars_other);
        System.out.println("chars_other_list = " + chars_other_list);
        System.out.println("chs = " + chs);


        printSectionEnding();
    }

    private static void program_3() {
        printSection("Program_3. ");



        printSectionEnding();
    }
}
