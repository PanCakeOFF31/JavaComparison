package rust.comparison;

import static helpers.Helpers.printSection;
import static helpers.Helpers.printSectionEnding;

public class RustComparison {
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
        printSection("Program_1. Looping through a collection with for");

        String[] strs = {"max", "min", "middle"};

        for (String str : strs) {
            System.out.println(str);
        }

        printSectionEnding();
    }
}
