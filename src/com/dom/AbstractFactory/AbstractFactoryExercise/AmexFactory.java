package com.dom.AbstractFactory.AbstractFactoryExercise;

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
    public Validator getValidator(CardType cardType) {
        return null;
    }
}
