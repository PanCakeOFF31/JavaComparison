package python.comparison.bogdan.imutable;

import java.util.ArrayList;
import java.util.List;

import static helpers.Helpers.printSection;
import static helpers.Helpers.printSectionEnding;

public class PythonImmutableObject {
    public static void main(String[] args) {
//        program_1();
//        program_2();
//        program_3();
        //        program_4();
        //        program_5();
        //        program_6();
        //        program_7();
        //        program_8();
        //        program_9();
    }

    private static void program_1() {
        printSection("Program_1. Immutable objects");

        final String str1 = "maxim";
        final String str2 = "maxim";
        final String str3 = str1;
        String immStr = str1;

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        System.out.printf("Сравнение по ссылке : str1(%s) == str2(%s): %b\n", str1, str2, str1 == str2);


        printSectionEnding();
    }

    private static void program_2() {
        printSection("Program_2. Shallow copy");

        List<String> list1 = new ArrayList<>() {{
            add("maxim");
            add("wild");
            add("nigh");
        }};

        List<String> list2 = new ArrayList<>(list1);

        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
        System.out.println("list1 == list2 - " + (list1 == list2));

        int a = 10, b = 20;
        System.out.println(a + "" + b);

        printSectionEnding();
    }

    private static void program_3() {
        printSection("Program_3. Глубокое копирование");

        String str1 = "maxim";
        Object object = new Object();

        MyClass myClass1 = new MyClass();
        MyClass myClass2 = myClass1.clone();

        List<String> list1 = new ArrayList<>() {{
            add("maxim");
            add("yandex");
            add("dollar");
        }};

        List<String> list2 = (List<String>) ((ArrayList) list1).clone();

        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
        System.out.println("list1 == list2 - " + (list1 = list2));


        printSectionEnding();
    }

    private static class MyClass {
        @Override
        protected MyClass clone() {
            return null;
        }
    }

}
