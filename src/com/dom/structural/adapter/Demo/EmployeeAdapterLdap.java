package com.dom.structural.adapter.Demo;

public class EmployeeAdapterLdap implements Employee {
    private final EmployeeLdap employeeFromLdap;

    EmployeeAdapterLdap(EmployeeLdap employeeFromLdap) {
        this.employeeFromLdap = employeeFromLdap;
    }

    @Override
    public String getId() {
        return employeeFromLdap.getCn();
    }

    @Override
    public String getFirstName() {
        return employeeFromLdap.getGivenName();
    }

    @Override
    public String getLastName() {
        return employeeFromLdap.getSurname();
    }

    @Override
    public String getEmail() {
        return employeeFromLdap.getMail();
    }

    // Maybe turning this pattern into a Decorator
    @Override
    public String toString() {
        return new StringBuilder().append("ID: ").append(employeeFromLdap.getCn())
                .append("First name: ").append(employeeFromLdap.getGivenName())
                .append("Last name: ").append(employeeFromLdap.getSurname())
                .append("Email: ").append(employeeFromLdap.getMail())
                .toString();
    }
}
