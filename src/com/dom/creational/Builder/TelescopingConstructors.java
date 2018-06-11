package com.dom.creational.builder;

public class TelescopingConstructors {

    private String param1;
    private String param2;
    private String param3;
    private String param4;

    public TelescopingConstructors(String param1) {
        this.param1 = param1;
    }

    public TelescopingConstructors(String param1, String param2) {
        this(param1);
        this.param2 = param2;
    }

    public TelescopingConstructors(String param1, String param2, String param3) {
        this(param1, param2);
        this.param3 = param3;
    }

    public TelescopingConstructors(String param1, String param2, String param3, String param4) {
        this(param1, param2, param3);
        this.param4 = param4;
    }

    public String getParam1() {
        return param1;
    }

    public String getParam2() {
        return param2;
    }

    public String getParam3() {
        return param3;
    }

    public String getParam4() {
        return param4;
    }

}
