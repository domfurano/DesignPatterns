package com.dom.structural.bridge.DemoPrinter;

import java.util.List;

abstract class Printer {
    String print(Formatter formatter) {
        return formatter.format(getHeader(), getDetails());
    }

    abstract String getHeader();

    abstract List<Detail> getDetails();
}
