package itm.four;

import java.util.stream.Stream;

public class LKG {

    public static Stream<Long> lkg(long a, long c, long m) {

        return Stream
                .iterate((long) 0, n -> (a * n + c) % m)
                .limit(10);
    }
}
