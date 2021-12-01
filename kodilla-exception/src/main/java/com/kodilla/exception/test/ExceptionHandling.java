package com.kodilla.exception.test;

public class ExceptionHandling {


    public static void main(String[] args){
        SecondChallenge secondChallenge = new SecondChallenge();
        String result = null;


        try {
            result = secondChallenge.probablyIWillThrowException(2.0,4.0);
        } catch (Exception e){
            System.out.println("Oh no! Something went wrong! Error:" + e);
        } finally {
            System.out.println("The result is: " + result);
        }


    }
}
