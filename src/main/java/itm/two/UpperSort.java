package itm.two;

import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collector;

public class UpperSort {
    public static String upperSort(List<String> list){
        Collector<String, StringJoiner, String> namesCollector =
                Collector.of(
                        () -> new StringJoiner(" "),
                        (name1, name2) -> name1.add(name2),
                        (name1, name2) -> name1.merge(name2),
                        StringJoiner::toString);

        String names = list
                .parallelStream()
                .map(name -> name.substring(2, name.length()).toUpperCase())
                .sorted()
                .collect(namesCollector);

        return names.strip();
    }
}
