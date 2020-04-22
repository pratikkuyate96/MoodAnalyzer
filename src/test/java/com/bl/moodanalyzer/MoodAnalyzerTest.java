package com.bl.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void givenHappyMood_ShouldReturnHappy() {
        MoodAnalyzer moodanalyzer = new MoodAnalyzer();
        String mood = moodanalyzer.analyzerMood("I am in sad mood");
        Assert.assertEquals("SAD",mood);
    }

}