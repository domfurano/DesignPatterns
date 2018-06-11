package com.dom.creational.Factory.Demo;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

    protected List<Page> pages;

    public Website() {
        this.pages = new ArrayList<>();
        this.createWebsite();
    }

    public List<Page> getPages() {
        return pages;
    }

    public abstract void createWebsite();
}
