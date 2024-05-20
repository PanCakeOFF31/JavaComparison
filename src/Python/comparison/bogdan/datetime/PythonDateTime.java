package python.comparison.bogdan.datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;

import static helpers.Helpers.printSection;
import static helpers.Helpers.printSectionEnding;

public class PythonDateTime {
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
        printSection("Program_1. LocalDateTime");

        {
//            LocalDateTime localDateTime = LocalDateTime.of
//            Duration duration = Duration.of;
//            Period period;
            System.out.println("LocalDateTime.now() = " + LocalDateTime.now());
            System.out.println(LocalDateTime.ofInstant(Instant.now(), ZoneId.of("UTC")));
            System.out.println(LocalDateTime.now(ZoneId.of("UTC")));

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy:::MM___dd");
            System.out.println(LocalDateTime.now().format(formatter));
        }

        printSectionEnding();
    }
}
