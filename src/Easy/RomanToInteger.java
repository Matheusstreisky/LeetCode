package Easy;

import java.util.Map;

public class RomanToInteger {

    private static final Map<Character, Integer> ROMAN_NUMERALS = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );

    public int romanToInt(String s) {
        int total = 0;

        for (int i = s.length()-1; i >= 0; i--) {
            int currentValue = ROMAN_NUMERALS.get(s.charAt(i));

            if (i > 0) {
                int previusValue = ROMAN_NUMERALS.get(s.charAt(i-1));

                if (previusValue < currentValue) {
                    total -= previusValue;
                    i--;
                }
            }

            total += currentValue;
        }

        return total;
    }

//    ORIGINAL SOLUTION
//
//    public int romanToInt(String s) {
//        int total = 0;
//
//        for (int i = s.length()-1; i >= 0; i--) {
//            int currentValue = RomanNumerals.valueOf(String.valueOf(s.charAt(i))).getValue();
//
//            if (i > 0) {
//                int previusValue = RomanNumerals.valueOf(String.valueOf(s.charAt(i-1))).getValue();
//
//                if (previusValue < currentValue) {
//                    total -= previusValue;
//                    i--;
//                }
//            }
//
//            total += currentValue;
//        }
//
//        return total;
//    }
//
//    enum RomanNumerals {
//        I(1), V(5), X(10), L(50), C(100), D(500), M(1000);
//
//        private final Integer value;
//
//        RomanNumerals(Integer value) {
//            this.value = value;
//        }
//
//        public Integer getValue() {
//            return value;
//        }
//    }
}
