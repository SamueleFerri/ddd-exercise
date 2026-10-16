package it.unibo.ddd.exercises.money;

import java.time.Instant;

public interface ExchangeRateService {
    ExchangeRate exchangeRateFor(Currency src, Currency dst, Instant when);

    default ExchangeRate currentExchangeRateFor(Currency src, Currency dst) {
        return exchangeRateFor(src, dst, Instant.now());
    }
}
