package com.hp.techprep;


import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*given a string for example -  "T926E51S200T4", alphabet followed by numerics. Output should be number sorted string like - "T4E51S200T926". Numerics can be any digits.
How will this be achieved in Java*/
public class StringSplitter {

    public static void main(String[] args) {
        String input = "T926E51S200T4";
        System.out.println(sortString(input));   // T4E51S200T926
    }


    public static String sortString(String input) {
        List<String[]> segments = new ArrayList<>();   // each entry: {letterPart, digitPart}

        Pattern pattern = Pattern.compile("([A-Za-z]+)(\\d+)");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            segments.add(new String[]{matcher.group(1), matcher.group(2)});
        }

        // sort by the NUMERIC value of the digit part -- not lexicographic string order

        segments.sort((a, b) -> Long.compare(Long.parseLong(a[1]), Long.parseLong(b[1])));

        StringBuilder result = new StringBuilder();
        for (String[] seg : segments) {
            result.append(seg[0]).append(seg[1]);
        }

        return result.toString();
    }
}
