package python.comparison.nichola.part_1.ch_3_strings;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static helpers.Helpers.printSection;
import static helpers.Helpers.printSectionEnding;

public class Chapter_3 {
    public static void main(String[] args) {
        program_1();
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
        printSection("Program_1. title()");

        String text = "RemoVEs eXTra characters";
        System.out.println("text = " + text);

        printSection("capitalize()");
        {
            String capitalized = StringUtils.capitalize(text);
            System.out.println("capitalized = " + capitalized);
        }

        printSection("matches count");
        {
            int matches = StringUtils.countMatches(text, 'e');
            System.out.println("matches = " + matches);
        }

        printSection("title()");
        {
        String titled = title(text);
        System.out.println("titled = " + titled);
        }

        printSection("swapcase()");
        {
            String name = "МакСиМка";
            System.out.println("name = " + name);
            System.out.println(StringUtils.swapCase(name));
            System.out.println(StringUtils.swapCase(""));
        }


        printSectionEnding();
    }

    private static String title(final String text) {
        final String[] splitted = StringUtils.split(text, " ");

        List<String> words = Arrays.stream(splitted)
                .map(StringUtils::capitalize)
                .toList();

        return String.join(" ", words);
    }
}
