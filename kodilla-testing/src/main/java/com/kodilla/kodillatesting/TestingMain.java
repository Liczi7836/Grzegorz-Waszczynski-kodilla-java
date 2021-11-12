package com.kodilla.kodillatesting;

import com.kodilla.kodillatesting.calculator.Calculator;
import com.kodilla.kodillatesting.user.SimpleUser;
public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        int c = calculator.add(24,16);
        int d = calculator.subtract(24,16);

        if(c == 40){
            System.out.println("Add: It's working!");
        } else {
            System.out.println("Add: It's not working.");
        }
        if(d == 8){
            System.out.println("Subtract: It's working!");
        } else {
            System.out.println("Subtract: It's not working.");
        }


    }
}
