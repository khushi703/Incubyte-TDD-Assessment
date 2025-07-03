package org.example;

import java.util.Objects;

public class StringCalculator {
    public static int add(String input) {
        if(Objects.equals(input, "")) {
            return 0;
        }
        return Integer.parseInt(input);
    }
}
