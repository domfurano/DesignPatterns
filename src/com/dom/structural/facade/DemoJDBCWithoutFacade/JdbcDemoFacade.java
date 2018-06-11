package com.dom.structural.facade.DemoJDBCWithoutFacade;

public class JdbcDemoFacade {

    public static void main(String[] args) {
        JdbcFacade jdbcFacade = new JdbcFacade();

        jdbcFacade.createTable();

        jdbcFacade.insertIntotable();

        for (Address address: jdbcFacade.getAddresses()) {
            System.out.println(address);
        }
    }

}
