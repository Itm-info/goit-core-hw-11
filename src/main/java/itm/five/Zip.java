package itm.five;

import java.util.*;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Zip {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {

        Iterator<T> i1 = first.iterator();
        Iterator<T> i2 = second.iterator();
        Iterable<List<T>> i = ()->new Iterator<List<T>>() {
            @Override
            public boolean hasNext() {
                return i1.hasNext() && i2.hasNext();
            }
            @Override
            public List<T> next() {
                return Arrays.asList(i1.next(), i2.next());
            }
        };

        return StreamSupport.stream(i.spliterator(), false).flatMap(couple -> couple.stream());
    }
}
