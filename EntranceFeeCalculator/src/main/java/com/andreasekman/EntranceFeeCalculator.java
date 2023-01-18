package com.andreasekman;

import java.util.List;
import java.util.Optional;

public class EntranceFeeCalculator {

    private static final List<FeeStrategy> feeStrategies = List.of(
            new AdultFeeCalculator(),
            new ChildFeeCalculator()
    );

    public static double calculate(Visitor visitor, TicketType ticketType) {
        Optional<FeeStrategy> strategy = feeStrategies.stream()
                                                      .filter(feeStrategy -> feeStrategy.accepts(visitor))
                                                      .reduce((feeStrategy, feeStrategy2) -> {
                                                          throw new IllegalStateException("There should only be one");
                                                      });

        return strategy.orElseThrow(IllegalAccessError::new)
                       .calculate(ticketType);
    }

}