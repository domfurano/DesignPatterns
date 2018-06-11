package com.dom.structural.adapter.Demo;

import java.util.StringTokenizer;

public class EmployeeCSV {

    private int id;
    private String firstName;
    private String lastName;
    private String emailAddress;

    EmployeeCSV(String values) {
        StringTokenizer tokenizer = new StringTokenizer(values, ",");
        if (tokenizer.hasMoreElements()) {
            this.id = Integer.parseInt(tokenizer.nextToken());
        }
        if (tokenizer.hasMoreElements()) {
            this.firstName = tokenizer.nextToken();
        }
        if (tokenizer.hasMoreElements()) {
            this.lastName = tokenizer.nextToken();
        }
        if (tokenizer.hasMoreElements()) {
            this.emailAddress = tokenizer.nextToken();
        }
    }

    public String getId() {
        return String.valueOf(id);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getEmail() {
        return this.emailAddress;
    }
}
