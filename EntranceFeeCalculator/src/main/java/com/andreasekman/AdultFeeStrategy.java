package com.andreasekman;public class AdultFeeStrategy{private static final double ADULT_PRICE_BASE = 100;private static double adultFeeCalculator(com.andreasekman.TicketType ticketType, double fee, com.andreasekman.Visitor visitor) {
        if (com.andreasekman.TicketType.HALF_DAY == ticketType) {
            fee = ADULT_PRICE_BASE * 0.6;
        } else if (com.andreasekman.TicketType.FULL_DAY == ticketType) {
            fee = ADULT_PRICE_BASE * 1.2;
        }
        return fee;
    }}