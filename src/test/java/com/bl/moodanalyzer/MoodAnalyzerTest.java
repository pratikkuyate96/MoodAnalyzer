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

    @Test
    public void givenMoodAnalyzer_DefaultConstructor_whenProper_shouldReturnObject() {
        MoodAnalyzer moodAnalyzerObject = MoodAnalyzerFactory.createMoodAnalyzerUsingFactory();
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        Assert.assertEquals(moodAnalyzer, moodAnalyzerObject);
    }

    //TC 4.2
    @Test
    public void givenClassName_WhenImproper_ShouldThrowMoodAnalyzerException() {
        try {
            MoodAnalyzerFactory.getConstructor("com.bl.moodanalyzer.MoodAnalyzer1", String.class);
        } catch (MoodAnalyzerException e) {
            Assert.assertEquals(MoodAnalyzerException.ExceptionType.CLASS_NOT_FOUND, e.type);
        }
    }

    @Test
    public void givenConstructorName_WhenImproper_ShouldReturnMoodAnalyzerException() {
        try {
            MoodAnalyzerFactory.getConstructor("com.bl.moodanalyzer.MoodAnalyzer", Integer.class);
        } catch (MoodAnalyzerException e) {
            Assert.assertEquals(MoodAnalyzerException.ExceptionType.NO_SUCH_METHOD, e.type);
        }
    }

    //TC 5.1
    @Test
    public void givenParameterizedConstructor_WhenProper_ShouldReturnObjectEqual() {
        MoodAnalyzer moodAnalyzerObject = MoodAnalyzerFactory.createMoodAnalyzerUsingFactory("Mood is Happy");
        Assert.assertEquals(new MoodAnalyzer("Mood is Happy"), moodAnalyzerObject);
    }

    @Test
    public void givenParameterizedConstructor_WhenImproper_ShouldThrowMoodAnalyzerException() {
        try {
            MoodAnalyzerFactory.getConstructor("com.bl.moodanalyzer.MoodAnalyzer1", String.class);
        } catch (MoodAnalyzerException e) {
            Assert.assertEquals(MoodAnalyzerException.ExceptionType.CLASS_NOT_FOUND, e.type);
        }
    }

    @Test
    public void givenParameterizedConstructor_WhenImproper_ShouldReturnMoodAnalyzerException() {
        try {
            MoodAnalyzerFactory.getConstructor("com.bl.moodanalyzer.MoodAnalyzer", Character.class);
        } catch (MoodAnalyzerException e) {
            Assert.assertEquals(MoodAnalyzerException.ExceptionType.NO_SUCH_METHOD, e.type);
        }
    }

    //TC 6.1
    @Test
    public void givenHappyMessage_WhenProper_ShouldReturnHappyMood() {
        try {
            MoodAnalyzer moodAnalyzerObject = MoodAnalyzerFactory.createMoodAnalyzerUsingFactory("Mood is Happy");
            String mood = MoodAnalyzerFactory.invokeMethod(moodAnalyzerObject, "analyzeMood");
            Assert.assertEquals("HAPPY", mood);
        } catch (MoodAnalyzerException e) {
            e.printStackTrace();
        }
    }

    //TC 6.2
    @Test
    public void givenHappyMessage_WhenImProper_ShouldThrowException() {
        try {
            MoodAnalyzer moodAnalyzerObject = MoodAnalyzerFactory.createMoodAnalyzerUsingFactory("Mood is Happy");
            MoodAnalyzerFactory.invokeMethod(moodAnalyzerObject, "analyzeMood");
        } catch (MoodAnalyzerException e) {
            Assert.assertEquals(MoodAnalyzerException.ExceptionType.NO_SUCH_METHOD, e.type);
        }
    }

}