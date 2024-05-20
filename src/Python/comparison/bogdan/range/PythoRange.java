package python.comparison.bogdan.range;

import com.google.common.collect.Interner;
import com.google.common.collect.Range;

import java.util.ArrayList;
import java.util.function.UnaryOperator;
import java.util.stream.*;
import java.util.zip.ZipEntry;

import static helpers.Helpers.*;

public class PythoRange {
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

        Range<Integer> ints = Range.openClosed(0, 6);
        System.out.println(ints);

        printSubSection("Итерирую от 0 до 9, с шагом 1");
        for (int i : IntStream.range(0, 10).toArray()) {
            System.out.println("i = " + i);
        }

        printSubSection("Итерация от 0 3 раза с шагом +3");
        for (int i : IntStream.iterate(0, v -> v + 3).limit(3).toArray()) {
            System.out.println("i = " + i);
        }


        printSectionEnding();
    }
}
