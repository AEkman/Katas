package com.andreasekman;

public class AdultFeeCalculator implements FeeStrategy {
    private static final double ADULT_PRICE_BASE = 100;

    @Override
    public double calculate(TicketType ticketType) {
        if (TicketType.HALF_DAY == ticketType) {
            return ADULT_PRICE_BASE * 0.6;
        } else if (TicketType.FULL_DAY == ticketType) {
            return ADULT_PRICE_BASE * 1.2;
        }
        throw new IllegalStateException("Not reaching here");
    }

    @Override
    public boolean accepts(Visitor visitor) {
        return visitor.age() > 14;
    }
}