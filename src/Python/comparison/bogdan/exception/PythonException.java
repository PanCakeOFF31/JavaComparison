package python.comparison.bogdan.exception;

import java.util.Random;

import static helpers.Helpers.printSection;
import static helpers.Helpers.printSectionEnding;

public class PythonException {
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
        printSection("Program_1. Execution handling");

        RuntimeException e1 = new TestOne();
        RuntimeException e2 = new TestTwo();

        try {
            if (new Random().nextBoolean())
                throw e1;

            throw e2;
        } catch (TestOne | TestTwo e) {
            System.out.println(e.getClass());
        }

        printSectionEnding();
    }
}
