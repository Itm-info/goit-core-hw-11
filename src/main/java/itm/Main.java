package itm;


import itm.five.Zip;
import itm.four.LKG;
import itm.one.Odd;
import itm.three.FlatIt;
import itm.two.UpperSort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Bill", "Victor", "Ivan", "Vasyl");

        String[] nums = {"1, 2, 0", "4, 5"};

        // 1
        System.out.println("\n1: \n"+Odd.odd(names));

        // 2
        System.out.println(" \n2: \n"+UpperSort.upperSort(names));

        // 3
        System.out.println(" \n3: \n"+FlatIt.flatIt(nums));

        // 4
        System.out.println(" \n4:");
        LKG.lkg(25214903917L, 11, 2^48L).forEach(System.out::println);

        // 5
        System.out.println(" \n5:");
        Zip.zip(Stream.of("a","b","c","d"),Stream.of("1","3","5","7","9")).forEach(System.out::println);
    }
}