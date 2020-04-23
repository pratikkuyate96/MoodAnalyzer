package com.bl.moodanalyzer;

public class MoodAnalyzer {
     String message;

     public MoodAnalyzer() {

     }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyzerMood() throws MoodAnalyzerException{
        try {
            if(message.equals("")) {
                throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.EMPTY,"EMPTY");
            }
            if (message.contains("SAD")) {
                return "SAD";
            }else {
                return "HAPPY";
            }

           }catch (NullPointerException e) {
             throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.NULL,"NULL");
        }
    }
}

