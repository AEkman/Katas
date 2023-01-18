package com.andreasekman;

public class ChildFeeCalculator implements FeeStrategy {
    private static final double CHILD_PRICE_BASE = 100;

    public double calculate(TicketType ticketType) {
        if (TicketType.HALF_DAY == ticketType) {
            return CHILD_PRICE_BASE * 0.2;
        } else if (TicketType.FULL_DAY == ticketType) {
            return CHILD_PRICE_BASE * 0.5;
        }
        throw new IllegalStateException("Shouldn't reach here");
    }

    @Override
    public boolean accepts(Visitor visitor) {
        return visitor.age() < 14;
    }
}