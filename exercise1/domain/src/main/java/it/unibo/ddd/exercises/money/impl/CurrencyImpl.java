package it.unibo.ddd.exercises.money.impl;

import it.unibo.ddd.exercises.money.Currency;

public record CurrencyImpl (
    String name,
    String symbol,
    String acronym
) implements Currency {

    @Override
    public String getName() {
        return "";
    }

    @Override
    public String getSymbol() {
        return "";
    }

    @Override
    public String getAcronym() {
        return "";
    }
}
