package com.dom.structural.proxy.demo;

public interface TwitterService {
    String getTimeLine(String screenName);
    void postToTimeline(String screenName, String message);
}
