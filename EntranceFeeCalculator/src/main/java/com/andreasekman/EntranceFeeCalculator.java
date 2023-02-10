package com.andreasekman;

import java.util.List;
import java.util.Optional;

public class EntranceFeeCalculator {

    public static double calculate(Visitor visitor, TicketType ticketType) {

        List<FeeStrategy> feeStrategies = List.of(new AdultFeeCalculator(),
                new ChildFeeCalculator());

        Optional<FeeStrategy> fee = feeStrategies.stream()
                                                 .filter(feeStrategy -> feeStrategy.accepts(visitor))
                                                 .reduce((feeStrategy, feeStrategy2) -> {
                                                     throw new IllegalStateException("There should only be one fee here!");
                                                 });

        return fee.orElseThrow(IllegalStateException::new)
                  .calculate(ticketType);

    }

}