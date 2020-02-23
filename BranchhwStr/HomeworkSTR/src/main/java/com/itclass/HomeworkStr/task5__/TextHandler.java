package com.itclass.HomeworkStr.task5__;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextHandler {

    private Pattern pattern;
    private Matcher matcher;
    private final String endOfSentenceRegex = "(\\.|\\!|\\?)\\s(-*)";
    private final String countPunctuationRegex = "(\\.|\\!|\\?|\\:|\\,|\\-)\\s(-*)";
    private final String countSentencesRegex = "([А-ЯA-Z]((т.п.|т.д.|пр.)|[^?!.\\(]|\\([^\\)]*\\))*[.?!])";

    public String toUpperCase (String text) {
        pattern = Pattern.compile(endOfSentenceRegex);
        matcher = pattern.matcher(text);
        char[] textArray = text.toCharArray();
        textArray[0] = Character.toUpperCase(textArray[0]);
        int offset;
        while(matcher.find()) {
            offset = matcher.end();
            textArray[offset] = Character.toUpperCase(textArray[offset]);
        }
        return new String(textArray);
    }

    public int count(String text, String regex) {
        int amount = 0;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()) {
            amount++;
        }
        return amount;
    }
}