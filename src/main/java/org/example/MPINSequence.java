package org.example;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MPINSequence {
    public static void main(String[] args) {
        List<String> inputs =
                Arrays.asList("111111", "123456", "987654"
                        , "888888", "098764", "0123467"
                        , "135801", "026843", "963501");

        Map<String, Boolean> resultMap = new LinkedHashMap<>();
        for (String pin : inputs) {
            for (int i = 0; i < pin.length() - 1; i++) {
                resultMap.put(pin, true);
                int digit = Integer.parseInt(String.valueOf(pin.charAt(i)));
                int nextDigit = Integer.parseInt(String.valueOf(pin.charAt(i + 1)));
                if (digit >= nextDigit - 1 && digit <= nextDigit + 1) {
                    resultMap.put(pin, false);
                    break;
                }
            }
        }

        System.out.println(resultMap);
    }
}
