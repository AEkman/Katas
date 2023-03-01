package com.andreasekman;public class ChildFeeStrategy{private static final double CHILD_PRICE_BASE = 100;private static double childeFeeCalculator(com.andreasekman.TicketType ticketType, double fee, com.andreasekman.Visitor visitor) {
        if (com.andreasekman.TicketType.HALF_DAY == ticketType) {
            fee = CHILD_PRICE_BASE * 0.2;
        } else if (com.andreasekman.TicketType.FULL_DAY == ticketType) {
            fee = CHILD_PRICE_BASE * 0.5;
        }
        return fee;
    }}