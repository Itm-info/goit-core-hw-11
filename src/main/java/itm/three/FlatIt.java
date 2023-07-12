package itm.three;

import java.util.Arrays;

public class FlatIt {
    public static void flatIt(String[] strings) {
        System.out.println("\n3:");
        Arrays.stream(strings)
                .flatMap(s -> Arrays.stream(s.split(", ")) )
                .sorted()
                .forEach(System.out::println);
    }
}
