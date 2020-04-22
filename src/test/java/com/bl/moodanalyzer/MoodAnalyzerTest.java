package com.bl.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void givenSadMood_ShouldReturnSad() {
        MoodAnalyzer moodanalyzer = new MoodAnalyzer();
        String mood = moodanalyzer.analyzerMood("I am in happy mood");
        Assert.assertEquals("HAPPY",mood);
    }
}