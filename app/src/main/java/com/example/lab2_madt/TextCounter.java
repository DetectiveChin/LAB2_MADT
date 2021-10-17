package com.example.lab2_madt;

public class TextCounter {
    public static int getCharsCount(String text) {
        return text.length();
    }

    public static int getWordsCount(String word) {
        int wordCount = 0;
        for (char letter = 'a'; letter <= 'z'; letter++) {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == letter) {
                    wordCount++;
                }
            }
        }

        for (char Letter = 'A'; Letter <= 'Z'; Letter++) {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == Letter) {
                    wordCount++;
                }
            }
        }
        return wordCount;
    }

    public static int getNumbersCount(String number) {
        int numberCount = 0;
        for (char digit = '0'; digit <= '9'; digit++) {
            for (int i = 0; i < number.length(); i++) {
                if (number.charAt(i) == digit) {
                    numberCount++;
                }
            }
        }
        return numberCount;
    }
}


