package com.bl.moodanalyzer;

    public class MoodAnalyzerException extends Exception {
        public enum ExceptionType {
            EMPTY, NULL
        };
        public MoodAnalyzerException(ExceptionType type, String message){
            super(message);
        }
    }