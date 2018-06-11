package com.dom.creational.AbstractFactory.AbstractFactoryExercise;

import java.util.Optional;

public class AbstractFactoryDemo {

    public static void main(String[] args) {
        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(700);

        Optional<CreditCard> optionalCreditCard = abstractFactory.getCreditCard(CardType.PLATINUM);

        optionalCreditCard.ifPresent(creditCard -> {
            System.out.println(creditCard.getClass());

            CreditCardFactory abstractFactory1 = CreditCardFactory.getCreditCardFactory(600);

            Optional<CreditCard> optionalCreditCard1 = abstractFactory1.getCreditCard(CardType.GOLD);

            optionalCreditCard1.ifPresent(creditCard1 -> System.out.println(creditCard1.getClass()));

        });


    }
}
