package com.bl.moodanalyzer;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;

public class MoodAnalyzerFactory {

    public static MoodAnalyzer createMoodAnalyzerUsingFactory() {

        try {
            Constructor constructor = Class.forName("com.bl.moodanalyzer.MoodAnalyzer").getConstructor();
            MoodAnalyzer moodAnalyzer = (MoodAnalyzer) constructor.newInstance();
            return moodAnalyzer;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Constructor getConstructor(String className, Class constructor) {
        try {
            Class moodAnalyzer = Class.forName(className);
            return moodAnalyzer.getConstructor(constructor);
        } catch (ClassNotFoundException e) {
            throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.CLASS_NOT_FOUND, e.getMessage());
        } catch (NoSuchMethodException e) {
            throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.NO_SUCH_METHOD, e.getMessage());
        }
    }

    public static MoodAnalyzer createMoodAnalyzerUsingFactory(String message) {
        try {
            Constructor constructor = Class.forName("com.bl.moodanalyzer.MoodAnalyzer").getConstructor(String.class);
            MoodAnalyzer factoryMood = (MoodAnalyzer) constructor.newInstance(message);
            return factoryMood;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String invokeMethod(MoodAnalyzer moodAnalyzer, String name) {
        try {
            return (String) moodAnalyzer.getClass().getDeclaredMethod(name).invoke(moodAnalyzer);
        } catch (NoSuchMethodException e) {
            throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.NO_SUCH_METHOD, e.getMessage());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Object invokeField(Object moodAnalyzer, String message, String fieldName) {

        try {
            Field field = moodAnalyzer.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(moodAnalyzer, message);
            return moodAnalyzer.getClass().getDeclaredMethod("analyzerMood").invoke(moodAnalyzer);
        } catch (NoSuchFieldException e) {
            throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.NO_SUCH_FIELD, e.getMessage());
        } catch (IllegalAccessException | NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.FIELD_ISSUE, e.getMessage());
        }
        return null;
    }

}