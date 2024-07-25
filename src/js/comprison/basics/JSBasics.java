package js.comprison.basics;

import java.util.function.BiConsumer;

import static helpers.Helpers.printSection;
import static helpers.Helpers.printSectionEnding;

public class JSBasics {
    public static void main(String[] args) {
//        program_1();
//        program_2();
//        program_3();
//        program_4();
//        program_5();
//        program_6();
        program_7();
        program_8();
        program_9();
    }

    private static void program_1() {
        printSection("Program_1. Variable declaration");

        int a = 10, b = 20;
        System.out.println(a + " " + b);

        printSectionEnding();
    }

    private static void program_2() {
        printSection("Program_2. ");

        int a = 10;
        int b = 10;
        double c = 10.5;

        // Сравнение по значению
        System.out.println(a == b);
        // Сравнению по значению с неявным приведением
        System.out.println(a == c);

        String str1 = "20";
        Object int1 = Integer.valueOf(20);
        // Сравнение по ссылке
        System.out.println(str1 == int1);

        String s1 = "20";
        String s2 = new String("20");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));


        printSectionEnding();
    }

    private static void program_3() {
        printSection("Program_3. Explicit type casting");

        System.out.println(Integer.parseInt("150") / Integer.parseInt("10"));

        printSectionEnding();
    }

    private static void program_4() {
        printSection("Program_4. Assignment statement-expression");

        int a;
        int b = a = 10;

        System.out.println(a);
        System.out.println(b);

        printSectionEnding();
    }

    private static void program_5() {
        printSection("Program_5. Ternary operator");

        System.out.println(true ? "yes" : "no");
        String a = true ? "yes" : "no";

        printSectionEnding();
    }

    private static void program_6() {
        printSection("Program_6. for-loop");

        asd:
        for (; ; ) {
            break asd;
        }

        printSectionEnding();
    }

    private static void program_7() {
        printSection("Program_7. switch");

        switch (10) {
            case 5:
                System.out.println();
                break;
            case 10:
                System.out.println();
                break;
            default:
        }

        switch (10) {
            case 5 -> System.out.println();
            case 10 -> System.out.println();
        }

        printSectionEnding();
    }

    private static void program_8() {
        printSection("Program_8. Lambda function");

        BiConsumer<Integer, Integer> supplier = (Integer a, Integer b) -> System.out.println();

        printSectionEnding();
    }

    private static void program_9() {
        printSection("Program_9. clone");

        A a1 = new A();
        A a2 = a1.clone();

        System.out.println(a1 == a2);
        System.out.println(a1);
        System.out.println(a2);

        System.out.println(a1 instanceof Cloneable);
        System.out.println(a1.getClass());

        printSectionEnding();
    }
}
