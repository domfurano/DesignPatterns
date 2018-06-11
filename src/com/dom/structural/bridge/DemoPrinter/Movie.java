package com.dom.structural.bridge.DemoPrinter;

class Movie {
    private String classification;
    private String runtime;
    private String title;
    private String year;

    String getClassification() {
        return classification;
    }

    void setClassification(String classification) {
        this.classification = classification;
    }

    String getRuntime() {
        return runtime;
    }

    void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    String getTitle() {
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    String getYear() {
        return year;
    }

    void setYear(String year) {
        this.year = year;
    }
}
