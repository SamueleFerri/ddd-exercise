package it.unibo.ddd.cqrs.impl;

import io.reactivex.rxjava3.core.Observable;
import it.unibo.ddd.Variation;
import it.unibo.ddd.cqrs.CounterWriter;
import it.unibo.ddd.impl.VariationImpl;

import java.time.Clock;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/** Write model (cf. steps 1-2 of cqrs/walkthrough.md). */
public class CounterWriterImpl implements CounterWriter {
    private final Clock clock;
    private final LinkedList<Variation> variations = new LinkedList<>();

    // TODO: add the event store, i.e. the list of variations, and a Subject to publish them (cf. CounterImpl)
    //       notice that there should be no field storing the current value

    public CounterWriterImpl(Clock clock) {
        this.clock = Objects.requireNonNull(clock);
    }

    public CounterWriterImpl() {
        this(Clock.systemUTC());
    }

    @Override
    public void setValue(long value) {
        // TODO: compute the current value out of the last variation (or 0), then store and publish a new variation
        if (this.variations.isEmpty()) {
            this.variations.add(new VariationImpl(0, value, clock.instant()));
        } else {
            this.variations.add(new VariationImpl(variations.getLast().after(), value, clock.instant()));
        }
    }

    @Override
    public Iterable<Variation> getVariations() {
        // TODO: return the whole history, without letting callers modify it
        return List.copyOf(this.variations);
        //throw new UnsupportedOperationException("TODO: not implemented yet");
    }

    @Override
    public Observable<Variation> onVariation() {
        throw new UnsupportedOperationException("TODO: not implemented yet");
    }
}
