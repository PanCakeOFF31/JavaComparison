package Python.comparison.map;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static helpers.Helpers.*;

public class PythonMap {
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
        printSection("Program_1. dic vs Map");

        Set<Bike> bikes = new HashSet<>() {{
            add(new Bike(1, "Ducati", 25000, 1.259));
            add(new Bike(2, "Ducati", 25000, 1.259));
        }};

        {
            System.out.println(new HashMap<>().equals(new HashMap<>()));
        }

        printSubSection("");
        {
            Map<String, String> map = new HashMap<>();

            map.put("first", "random  value");

            System.out.println("map = " + map);
//            boolean result = map.remove("asd", 10);
//            map.cont

        }

        printSectionEnding();
    }

    @Data
    @Builder
    private static class Bike {
        @EqualsAndHashCode.Include
        private int id;
        @EqualsAndHashCode.Include
        private String brand;
        @EqualsAndHashCode.Include
        private Integer price;
        @EqualsAndHashCode.Include
        private Double engineVolume;
    }
}
