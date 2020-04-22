package com.bl.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void givenSadMood_ShouldReturnSad() {
        MoodAnalyzer moodanalyzer = new MoodAnalyzer("I am in sad mood");
        String mood = moodanalyzer.analyzerMood();
        Assert.assertEquals("SAD",mood);
    }

    @Test
    public void givenHappyMood_ShouldReturnHappy() {
        MoodAnalyzer moodanalyzer = new MoodAnalyzer("I am in happy mood");
        String mood = moodanalyzer.analyzerMood();
        Assert.assertEquals("HAPPY",mood);
    }

    @Test
    public void givenNullMood_ShouldReturnHappy() {
        MoodAnalyzer moodanalyzer = new MoodAnalyzer(null);
        String mood = moodanalyzer.analyzerMood();
        Assert.assertEquals("HAPPY",mood);
    }
}