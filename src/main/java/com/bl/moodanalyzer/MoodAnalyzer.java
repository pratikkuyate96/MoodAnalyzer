package com.bl.moodanalyzer;

public class MoodAnalyzer {
    private String message;

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyzerMood() {
            if (message.contains("HAPPY")) {
                return "HAPPY";
            }
            return "SAD";
    }
}