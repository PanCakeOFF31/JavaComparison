package python.comparison.mark.part_2_types_operations.ch_7_string_fundamentals;

import org.apache.commons.lang3.StringUtils;

import static helpers.Helpers.printSection;
import static helpers.Helpers.printSectionEnding;

public class Chapter_7 {
    public static void main(String[] args) {
        program_1();
        program_2();
        //        program_3();
        //        program_4();
        //        program_5();
        //        program_6();
        //        program_7();
        //        program_8();
        //        program_9();
    }

    private static void program_1() {
        printSection("Program_1. .replace()");

        String str = "aa&bb&cc&dd";
        System.out.println("str = " + str);

        String replaced = StringUtils.replace(str, "&", "_SPAM_", 1);
        System.out.println("replaced = " + replaced);

        replaced = StringUtils.replace(str, "&", "_SPAM_", 2);
        System.out.println("replaced = " + replaced);

        replaced = StringUtils.replace(str, "&", "_SPAM_", -1);
        System.out.println("replaced = " + replaced);

        printSectionEnding();
    }

    private static void program_2() {
        printSection("Program_2. StringBuilder - mutable sequence of character");

//        System.getenv().forEach((a, b) -> System.out.println(a + ": " + b));
//
        StringBuilder buidler = new StringBuilder();


        printSectionEnding();
    }
}
