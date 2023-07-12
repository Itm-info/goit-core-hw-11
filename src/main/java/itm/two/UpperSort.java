package itm.two;

import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collector;

public class UpperSort {
    public static String upperSort(List<String> list){
        Collector<String, StringJoiner, String> namesCollector =
                Collector.of(
                        () -> new StringJoiner(" "),
                        StringJoiner::add,
                        StringJoiner::merge,
                        StringJoiner::toString);

        String names = list
                .parallelStream()
                .map(name -> name.substring(2).toUpperCase())
                .sorted()
                .collect(namesCollector);

        return names.strip();
    }
}
