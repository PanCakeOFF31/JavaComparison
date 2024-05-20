package python.comparison.bogdan.base;

import java.util.*;

import static helpers.Helpers.*;

public class PythonBase {
    public static void main(String[] args) {
        printArticle("Java vs Other Programming Language");

//        Форматирование целых чисел
//        program_1();
//        Операции с множествами
//        program_2();
//        input()
//        program_3();
//        Аргументы переменной длины
//        program_4();
//        Оператор присваивания в Python - инструкция
//        program_5();
//        Mutable and Immutable types
//        program_6();
//        String method and manipulation
//        program_7();
//        Целые числа
//        program_8();
//        String splitting/joining
//        program_9();
//        program_10();
        program_11();

        printArticleEnding();
    }

    private static void program_1() {
        printSection("Program_1. python. Форматирование целых чисел с выводом");

        int number;

        number = 0x1f;
        System.out.println(Integer.toString(0x1f, 16));
        System.out.println("number = " + number);

        number = 0b010101010;
        System.out.println(Integer.toOctalString(0b010101010));
        System.out.println("number = " + number);

        number = 077;
        System.out.println("number = " + number);


        printSectionEnding();
    }

    private static void program_2() {
        printSection("Program_2. Операции с множествами");

        Collection<String> playlist1 = new HashSet<>() {{
            add("Голубой");
            add("Облака");
            add("Yesterday");
            add("Лето");
        }};

        Collection<String> playlist2 = new HashSet<>() {{
            add("Голубой");
            add("Облака");
            add("Лето");
        }};

        playlist1.removeAll(playlist2);
        System.out.println("playlist1 = " + playlist1);

        Map<Integer, String> dic = new HashMap<>();

        printSectionEnding();
    }

    private static void program_3() {
        printSection("Program_3. Scanner vs input()");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your name");
        String name = scanner.next();
        System.out.println("Your name is: " + name);

        printSectionEnding();
    }

    private static void program_4() {
        printSection("Program_4. Variable length arguments");

        foo(10, 20, 30);

        printSectionEnding();
    }

    private static void foo(int first, int... second) {
        System.out.println(first + Arrays.toString(second));
    }

    private static void program_5() {
        printSection("Program_5. Statement/Expression");

//        Assignment operator
        int a = 10;

        System.out.println(a = 20);
        System.out.println(a);

        printSectionEnding();
    }

    private static void program_6() {
        printSection("Program_6. Mutable and Immutable types");

        printSubSection("Mutable variable");
        {
            List<Integer> list = new ArrayList<>();

            list.add(10);
            list.add(20);
            list.add(30);

            var other_list = list;
            other_list.add(40);


            System.out.println("list = " + list);
            System.out.println("other_list = " + other_list);
        }
        printSectionEnding();


        printSubSection("Immutable variable");
        {
            List<Integer> list = List.of(10, 20, 30);
            System.out.println("list = " + list);
            list.add(40);
        }
        printSectionEnding();
    }

    private static void program_7() {
        printSection("Program_7. Strings");

        String example = "Исходная строка";

        printSubSection("Базовые махинации");
        {
            System.out.println("example = " + example);
            System.out.println("Длина строки: " + example.length());
            System.out.println("Первый элемент: " + example.charAt(0));
            System.out.println("Последний элемент: " + example.charAt(example.length() - 1));
            System.out.println("Подстрока: " + example.substring(1, 3));
            System.out.printf("Строка форматирования - '%s'\n", example);
        }

        printSubSection("Методы строк в сравнении с Python");
        {
//            upper()
            System.out.println("Строка в верхнем регистре: " + example.toUpperCase());
//            lower()
            System.out.println("Строка в нижнем регистре: " + example.toLowerCase());
//            count()
//            replace()
            System.out.println(example.replace("о", "О"));
//            index()
            System.out.println(example.indexOf("р"));
            System.out.println(example.charAt(11));
//            capitalize()
        }

        printSubSection("Проверки строки на различное");
        {

        }

        printSectionEnding();
    }

    private static void program_8() {
        printSection("Program_8. Целые числа");

        final String str = "-0.1";

        if (isDigit(str)) {
            System.out.println(Integer.parseInt(str));
        } else {
            System.out.println("Строка не является числом: " + str);
        }

        if (isDigitRegex(str)) {
            System.out.println(Double.parseDouble(str));
        } else {
            System.out.println("Строка не является числом: " + str);
        }

        printSubSection("Длина строки на основе символов");
        {
            String full = "Maxim   m";
            System.out.println(characterLength(full));
        }

        printSectionEnding();
        System.exit(100);
    }

    private static boolean isDigit(final String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isDigitRegex(final String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    private static int characterLength(String origin) {
        origin = origin.trim();
        StringBuilder builder = new StringBuilder(origin.length());

        for (char c : origin.toCharArray()) {
            if (Character.isAlphabetic(c))
                builder.append(c);
        }

        return builder.toString().length();
    }

    private static void program_9() {
        printSection("Program_9. String split()/join()");

        String origin = "Большая исходная строка";

        System.out.println("origin = " + origin);
        System.out.println(Arrays.toString(origin.split(" ")));
        System.out.println(String.join("_,", origin.split(" ")));


        printSectionEnding();
    }

    private static void program_10() {
        printSection("Program_10. Аргументы переменной длины");

        vla("maxim", "max");

        vlad(new String[]{"maxim", "max"});
        vlad(new String[]{"maxim", "max"}, new String[]{"cola", "german"});

        printSectionEnding();
    }

    private static void vla(String... values) {
        System.out.println(Arrays.toString(values));
    }

    private static void vlad(String[]... values) {
        System.out.println(Arrays.deepToString(values));
    }

    private static int a = 10;

    private static void program_11() {
        printSection("Program_11. Scopes");

        int a = 10;
        PythonBase.a = 20;

        System.out.println(STR."a = \{a}");
        System.out.println(STR."PythonBase.a = \{PythonBase.a}");

        printSectionEnding();
    }
}
        
