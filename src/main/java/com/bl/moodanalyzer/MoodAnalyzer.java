package com.bl.moodanalyzer;
public class MoodAnalyzer {
    String message;

    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyzerMood() throws MoodAnalyzerException {
        return analyzerMood(this.message);
    }

    public String analyzerMood(String message) throws MoodAnalyzerException {
        try {
            if (message.equals("")) {
                throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.EMPTY, "EMPTY");
            } else if (message.contains("SAD")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.NULL, "NULL");
        }
    }


    //Override
    public boolean equals(Object obj) {
        if (obj instanceof MoodAnalyzer){
            return true;
        }
        return false;
    }
}