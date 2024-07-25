package js.comprison.datatypes;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

import static helpers.Helpers.printSection;
import static helpers.Helpers.printSectionEnding;

public class DataTypes {
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
        printSection("Program_1. Number/String representation");

        int number = Integer.parseInt("123456", 36);
        String result = Integer.toString(number, 2);
        System.out.println(number + " " + result);

        printSectionEnding();
    }

    private static void program_2() {
        printSection("Program_2. concat()");

        int[] ints1 = {10, 20};
        int[] ints2 = {10, 20};
        int[] total = ArrayUtils.addAll(ints1, ints2);
        System.out.println(Arrays.toString(total));

        printSectionEnding();
    }
}
