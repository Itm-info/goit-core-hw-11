package itm.one;

import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Integer.parseInt;

public class Odd {
    public static String odd(List<String> list) {
        return list
                .stream()
                .filter(name -> parseInt(name.substring(0, 1)) %2==1)
                .collect(Collectors.joining(", ", "", ""));
    }
}
