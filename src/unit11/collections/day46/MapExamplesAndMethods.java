package unit11.collections.day46;

import java.util.HashMap;
import java.util.Map;

public class MapExamplesAndMethods {
    public static void main(String[] args) {
        Map<String, Integer>stringIntegerMap = new HashMap<>();
        Map<String, Integer>integerMap = new HashMap<>(Map.of("A",12,"T",61));
        System.out.println(integerMap);
        }
    }

