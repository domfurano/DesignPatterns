package com.dom.creational.Factory.Demo;

import java.util.Optional;

public class FactoryDemo {

    public static void main(String[] args) {
        Optional<Website> website = WebsiteFactory.getWebsite(WebsiteFactory.WebsiteType.BLOG);

        website.ifPresent(site -> System.out.println(site.getPages()));

        website = WebsiteFactory.getWebsite(WebsiteFactory.WebsiteType.SHOP);

        website.ifPresent(site -> System.out.println(site.getPages()));
    }

}
