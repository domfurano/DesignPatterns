package com.dom.structural.bridge.DemoPrinter;

import java.util.ArrayList;
import java.util.List;

class MoviePrinter extends Printer {

    private Movie movie;

    MoviePrinter(Movie movie) {
        this.movie = movie;
    }

    @Override
    String getHeader() {
        return movie.getClassification();
    }

    @Override
    List<Detail> getDetails() {
        List<Detail> details = new ArrayList<>();
        details.add(new Detail("Title", movie.getTitle()));
        details.add(new Detail("Year", movie.getYear()));
        details.add(new Detail("Runtime", movie.getRuntime()));
        return details;
    }
}
