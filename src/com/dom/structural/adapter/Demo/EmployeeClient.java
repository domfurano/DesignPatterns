package com.dom.structural.adapter.Demo;

import java.util.ArrayList;
import java.util.List;

class EmployeeClient {
    List<Employee> getEmployeeList() {
        ArrayList<Employee> employees = new ArrayList<>();

        Employee employeeFromDB = new EmployeeDB("1234", "John", "Wick", "john@wick.com");

        employees.add(employeeFromDB);

        EmployeeLdap employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Hand", "han@solo.com");

        employees.add(new EmployeeAdapterLdap(employeeFromLdap));

        EmployeeCSV employeeCSV = new EmployeeCSV("567,Sherlock,Holmes,sherlcock@holmes.com");

        employees.add(new EmployeeAdapterCSV(employeeCSV));

        return employees;
    }
}
