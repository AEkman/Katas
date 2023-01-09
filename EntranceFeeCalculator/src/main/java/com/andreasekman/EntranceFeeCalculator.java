package com.andreasekman;

public class EntranceFeeCalculator {

    private static final double CHILD_PRICE_BASE = 100;
    private static final double ADULT_PRICE_BASE = 100;

    public static double calculate(Visitor visitor, TicketType ticketType) {
        double fee = 0;

        // Calculate price for adults
        if (visitor.age() > 14 && TicketType.HALF_DAY == ticketType) {
            fee = ADULT_PRICE_BASE * 0.6;
        } else if (visitor.age() > 14 && TicketType.FULL_DAY == ticketType) {
            fee = ADULT_PRICE_BASE * 1.2;
        }

        // Calculate price for children
        if (visitor.age() <= 14 && TicketType.HALF_DAY == ticketType) {
            fee = CHILD_PRICE_BASE * 0.2;
        } else if (visitor.age() <= 14 && TicketType.FULL_DAY == ticketType) {
            fee = CHILD_PRICE_BASE * 0.5;
        }

        return fee;
    }

}