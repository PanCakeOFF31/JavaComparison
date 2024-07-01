package free;

import java.util.function.UnaryOperator;

import static helpers.Helpers.printSection;
import static helpers.Helpers.printSectionEnding;

public class FP {
    private int A = 10;

    public static void main(String[] args) {
        new Nested().a = 10;
        new FP().new Inner().a = 10;

        UnaryOperator<Integer> power = (v) -> v * v;
        Integer value = power.apply(10);

        program_1();
    }

    private static class Nested {
        private int a;

        private void doSome() {
            new FP().A = 10;
        }
    }

    private class Inner {
        private int a;
    }

    private static void program_1() {
        printSection("Program_1. loop label");

        int counter = 0;
        end:
        while (true) {
            ++counter;
            System.out.println(counter);

            while (true) {
                counter++;
                System.out.println(counter);

                if (counter >= 4)
                    break end;
            }
        }

        printSectionEnding();
    }
}
