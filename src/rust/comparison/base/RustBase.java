package rust.comparison.base;

import static helpers.Helpers.printSection;
import static helpers.Helpers.printSectionEnding;

public class RustBase {

    public static void main(String[] args) {

        // Затенение переменных
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
        printSection("Program_1. Variable shadowing");

//        В Java нельзя использовать затенение переменных
//        String var1 = "10asd";
//        int var1 = Integer.parseInt(var1);

        final int unshadowed = 44;
        final int shadowed = unshadowed;

        printSectionEnding();
    }

    private static void program_2() {
        printSection("Program_2. Typification");


        printSectionEnding();
    }
}
