package com.maxtechnicaltraining;

public class Main {

    static String RemoveFromString(String original, String charsToReplace, String replaceWith) {
        // the sentence
        StringBuilder sentence = new StringBuilder(original);
        String vowels = charsToReplace;
        for(int idx = 0; idx < sentence.length(); idx++) {
            if(vowels.contains(sentence.substring(idx, idx+1).toLowerCase())) {
                sentence.replace(idx, idx+1, replaceWith);
            }
        }
        return sentence.toString();
    }
    public static void main(String[] args) {
        // the sentence
        String sentence = "The Quick Brown Fox Jumped Over The Log.";
        String charsToReplace = "aeiouy";
        String replaceWith = "_";
        String newSentence = RemoveFromString(sentence, charsToReplace, replaceWith);
        System.out.println(newSentence);
    }
}
