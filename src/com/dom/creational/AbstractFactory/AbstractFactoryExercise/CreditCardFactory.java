package com.dom.creational.AbstractFactory.AbstractFactoryExercise;

import java.util.Optional;

// Abstract factory
public abstract class CreditCardFactory {

    public static CreditCardFactory getCreditCardFactory(int creditScore) {
        if (creditScore > 650) {
            return new AmexFactory();
        } else {
            return new VisaFactory();
        }
    }

    public abstract Optional<CreditCard> getCreditCard(CardType cardType);

    public abstract Optional<Validator> getValidator(CardType cardType);

}
