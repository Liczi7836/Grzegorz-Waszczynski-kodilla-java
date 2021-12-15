package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String text, String text2, PoemDecorator poemDecorator){
        String result = poemDecorator.decorate(text, text2 );

        System.out.println("Number: " + result + " + Number: " + result);
    }
}
