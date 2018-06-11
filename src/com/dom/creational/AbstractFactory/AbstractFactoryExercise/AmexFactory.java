package com.dom.creational.AbstractFactory.AbstractFactoryExercise;

import java.util.Optional;

public class AmexFactory extends CreditCardFactory {
    @Override
    public Optional<CreditCard> getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return Optional.of(new AmexGoldCreditCard());
            case PLATINUM:
                return Optional.of(new AmexPlatinumCreditCard());
        }
        return Optional.empty();
    }

    @Override
    public Optional<Validator> getValidator(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return Optional.of(new AmexGoldValidator());
            case PLATINUM:
                return Optional.of(new AmexPlatinumValidator());
        }
        return Optional.empty();
    }
}
