package com.dom.structural.facade.DemoJDBCWithoutFacade;

import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

public class DbSingleton {

    private static volatile DbSingleton instance = null;

    private Connection conn = null;

    private DbSingleton () {
        try {
            DriverManager.registerDriver(new Driver() {
                @Override
                public Connection connect(String url, Properties info) throws SQLException {
                    return null;
                }

                @Override
                public boolean acceptsURL(String url) throws SQLException {
                    return false;
                }

                @Override
                public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
                    return new DriverPropertyInfo[0];
                }

                @Override
                public int getMajorVersion() {
                    return 0;
                }

                @Override
                public int getMinorVersion() {
                    return 0;
                }

                @Override
                public boolean jdbcCompliant() {
                    return false;
                }

                @Override
                public Logger getParentLogger() throws SQLFeatureNotSupportedException {
                    return null;
                }
            });
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static DbSingleton getInstance() {
        if(instance == null) {
            synchronized(DbSingleton.class) {
                if (instance == null) {
                    instance = new DbSingleton();
                }
            }
        }

        return instance;
    }

    public Connection getConnection() throws SQLException {
        if(conn == null || conn.isClosed()) {
            synchronized (DbSingleton.class) {
                if(conn == null || conn.isClosed()) {
                    try {
                        String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";

                        conn = DriverManager.getConnection(dbUrl);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        return conn;
    }
}
