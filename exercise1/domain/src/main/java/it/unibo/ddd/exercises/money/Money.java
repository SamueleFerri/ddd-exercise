package it.unibo.ddd.exercises.money;

import java.math.BigDecimal;

// value object
public interface Money {
    Currency getCurrency();
    BigDecimal getAmount();
}
