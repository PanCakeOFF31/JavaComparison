package python.comparison.bogdan.operator;

import lombok.Data;

import static helpers.Helpers.printSection;
import static helpers.Helpers.printSectionEnding;

public class PythonOperator {
    public static void main(String[] args) {
//        program_1();
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
        printSection("Program_1. Операторы is, ==");

        Car car1 = new Car(100);
        Car car2 = new Car(100);

//        is
        System.out.println(car1 == car2);
//        ==
        System.out.println(car1.equals(car2));
        car1.canEqual(car2);

        printSectionEnding();
    }

    @Data
    private static class Car {
        private final int power;
    }

    private static void program_2() {
        printSection("Program_2. Унарные и бинарные операторы");

        System.out.println(Boolean.valueOf("1"));
        System.out.println(Boolean.valueOf("true"));
        System.out.println(Boolean.valueOf("T"));

        printSectionEnding();
    }
}
