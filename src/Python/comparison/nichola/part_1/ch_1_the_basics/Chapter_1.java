package python.comparison.nichola.part_1.ch_1_the_basics;


import java.util.Scanner;

import static helpers.Helpers.printSection;
import static helpers.Helpers.printSectionEnding;

public class Chapter_1 {
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
        printSection("Program_1. Challenge 1");

        Scanner input = new Scanner(System.in);
        System.out.print("Input a name: ");

        String name = input.nextLine();
        System.out.printf("Hello '%s'\n", name);

        input.close();
        printSectionEnding();
    }
}
