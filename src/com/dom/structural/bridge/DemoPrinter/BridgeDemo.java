package com.dom.structural.bridge.DemoPrinter;


import java.io.IOException;

public class BridgeDemo {
    public static void main(String[] args) throws IOException {
        Movie movie = new Movie();
        movie.setClassification("Action");
        movie.setTitle("John Wick");
        movie.setRuntime("2:15");
        movie.setYear("2014");

        Formatter printFormatter = new PrintFormatter();
        Printer moviePrinter = new MoviePrinter(movie);

        String s = moviePrinter.print(printFormatter);
        System.out.println(s);

        HtmlFormatter htmlFormatter = new HtmlFormatter();
        String sHtml = moviePrinter.print(htmlFormatter);

        System.out.println(sHtml);

    }
}
