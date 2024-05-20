package python.comparison.mark.part_2_types_operations.ch_4_intro_py_obj_types;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static helpers.Helpers.printSection;
import static helpers.Helpers.printSectionEnding;

public class Chapter4 {
    public static void main(String[] args) {
//        delimiter.join()
//        program_1();
//        Unicode code points
//                program_2();
        program_3();
        //        program_4();
        //        program_5();
        //        program_6();
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
}
