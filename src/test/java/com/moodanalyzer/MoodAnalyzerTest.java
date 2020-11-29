package com.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

public class MoodAnalyzerTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        System.out.println("Enter your message");
        Scanner scanner = new Scanner(System.in);

        String mood = moodAnalyzer.analyzeMood("This is sad message");
        Assert.assertEquals("SAD", mood);
    }
    @Test
    public void givenMessage_WhenNotSad_ShouldReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyzeMood("This is happy message");
        Assert.assertEquals("HAPPY", mood);
    }
}
