package com.dom.structural.adapter.Demo;

import java.util.List;

public class AdapterDemo {

    public static void main(String[] args) {
        EmployeeClient client = new EmployeeClient();

        List<Employee> employeeList = client.getEmployeeList();

        System.out.println(employeeList);
    }

}
