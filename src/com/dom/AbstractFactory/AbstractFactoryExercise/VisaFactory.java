package com.dom.AbstractFactory.AbstractFactoryExercise;

import java.util.Optional;

public class VisaFactory extends CreditCardFactory {

    @Override
    public Optional<CreditCard> getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return Optional.of(new VisaGoldCreditCard());
            case PLATINUM:
                return Optional.of(new VisaBlackCreditCard());
        }
        return Optional.empty();
    }

    @Override
    public Validator getValidator(CardType cardType) {
        return new VisaValidator();
    }

}
