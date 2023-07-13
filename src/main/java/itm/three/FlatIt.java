package itm.three;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FlatIt {
    public static String flatIt(String[] strings) {
        return Arrays.stream(strings)
                .flatMap(s -> Arrays.stream(s.split(", ")) )
                .sorted()
                .collect(Collectors.joining(", "));
    }
}
