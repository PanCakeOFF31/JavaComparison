package js.comprison.advanced_fn;

import java.util.HashMap;
import java.util.Map;

import static helpers.Helpers.printSection;
import static helpers.Helpers.printSectionEnding;

public class AdvancedFn {
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
        printSection("Program_1. ");

        var map = new HashMap<>(Map.of(10, 10, 11, 20));
//        for (final Map.Entry<> of Map.of(10, 10, 11, 20));
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }

        printSectionEnding();
    }
}
