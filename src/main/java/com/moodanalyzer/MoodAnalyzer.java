package com.moodanalyzer;

public class MoodAnalyzer {
    public static void main(String[] args) {
        System.out.println("Welcome to mood Analyzer process");
    }

    public String analyzeMood(String message) {
        if (message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
