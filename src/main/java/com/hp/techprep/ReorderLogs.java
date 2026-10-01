package com.hp.techprep;


/*
Given an array of logs, where each log is a space-delimited string with an identifier as the first word. The logs are categorized into:
Letter-logs: containing words with lowercase letters after the identifier
Digit-logs: containing only digits after the identifier
Reorder these logs so that:
All letter-logs come before digit-logs
Letter-logs are sorted lexicographically by their content, and ties are broken by their identifiers
Digit-logs maintain their relative ordering
Example 1:
Input:
logs = ["dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"]
Output:
        ["let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6"]
Example 2:
Input:
logs = ["a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"]
Output:
        ["g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"]*/


import java.util.Arrays;

public class ReorderLogs {
    public static void main(String[] args) {
        String[] logs1 = {"dig1 8 1 5 1", "let1 art can", "dig2 3 6",
                "let2 own kit dig", "let3 art zero"};
        System.out.println(Arrays.toString(reorderLogFiles(logs1)));

        String[] logs2 = {"a1 9 2 3 1", "g1 act car", "zo4 4 7",
                "ab1 off key dog", "a8 act zoo"};
        System.out.println(Arrays.toString(reorderLogFiles(logs2)));
    }

    public static String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, (log1, log2) -> {
            String[] split1 = log1.split(" ", 2);
            String[] split2 = log2.split(" ", 2);

            boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
            boolean isDigit2 = Character.isDigit(split2[1].charAt(0));

            if (!isDigit1 && !isDigit2) {
                int cmp = split1[1].compareTo(split2[1]);
                if (cmp != 0) return cmp;
                return split1[0].compareTo(split2[0]);
            }

            if (isDigit1 && isDigit2) return 0;

            return isDigit1 ? 1 : -1;
        });

        return logs;
    }

}
