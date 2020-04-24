package com.bl.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void givenSadMood_ShouldReturnSad() throws MoodAnalyzerException {
        MoodAnalyzer moodanalyzer = new MoodAnalyzer("SAD");
        String mood = moodanalyzer.analyzerMood();
        Assert.assertEquals("SAD",mood);
    }

    @Test
    public void givenHappyMood_ShouldReturnHappy() throws  MoodAnalyzerException {
        MoodAnalyzer moodanalyzer = new MoodAnalyzer("HAPPY");
        String mood = moodanalyzer.analyzerMood();
        Assert.assertEquals("HAPPY",mood);
    }

    @Test
    public void givenSadMood_ShouldReturnSad1() throws MoodAnalyzerException {
        MoodAnalyzer moodanalyzer = new MoodAnalyzer();
        String mood = moodanalyzer.analyzerMood("SAD");
        Assert.assertEquals("SAD",mood);
    }

    @Test
    public void givenHappyMood_ShouldReturnHappy1() throws  MoodAnalyzerException {
        MoodAnalyzer moodanalyzer = new MoodAnalyzer();
        String mood = moodanalyzer.analyzerMood("HAPPY");
        Assert.assertEquals("HAPPY",mood);
    }

    @Test
    public void givenNullMood_ShouldReturnHappy() throws  MoodAnalyzerException {
            MoodAnalyzer moodanalyzer = new MoodAnalyzer(null);
        try {
           String mood = moodanalyzer.analyzerMood();
            Assert.assertEquals("HAPPY",mood);
        } catch (MoodAnalyzerException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenNullMood_ShouldReturnExceptionMessage() throws MoodAnalyzerException {
        try {
            MoodAnalyzer moodanalyzer = new MoodAnalyzer(null);
            String mood = moodanalyzer.analyzerMood();
        }catch (MoodAnalyzerException e) {
            Assert.assertEquals("NULL", e.getMessage());
        }
    }

    @Test
    public void givenEmpty_ShouldReturnExceptionMessage() throws MoodAnalyzerException {
        try {
            MoodAnalyzer moodanalyzer = new MoodAnalyzer("");
            String mood = moodanalyzer.analyzerMood();
        }catch (MoodAnalyzerException e) {
            Assert.assertEquals("EMPTY", e.getMessage());
        }
    }
}