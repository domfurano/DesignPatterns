package com.dom.creational.Factory.Demo;

import java.util.Optional;

public class WebsiteFactory {

    enum WebsiteType {
        BLOG, SHOP
    }

    public static Optional<Website> getWebsite(WebsiteType siteType) {
        switch (siteType) {
            case BLOG:
                return Optional.of(new Blog());
            case SHOP:
                return Optional.of(new Shop());
            default:
                return Optional.empty();
        }
    }

}
