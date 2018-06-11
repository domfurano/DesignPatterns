package com.dom.structural.adapter.Demo;

public class EmployeeAdapterCSV implements Employee {
    private final EmployeeCSV employeeCSV;

    EmployeeAdapterCSV(EmployeeCSV employeeCSV) {
        this.employeeCSV = employeeCSV;
    }

    @Override
    public String getId() {
        return employeeCSV.getId();
    }

    @Override
    public String getFirstName() {
        return employeeCSV.getFirstName();
    }

    @Override
    public String getLastName() {
        return employeeCSV.getLastName();
    }

    @Override
    public String getEmail() {
        return employeeCSV.getEmail();
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("ID: ").append(this.employeeCSV.getId())
                .append("First name: ").append(this.employeeCSV.getFirstName())
                .append("Last name: ").append(this.employeeCSV.getLastName())
                .append("Email: ").append(this.employeeCSV.getEmail())
                .toString();
    }
}
