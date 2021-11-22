package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;

@SpringBootApplication
public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify(" + Not number", " Also not number", (text, text2) -> text+text2);
        poemBeautifier.beautify("Uppercase + ","UPPERCASE", (text, text2) -> text.toUpperCase(Locale.ROOT)+text2.toLowerCase(Locale.ROOT));
        poemBeautifier.beautify("123","456",(text, text2) -> text + text2 +text + text2);
        poemBeautifier.beautify("10","20", (text, text2) -> text + text + text2);
    }
}
