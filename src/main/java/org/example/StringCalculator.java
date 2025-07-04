package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringCalculator {
    public static int add(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        // Parse delimiter and remaining input
        DelimiterParseResult parseResult = parseDelimiter(input);
        final String DELIMITER = parseResult.delimiterRegex;
        final String numbersSection = parseResult.numbersSection;
        String[] numbersArray = numbersSection.split(DELIMITER);
        int sumOfArray = 0;
        List<Integer> negativesNums = new ArrayList<>();
        for (String number : numbersArray) {
            if (number.trim().isEmpty()) {
                continue;
            }
            int num = Integer.parseInt(number.trim());
            if (num < 0) {
                negativesNums.add(num);
            }
            if (num <= 1000) {
                sumOfArray += num;
            }
        }
        if (!negativesNums.isEmpty()) {
            throw new IllegalArgumentException(
                    "Negatives not allowed: [" +
                            negativesNums.stream()
                                    .map(String::valueOf)
                                    .collect(Collectors.joining(",")) +
                            "]"
            );
        }

        return sumOfArray;
    }
    // Helper class to hold delimiter and numbers section.
    private static class DelimiterParseResult {
        final String delimiterRegex;
        final String numbersSection;

        DelimiterParseResult(String delimiterRegex, String numbersSection) {
            this.delimiterRegex = delimiterRegex;
            this.numbersSection = numbersSection;
        }
    }
    // Parses the delimiter from the input string if present, otherwise uses default.
    private static DelimiterParseResult parseDelimiter(String input) {
        String delimiterRegex = "[,\n]";
        String numbersSection = input;

        if (input.startsWith("//")) {
            int delimiterEnd = input.indexOf('\n');
            String delimiterSection = input.substring(2, delimiterEnd);

            // Match all delimiters inside []
            Matcher matcher = Pattern.compile("\\[(.*?)]").matcher(delimiterSection);
            List<String> delimiters = new ArrayList<>();
            while (matcher.find()) {
                delimiters.add(Pattern.quote(matcher.group(1)));
            }
            if (!delimiters.isEmpty()) {
                delimiterRegex = String.join("|", delimiters);
            } else {
                delimiterRegex = Pattern.quote(delimiterSection);
            }
            numbersSection = input.substring(delimiterEnd + 1);
        }

        return new DelimiterParseResult(delimiterRegex, numbersSection);
    }
}
