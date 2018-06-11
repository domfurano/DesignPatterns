package com.dom.structural.facade.DemoJDBCWithoutFacade;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcFacade {

    DbSingleton instance = null;

    JdbcFacade() {
        instance = DbSingleton.getInstance();
    }

    public int createTable() {
        int count = 0;
        try {
            try (Connection connection = instance.getConnection()) {
                try (Statement statement = connection.createStatement()) {
                    count = statement.executeUpdate("CREATE TABLE Address (ID INTEGER, StreetName VARCHAR(20), City VARCHAR(20))");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    public int insertIntotable() {
        int count = 0;
        try {
            try (Connection connection = instance.getConnection()) {
                try (Statement statement = connection.createStatement()) {
                    count = statement.executeUpdate("INSERT INTO Address (ID, StreetName, City) values (1, '1234 Some street', 'Layton')");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    public List<Address> getAddresses() {
        List<Address> addresses = new ArrayList<>();

        try {
            try (Connection connection = instance.getConnection()) {
                try (Statement statement = connection.createStatement()) {
                    try (ResultSet rs = statement.executeQuery("SELECT * FROM Address")) {
                        while (rs.next()) {
                            System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
                            Address address = new Address();
                            address.setId(rs.getString(1));
                            address.setStreetName(rs.getString(2));
                            address.setCity(rs.getString(3));
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return addresses;
    }

}
