package python.comparison.mark.part_2_types_operations.ch_5_numeric_types;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static helpers.Helpers.printSection;
import static helpers.Helpers.printSectionEnding;

public class Chapter_5 {
    public static void main(String[] args) {
//        Конвертация чисел за счет radix
//        program_1();
//        Математические методы округления
//        program_2();
//        set comparison
//        program_3();
//        Decimal Fraction - BigDecimal
//        program_4();
//                Unlimited-precision number - BigInteger
//        program_5();
        program_6();
        //        program_7();
        //        program_8();
        //        program_9();
    }

    private static void program_1() {
        printSection("Program_1. Конвертация чисел в СС");

        System.out.println(Integer.valueOf("21", 3));
        System.out.println(Integer.toHexString(213));
        int a = 10;
        int b = 0x10;
        int c = 077;  // 0o77 в Python
        int d = 0b10;


        printSectionEnding();
    }

    private static void program_2() {
        printSection("Program_2. Математические метода округления");

        final double a = 144.34D;
        System.out.println(Math.floor(a));
        System.out.println(Math.ceil(a));
        System.out.println(Math.round(a));
        System.out.println((int) a);

        printSectionEnding();
    }

    private static void program_3() {
        printSection("Program_3. set comparison");

        Set<Integer> set1 = new HashSet<>(List.of(10, 20, 20, 20, 30, 40, 15, 16, 13, 12, 69, 53, 5, 49, 94));
        Set<Integer> set2 = new HashSet<>(List.of(40, 20, 10, 30, 15, 15, 16, 13, 12, 69, 53, 5, 49, 94));

        System.out.println("set1 = " + set1);
        System.out.println("set2 = " + set2);

//        System.out.println("Сравнение set1 с set2 даст \{set1.equals(set2)}");

        printSectionEnding();
    }

    private static void program_4() {
        printSection("Program_4. Decimal and Fraction");

        BigDecimal decimal1 = new BigDecimal("10.25");
        BigDecimal decimal2 = new BigDecimal("2.44");

        System.out.println(decimal1.add(decimal2));

        printSectionEnding();
    }

    private static void program_5() {
        printSection("Program_5. Unlimited-precision integer");

        BigInteger big1 = new BigInteger("12949128359021380956809236408123364");
        BigInteger big2 = new BigInteger("10000000000");

        System.out.println("big1 = " + big1);
        System.out.println("big2 = " + big2);

        BigInteger result = new BigInteger("2").pow(10);
        System.out.println("result = " + result);

        System.out.println(big1.multiply(big2));
        System.out.println(big1.pow(1000).toString().length());

        printSectionEnding();
    }

    private static void program_6() {
        printSection("Program_6. Shared references");

        int a = 10;
        int b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = 16;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = 29;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        printSectionEnding();
    }
}
