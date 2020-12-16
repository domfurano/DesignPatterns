package com.dom.structural.proxy.demo;

public class TwitterServiceImpl implements TwitterService {
    @Override
    public String getTimeLine(String screenName) {
        return "Vote for Yang! #yanggang2020";
    }

    @Override
    public void postToTimeline(String screenName, String message) {

    }
}
