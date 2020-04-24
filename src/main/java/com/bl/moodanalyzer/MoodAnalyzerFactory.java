//package com.bl.moodanalyzer;
//
//public class MoodAnalyzerFactory {
//    public static MoodAnalyser CreateMoodAnalyser(String message) {
//
//        try {
//
//            Class<?> moodAnalyzer = Class.forName("com.bridgelabz.moodanalyser.MoodAnalyser").getConstructor();
//
//            Object reflectionObject = constructor.newInstance();
//
//            return  (MoodAnalyser) reflectionObject;
//
//        } catch (NoSuchMethodException e) {
//
//            e.printStackTrace();
//
//        } catch (ClassNotFoundException e) {
//
//            e.printStackTrace();
//
//        } catch (IllegalAccessException e) {
//
//            e.printStackTrace();
//
//        } catch (InstantiationException e) {
//
//            e.printStackTrace();
//
//        } catch (InvocationTargetException e) {
//
//            e.printStackTrace();
//
//        }
//
//        return null;
//
//    }
//
//}
