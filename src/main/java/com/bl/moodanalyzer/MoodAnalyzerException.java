package com.bl.moodanalyzer;

    public class MoodAnalyzerException extends RuntimeException {
        public enum ExceptionType {
            EMPTY, NULL,CLASS_NOT_FOUND,NO_SUCH_METHOD, FIELD_ISSUE, NO_SUCH_FIELD;
        }

        public ExceptionType type;
        public MoodAnalyzerException(ExceptionType type, String message) {
            super(message);
            this.type=type;
        }
    }