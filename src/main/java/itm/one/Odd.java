package itm.one;

import java.util.List;
import java.util.stream.Collectors;



public class Odd {
    public static String odd(List<String> list) {
        String res = list
                .stream()
                .map((e) -> list.indexOf(e) %2 == 0 ? list.indexOf(e)+1 + ". " + e + ", " : "")
                .collect(Collectors.joining());

        return res.length()>0 ? res.substring(0, res.length()-2) : res;
    }
}
