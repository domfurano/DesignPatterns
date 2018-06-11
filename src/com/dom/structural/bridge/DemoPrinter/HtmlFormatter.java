package com.dom.structural.bridge.DemoPrinter;

import java.util.List;

public class HtmlFormatter implements Formatter {
    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder builder = new StringBuilder();
        builder.append("<html>");
        builder.append("<body>");
        builder.append("<h1>");
        builder.append(header);
        builder.append("</h1>");
        for (Detail detail : details) {
            builder.append("<p>");
            builder.append(detail.getLabel());
            builder.append("<strong>");
            builder.append(detail.getValue());
            builder.append("</strong");
            builder.append("</p>");
        }
        builder.append("</body>");
        builder.append("</html>");
        return builder.toString();
    }
}
